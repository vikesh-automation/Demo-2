package xotiv.com.page;

import xotiv.com.comman.Webutil;
import org.testng.Assert;

import java.util.logging.Logger;

public class HomePage {

    Logger log;
    Webutil util;

    public HomePage(Webutil utill) {
        this.util = utill;
        log = util.getLogger();
    }
private final String CLICK_ON_SIDEBAR = "//button[@id='react-burger-menu-btn']";
private final String ABOUT_MODUALE ="//a[@id='about_sidebar_link']";

public void clickOnSidebar() {
    util.click(CLICK_ON_SIDEBAR,"Sidebar is clicked");
    log.info(util.getMethodName() + " Success !!");
}
public void clickOnAboutButton(){
    util.click(ABOUT_MODUALE,"Click on the about moduale ");
    log.info(util.getMethodName()+" Success !!");
}

//public void verifyAboutPage() {
//    String expectedAboutPageUrl="https://saucelabs.com/";
//    String actualAboutPageUrl=util.getCurrentUrl();
//    Assert.assertEquals(actualAboutPageUrl, expectedAboutPageUrl);
//    log.info(util.getMethodName()+ "Success !!");

// }
}

