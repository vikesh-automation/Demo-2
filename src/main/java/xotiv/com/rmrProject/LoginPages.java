package xotiv.com.rmrProject;

import com.microsoft.playwright.Locator;
import xotiv.com.comman.Webutil;

import java.util.logging.Logger;

public class LoginPages {

    Logger log;
    Webutil util;
    public LoginPages(Webutil utill){
        this.util =utill;
        log= util.getLogger();
    }
    private  final String DISCLAIMER = "//span[text()='Ok']";
    private final String SIGN_IN_BUTTON = "//div[@class='mt-10 flex flex-col gap-7']/button/a/span/span[text()='Sign In']";
    private final String INPUT_USER_EMAIL_ID="//input[@name='email']";
    private final String INPUT_USER_PASSWORD="//input[@name='password']";
    private final String LOGIN_BUTTON="//span[text()='Sign in']";


    public void clickOnDisclaimer(){
        util.click(DISCLAIMER, "Disclaimer dis mix is successfully");
        log.info(util.getMethodName() +" Success !!");
    }
    public void signInButton(){
        util.click(SIGN_IN_BUTTON,"Click on the sign-in button");
//        util.verifyGetText(SIGN_IN_BUTTON,"Sign In");
        log.info(util.getMethodName() +" Success !!");
    }
    public void inputUserEmailId(String userName){
        util.sendKeys(INPUT_USER_EMAIL_ID,userName,"UserEmail input in user email filled");
        log.info(util.getMethodName()+" Success !!");
    }
    public void inputUserPassword(String userPassword){
        util.sendKeys(INPUT_USER_PASSWORD, userPassword,"UserPassword input in user filled");
        log.info(util.getMethodName()+" Success !!");
    }
    public void clickOnLoginButton(){
        util.click(LOGIN_BUTTON,"Click on login button");
        log.info(util.getMethodName()+" Success !!");

    }

}
