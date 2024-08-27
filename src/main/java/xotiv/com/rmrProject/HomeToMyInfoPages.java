package xotiv.com.rmrProject;

import xotiv.com.comman.Webutil;

import java.util.logging.Logger;

public class HomeToMyInfoPages {
    Logger log;
    Webutil util;
    public HomeToMyInfoPages(Webutil utill){
        this.util =utill;
        log= util.getLogger();
    }
    private  final String CLICK_ON_MY_INFO = "//span[text()='My Info']";
    private final String MY_INFO_PAGE = "(//span[text()='My Info'])[2]";
    private final String FIRST_NAME = "//label[text()='First Name']";
    private final String LAST_NAME = "//label[text()='Last Name']";
    private final String PHONE_NUMBER = "//label[text()='Phone']";
    private final String DATE_OF_BIRTH = "//label[text()='Date of Birth']";
    private final String GENDER = "//label[text()='Gender']";
    private final String EMERGENCY_PHONE_NUMBER = "//label[text()='Emergency Phone']";
    private final String ZIP_CODE = "//label[text()='Zip Code']";
    private final String ADD_REFERRAL_CODE = "//label[text()=' Add Referral Code']";
    private final String POST_MEDICAL_HISTORY = "//h4[text()='Past Medical History']";
    private final String DIABETES_MELLITUS = "//div[text()='Diabetes Mellitus']";
    private final String HIGH_BLOOD_PRESSURE="//div[text()='High Blood Pressure']";
    private final String ATRIAL_FIBRILLATION="//div[text()='Atrial Fibrillation']";
    private final String PACEMAKER_OR_DEFIBRILLATOR="//div[text()='Pacemaker or Defibrillator']";
    private final String PRIOR_STROKE="//div[text()='Prior Stroke']";
    private final String CORONARY_ARTERY_DISEASE="//div[text()='Coronary Artery Disease']";
    private final String CONGESTIVE_HEART_FAILURE="//div[text()='Congestive Heart Failure']";
    private final String OBSTRUCTIVE_SLEEP_APNEA="//div[text()='Obstructive Sleep Apnea']";

    public void clickOnMyInfoPage(){
        util.click(CLICK_ON_MY_INFO,"My Info");
        util.verifyGetText(CLICK_ON_MY_INFO," My Info");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyMyInfoPage(){
        util.verifyGetText(MY_INFO_PAGE,"My Info");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyFirstName(){
        util.verifyGetText(FIRST_NAME,"First Name");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyLastName(){
        util.verifyGetText(LAST_NAME,"Last Name");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyPhoneNumber(){
        util.verifyGetText(PHONE_NUMBER,"PHONE");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyDateOfBirth() {
        util.verifyGetText(DATE_OF_BIRTH,"Date of Birth");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyGender(){
        util.verifyGetText(GENDER,"Gender");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyEmergencyPhoneNumber(){
        util.verifyGetText(EMERGENCY_PHONE_NUMBER,"Emergency Phone");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyZipCode(){
        util.verifyGetText(ZIP_CODE,"Zip Code");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyAddReferralCode(){
        util.verifyGetText(ADD_REFERRAL_CODE,"Add Referral Code");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyPastMedicalHistory(){
        util.verifyGetText(POST_MEDICAL_HISTORY,"Past Medical History");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyDiabetesMellitus(){
        util.verifyGetText(DIABETES_MELLITUS,"Diabetes Mellitus");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyHighBloodPressure(){
        util.verifyGetText(HIGH_BLOOD_PRESSURE,"High Blood Pressure");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyAtrialFibrillation(){
        util.verifyGetText(ATRIAL_FIBRILLATION,"Atrial Fibrillation");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyPacemakerOrDefibrillator(){
        util.verifyGetText(PACEMAKER_OR_DEFIBRILLATOR,"Pacemaker or Defibrillator");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyPriorStroke(){
        util.verifyGetText(PRIOR_STROKE,"Prior Stroke");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyCoronaryArteryDisease(){
        util.verifyGetText(CORONARY_ARTERY_DISEASE,"Coronary Artery Disease");
        log.info(util.getMethodName()+" Success !!");
    }
    public void verifyCongestiveHeartFailure(){
        util.verifyGetText(CONGESTIVE_HEART_FAILURE,"Congestive Heart Failure");
        log.info(util.getMethodName()+ " Success !!");
    }
    public void verifyObstructiveSleepApnea(){
        util.verifyGetText(OBSTRUCTIVE_SLEEP_APNEA,"Obstructive Sleep Apnea");
        log.info(util.getMethodName()+ " Success !!");
    }

}
