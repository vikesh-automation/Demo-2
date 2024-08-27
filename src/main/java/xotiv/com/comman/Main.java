package xotiv.com.comman;

import java.util.List;


import com.microsoft.playwright.*;

public class Main {
    public static void main(String[] args) {
//
//            Playwright playwright = Playwright.create();
//            Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//            Page page =browser.newPage();
//            page.navigate("https://www.amazon.in/");
//            System.out.println("hello");
//            page.fill("//input[@id='twotabsearchtextbox']","shoes for man");
//            page.keyboard().press("Enter");


        Playwright playwright=  Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();
        page.navigate("https://readmyrhythm-uat.vercel.app/");
        page.locator("//span[text()='Ok']").click();

//        Locator sign_In_Button = page.locator("//span[text()='Sign In']");
//        sign_In_Button.first().click();
//        sign_In_Button.isDisabled();
          Locator user_Email_Id = page.locator("//div[@class='mt-10 flex flex-col gap-7']/button/a/span/span[text()='Sign In']");
          String actualText = user_Email_Id.textContent();
          System.out.println(actualText);
          
          boolean text=user_Email_Id.isDisabled();
          System.out.println(text);
          
          Locator sign_In_Button=page.locator("//div[@class='mt-10 flex flex-col gap-7']/button/a/span//span[text()='Sign Up']");
          String actual = sign_In_Button.textContent();
          System.out.println(actual);

          boolean sign=sign_In_Button.isDisabled();
          System.out.println(sign);


//        Locator count_All_Processing =page.locator("//div[@class='font-thin   ']");
//        System.out.println(count_All_Processing.count());
//        List<String> optionsTextList=count_All_Processing.allTextContents();
//        for(String options:optionsTextList) {
//        	System.out.println(options);
//        }
//        optionsTextList.forEach(ele -> System.out.println(ele));
//        for (int i = 0; i<count_All_Processing.count(); i++){
//            String text = count_All_Processing.nth(i).textContent();
//            System.out.println(text);
//        }






       // =======================================> URL <=========================================
//        page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
//      // Multiple Elements
//        Locator countryOptions = page.locator("//select[@id='Form_getForm_Country']//option");
//        System.out.println("Total country---> "+countryOptions.count());
////        for(int i=0; i<countryOptions.count(); i++) {
////            String text = countryOptions.nth(i).textContent();
////            System.out.println(text);
////        }
//     //===================================> forEach <==============================================
//        List<String> optionsTextList=countryOptions.allTextContents();
////        for (String e : optionsTextList){
////            System.out.println(e);
////        }
//        optionsTextList.forEach(ele ->System.out.println(ele));

    }
    }
