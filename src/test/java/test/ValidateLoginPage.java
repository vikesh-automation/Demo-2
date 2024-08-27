package test;

import org.testng.annotations.Test;
import xotiv.com.comman.BaseClass;
import xotiv.com.rmrProject.*;

public class ValidateLoginPage extends BaseClass { 

    @Test(priority = 1)
    public void validateFilter(){
       HomePageFilter filter= new HomePageFilter(we);
       filter.clickOnAllReading();
       filter.selectOnFilter();
       filter.clickOnDoctor();
       filter.selectOnDoctor();
       filter.clickOnReading();
       filter.selectOnReading();
       filter.clickOnStartedDate();
       filter.selectOnStartedDate();
       filter.clickOnEndingDate();
       filter.selectOnEndingDate();
       filter.clickOnSubmit();
       System.out.println("<=================================> Next Test <===================================>");
    }

    @Test(priority = 2)
    public void validateLoginPage() {
        MyInfoPage hom = new MyInfoPage(we);
        hom.clickOnMyInfoPage();
//        hom.verifyMyInfoPage();
        hom.verifyFirstName("Ranjeet");
        hom.verifyLastName("Kumar");
        hom.verifyPhoneNumber("9999999999");
//        hom.verifyDateOfBirth();
        hom.verifyGender();
//        hom.verifyEmergencyPhoneNumber("8888888888");
        hom.verifyZipCode("11111");
//        hom.verifyAddReferralCode();
        hom.verifyPastMedicalHistory();
        hom.verifyDiabetesMellitus();
        hom.verifyHighBloodPressure();
        hom.verifyAtrialFibrillation();
        hom.verifyPacemakerOrDefibrillator();
        hom.verifyPriorStroke();
        hom.verifyCoronaryArteryDisease();
        hom.verifyCongestiveHeartFailure();
        hom.verifyObstructiveSleepApnea();
        hom.UpdateDetailsMyInfoPage();
        hom.navigateToHomePage();
        hom.goToHomePage();
        System.out.println("Hello");
    }
    @Test(priority = 3)
    public void validateAbnormalReading() {
      AbnormalReading abReading = new AbnormalReading(we);
      abReading.clickOnOpenReading();
      abReading.ProcessingReading();
      abReading.clickOnReading();
      abReading.abnormalReading();
      abReading.additionalNotes("My all additional Reading ");
      abReading.sinusBradycardia();
      abReading.pauseSinus();
      abReading.svtSinus();
      abReading.sinusTachycardia();
      abReading.electiveReading();
      abReading.reviewSubmit();
      System.out.println("<=================================> Next Test <===================================>");
   }

    @Test(priority = 4)
    public void validateCountAllAbnormalReading(){
      AbnormalReadingCount countReading = new AbnormalReadingCount(we);
      countReading.clickOnMyReading();
      countReading.clickOnItemsAllReading();
      countReading.selectOn_150_Pages();
      countReading.countAllAbnormal();
      System.out.println("<=================================> Next Test <===================================>");
    }
    @Test(priority = 5)
    public void validateCountAllNormalReadings(){
       NormalReadingCount normalReading= new NormalReadingCount(we);
       normalReading.clickOnMyReading();
       normalReading.clickOnItemsAllReadingPages();
       normalReading.selectOn_150_PagesReadings();
       normalReading.countAllNormalReadings();
       System.out.println("<=================================> Next Test <===================================>");
    }
    @Test(priority = 6)
    public void validateCountAllUninterpretableReading(){
        UninterpretableReadingCount uninterpretableReading = new UninterpretableReadingCount(we);
        uninterpretableReading.clickOnMyReading();
        uninterpretableReading.clickOnItemsAllReadingSPage();
        uninterpretableReading.selectOn_150_PageReadings();
        uninterpretableReading.countAllUninterpretableReadings();
        System.out.println("<=================================> Next Test <===================================>");
    }
    @Test(priority = 7)
    public void validateCountAllInProgressReading(){
        InProgressReadingCount inProgressReadingCount =new InProgressReadingCount(we);
        inProgressReadingCount.clickOnAllReading();
        inProgressReadingCount.clickOnItemsAllReadingPages();
        inProgressReadingCount.selectOn_150_PagesReadings();
        inProgressReadingCount.countAllInProgressReadings();
    }

//    @Test
//    public void validateLoginPage(){
//        HomePages hom=new HomePages(we);
//        hom.clickOnMyInfoPage();
//        hom.verifyMyInfoPage();
//        hom.verifyFirstName();
//        hom.verifyLastName();
//        hom.verifyPhoneNumber();
//        hom.verifyDateOfBirth();
//        hom.verifyGender();
//        hom.verifyEmergencyPhoneNumber();
//        hom.verifyZipCode();
//        hom.verifyAddReferralCode();
//        hom.verifyPastMedicalHistory();
//        hom.verifyDiabetesMellitus();
//        hom.verifyHighBloodPressure();
//        hom.verifyAtrialFibrillation();
//        hom.verifyPacemakerOrDefibrillator();
//        hom.verifyPriorStroke();
//        hom.verifyCoronaryArteryDisease();
//        hom.verifyCongestiveHeartFailure();
//        hom.verifyObstructiveSleepApnea();
//    }


}
