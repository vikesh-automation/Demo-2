package xotiv.com.page;

import xotiv.com.comman.Webutil;

import java.util.logging.Logger;

public class LoginPage {

    Logger log;
    Webutil util;
    public LoginPage(Webutil utill){
        this.util =utill;
        log= util.getLogger();

    }
    private  final String USERNAME_INPUT = "//input[@id='user-name']";
    private  final String PASSWORD_INPUT = "//input[@id='password']";
    private  final String LOGIN_BUTTON ="//input[@id='login-button']";



    public void inputUserName(String userName){
        util.sendKeys(USERNAME_INPUT,userName ,"Username input in user filled");
        log.info(util.getMethodName() +" Success !!");
    }
    public void inputUserPassword(String userPassword){
        util.sendKeys(PASSWORD_INPUT,userPassword,"Password input in user filled");
        log.info(util.getMethodName() +" Success !!");
    }
    public void clickOnLoginBT(){
        util.click(LOGIN_BUTTON , "Login Button");
        log.info(util.getMethodName() +" Success !!");
    }
}
