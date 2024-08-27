package xotiv.com.rmrProject;

import xotiv.com.comman.Webutil;

import java.util.logging.Logger;

public class RmrHomePage {


	Logger log;
	Webutil util;
	public RmrHomePage(Webutil utill){
		this.util =utill;
		log= util.getLogger();

	}
	private  final String DISCLAIMER = "//span[text()='Ok']";
	private  final String WELCOME_TO_READ_MY_RHYTHM = "//span[text()='Welcome to Read My Rhythm']";
	private final String SIGN_IN_BUTTON = "//div[@class='mt-10 flex flex-col gap-7']/button/a/span/span[text()='Sign In']";
	private final String SIGN_UP_BUTTON = "//div[@class='mt-10 flex flex-col gap-7']/button/a/span//span[text()='Sign Up']";




	public void clickOnDisclaimer(){
		util.click(DISCLAIMER, "Disclaimer dis mix is successfully");
		log.info(util.getMethodName() +" Success !!");
	}
	public void welcomeToReadMyRhythm(){
		util.getTextVisible(WELCOME_TO_READ_MY_RHYTHM,"Welcome to Read My Rhythm");
		log.info(util.getMethodName() +" Success !!");
	}

	public void signInButton(){
		util.click(SIGN_IN_BUTTON,"Click on the sign-in button");
		util.verifyGetText(SIGN_IN_BUTTON, "Sign In");
		log.info(util.getMethodName() +" Success !!");
	}
	public void signUpButton(){
		util.verifyGetText(SIGN_UP_BUTTON, " Sign Up");
		log.info(util.getMethodName() +" Success !!");

	}

}
