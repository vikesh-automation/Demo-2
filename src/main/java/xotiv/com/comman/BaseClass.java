package xotiv.com.comman;

import xotiv.com.page.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import xotiv.com.rmrProject.LoginPages;
import xotiv.com.rmrProject.RmrHomePage;

import java.lang.reflect.Method;
import java.util.Properties;

public class BaseClass {

	protected Webutil we;
	Properties prop;



	@BeforeSuite
	public void setUp() {
		we = new Webutil();
		we.getExtentReport();
		prop= we.getProperties();
		//we.getCreateTest("initBrowser");
	}
	@BeforeMethod()
	public void test(Method method){
		we.getCreateTest(method.getName());
		we.getPage(prop);
		we.navigate(prop.getProperty("url"));
        LoginPages login= new LoginPages(we);
		login.clickOnDisclaimer();
		login.signInButton();
		login.inputUserEmailId(prop.getProperty("username"));
		login.inputUserPassword(prop.getProperty("password"));
		login.clickOnLoginButton();
	}
	@AfterMethod
	public void afterTest(){
		we.flush();
	}
	public void beforeTest(){

	}
}
