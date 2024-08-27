package xotiv.com.rmrProject;

import xotiv.com.comman.Webutil;

import java.util.PrimitiveIterator;
import java.util.logging.Logger;

public class HomePage {
    Logger log;
    Webutil util;
    public HomePage(Webutil utill){
        this.util =utill;
        log= util.getLogger();
    }
    private  final String CLICK_ON_ALL_READING = "//button[text()='All']";
    private final String ABNORMAL_READING = "//div[text()='Abnormal Reading']";
    private final String NORMAL_READING="//div[text()='Normal Reading']";
    private final String UNINTERPRETABLE_READING= "//div[text()='Uninterpretable']";
    private final String PROCESSING_READING= "//div[text()='Processing']";

    public void clickOnAllReading(){
         util.click(CLICK_ON_ALL_READING,"All Reading");
         util.verifyGetText(CLICK_ON_ALL_READING,"All");
         log.info(util.getMethodName()+" Success !!");
    }
    public void abnormalReading(){
         util.printAllTableData(ABNORMAL_READING,"Abnormal Reading ");
         log.info(util.getMethodName()+" Success !!");
    }
    public void normalReading(){
        util.printAllTableData(NORMAL_READING,"Normal Reading");
        log.info(util.getMethodName()+" Success !!");
    }
    public void uninterpretableReading(){
        util.printAllTableData(UNINTERPRETABLE_READING,"Uninterpretable Reading");
        log.info(util.getMethodName()+" Success !!");
    }
    public void processingReading(){
        util.printAllTableData(PROCESSING_READING,"Processing Reading");
        log.info(util.getMethodName()+" Success !!");

    }

}
