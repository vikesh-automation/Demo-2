package test;

import xotiv.com.comman.BaseClass;
import xotiv.com.page.HomePage;

import org.testng.annotations.Test;

public class ValidateHomePage extends BaseClass {

    @Test
    public void validateHomePage(){
     HomePage home=new HomePage(we);
     home.clickOnSidebar();
     home.clickOnAboutButton();

}

}
