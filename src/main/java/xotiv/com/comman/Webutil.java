package xotiv.com.comman;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Webutil {

	private static final Logger logger = Logger.getLogger(Webutil.class.getName());
	public Playwright playwright;
	public Browser browser;
	public Page page;
	public ExtentReports  extentReports;
	public ExtentHtmlReporter htmlReporter;
	public ExtentTest test;


	Properties properties;

	public  Logger getLogger() {
		return logger;
	}
	// public void info(String methodName){
	// logger.info("\u001B[32m" +methodName + " Success !!" + "\u001B[0m");
	//}
	public String getMethodName() {
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}

	public void getPage(Properties prop) {
		String browserType= prop.getProperty("browser");
		playwright = Playwright.create();
		switch (browserType) {
		case "chrome":
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
			test.log(Status.INFO,browserType+ " launched success !!");
			break;
		case "chromium":
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		case "firefox":
			browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setChannel("firefox").setHeadless(false));
			break;
		case "safari":
			browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setChannel("safari").setHeadless(false));
			break;
		default:
			break;
		}
	}
	public Webutil(){
		readProperties();
	}
	public Properties getProperties(){
		return properties;
	}


	public  void readProperties() {
		properties = new Properties();
		try {
			properties.load(new FileInputStream("./src/test/java/resource/rmr.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void navigate(String url){
		page =browser.newPage();
		page.navigate(url);
		test.log(Status.INFO,url+" Hit success !!");
	}
	public void click(String locator,String msg){
		page.click(locator);
		test.log(Status.INFO,"click on "+msg);
	}
	public void sendKeys(String locator, String value,String msg){
		page.fill(locator ,value);
		test.log(Status.INFO,msg);

	}
	public void clear(String locator, String msg) {
		page.locator(locator).focus();
		test.log(Status.INFO,msg);
	}
	public void navigateToBackPage(String msg){
		page.goBack();
		test.log(Status.INFO,"Go to Navigate Back Page "+ msg);
	}
	public void dblclick(String locator, String msg){
		page.dblclick(locator);
		test.log(Status.INFO,"dblclick on"+msg);
	}
	public void selectOnCheckBox(String locator, String msg){
		page.check(locator);
		test.log(Status.INFO,"Select the check box Option"+msg);
	}
	public void UnSelectCheckBox(String locator, String msg){
		page.uncheck(locator);
		test.log(Status.INFO, "UnSelect the check box Option");
	}
	public String getTextVisible(String locator, String expectedText){
		String actualText= page.innerText(locator);
		System.out.println(actualText);
		if(actualText.equals(expectedText)){
			test.log(Status.PASS,"Actual text : "+actualText +" Expected text : "+expectedText);
		}else{
			test.log(Status.FAIL,"Actual text : "+actualText +" Expected text : "+expectedText);
		}
		return actualText;
	}

	public void verifyTitle(String expectedTitle) {
		String actualTitle = page.title(); // Get the page title
		System.out.println(actualTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Passed: Page Title is verified and found correct");
		} else {
			System.out.println("Failed: Page Title is verified and found incorrect");
		}
	}
	
	public void verifyGetText(String locator, String expectedText) {
        String actualText = page.locator(locator).textContent();
		System.out.println(actualText);
//        actualText = actualText != null ? actualText.trim() : "";
//        expectedText = expectedText.trim();
        if (actualText.equals(expectedText)) {        	
        	test.log(Status.PASS, "Actual disabled status: " + actualText + " | Expected disabled status: " + expectedText);
		} else {
			test.log(Status.FAIL, "Actual disabled status: " + actualText + " | Expected disabled status: " + expectedText);
        }
    }

	public  void timeout(){
		page.setDefaultTimeout(1000);
	}

	public boolean isDisabled(String locator, String expectedText) {
		boolean actualDisabledStatus = page.locator(locator).isDisabled();
		boolean expectedDisabledStatus = Boolean.parseBoolean(expectedText);
		System.out.println(actualDisabledStatus);
		if (actualDisabledStatus == expectedDisabledStatus) {
			test.log(Status.PASS, "Actual disabled status: " + actualDisabledStatus + " | Expected disabled status: " + expectedDisabledStatus);
		} else {
			test.log(Status.FAIL, "Actual disabled status: " + actualDisabledStatus + " | Expected disabled status: " + expectedDisabledStatus);
		}

		return actualDisabledStatus;
	}

	public void getExtentReport(){
		extentReports = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("report/extentReport.html");
		// htmlReporter.config().setDocumentTitle("Your Report Title");
		htmlReporter.config().setReportName("PMS");
		htmlReporter.config().setTheme(Theme.DARK); // or Theme.DARK
		extentReports.attachReporter(htmlReporter);
		//htmlReporter.config().setCSS("./src/test/java/resource/test.css");
	}
	public void getCreateTest(String reportName){
		test= extentReports.createTest(reportName);
	}
	public  void flush(){ extentReports.flush(); }
	
	public void printAllTableData(String locator, String taName) {
			Locator rows = page.locator(locator);
			int rowCount = rows.count();
			if (rowCount > 0) {
				test.log(Status.PASS, " Pass: Get all data of the list successfully");
				// Iterate over each row and print its text
				for (int i = 0; i < rowCount; i++) {
					String text = rows.nth(i).innerText();
					System.out.println(text);
				}
			} else {
		test.log(Status.FAIL, "Fail: Get all data of the list successfully");
			}
		}

	private void printMessage(String message) {
		System.out.println(message);
    }
		public int getTableDataRowCount(String locator, String elementsName) {
			// Locate the table rows using the provided XPath
			Locator tableRows = page.locator(locator);

			// Get the count of the table rows
			int countTableRow = tableRows.count();

			// Print the elements name and row count
			System.out.println(elementsName + " found successfully with row count: " + countTableRow);

			// Return the count of the rows
			return countTableRow;
	}

}
