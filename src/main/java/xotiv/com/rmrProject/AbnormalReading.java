package xotiv.com.rmrProject;

import xotiv.com.comman.Webutil;
import java.util.logging.Logger;

public class AbnormalReading {
    Logger log;
    Webutil util;
    public AbnormalReading(Webutil utill){
        this.util =utill;
        log= util.getLogger();
    }
    private final String CLICK_ON_ALL_OPEN_READING = "//button[text()='Open']";
    private final String CLICK_ON_ALL_READING = "//button[text()='All']";
    private final String PROCESSING_READING = "(//div[@class='hidden md:block md:mt-6 mb-28']//div/a)[6]";
    private final String CLICK_ON_READINGS = "//button[@class='flex h-10 space-x-2 items-center justify-between rounded-md border border-input bg-background ring-offset-background placeholder:text-muted-foreground focus:outline-none focus:ring-2 focus:ring-ring focus:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 w-full text-sm font-medium mt-4 p-4']";
    private final String ABNORMAL_READING= "//span[text()='Abnormal Reading']";
    private final String ADDITIONAL_NOTES = "//textarea[@class='flex w-full rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 mt-4 h-40']";
    private final String SINUS_BRADYCARDIA ="//div[text()='Sinus Bradycardia']";
    private final String PAUSE = "//div[text()='Pause']";
    private final String SVT = "//div[text()='SVT']";
    private final String SINUS_TACHYCARDIA ="//div[text()='Sinus Tachycardia']";
    private final String ELECTIVE = "(//div[text()='Within 7-10 business days']/following::label/following::button)[1]";
    private final String REVIEW_SUBMIT = "//span[text()='Review Submit']";

    public void clickOnOpenReading(){
        util.click(CLICK_ON_ALL_OPEN_READING,"Open");
        log.info(util.getMethodName()+" Success !!");
    }
    public void clickOnAllReading(){
        util.click(CLICK_ON_ALL_READING,"All");
        log.info(util.getMethodName()+" Success !!");
    }
    public void ProcessingReading(){
        util.click(PROCESSING_READING,"Processing Reading");
        log.info(util.getMethodName()+" Success !!");
    }
    public void clickOnReading(){
        util.click(CLICK_ON_READINGS,"Reading");
        log.info(util.getMethodName()+" Success !!");
    }
    public void abnormalReading(){
        util.click(ABNORMAL_READING,"Abnormal Reading");
        log.info(util.getMethodName()+" Success !!");
    }
    public void additionalNotes(String additionalNotes){
        util.sendKeys(ADDITIONAL_NOTES,additionalNotes,"Additional Notes");
        log.info(util.getMethodName()+" Success !!");
    }
    public void sinusBradycardia(){
        util.click(SINUS_BRADYCARDIA,"Sinus Bradycardia");
        log.info(util.getMethodName()+" Success !!");
    }
    public void pauseSinus(){
        util.click(PAUSE,"Pause");
        log.info(util.getMethodName()+" Success !!");
    }
    public void svtSinus(){
        util.click(SVT,"SVT");
        log.info(util.getMethodName()+" Success !!");
    }
    public void sinusTachycardia(){
        util.click(SINUS_TACHYCARDIA,"Sinus Tachycardia");
        log.info(util.getMethodName()+" Success !!");
    }
    public void electiveReading(){
        util.click(ELECTIVE,"Within 7-10 business days");
        log.info(util.getMethodName()+" Success !!");
    }
    public void reviewSubmit(){
        util.click(REVIEW_SUBMIT,"Review Submit");
        log.info(util.getMethodName()+" Success");
    }

}
