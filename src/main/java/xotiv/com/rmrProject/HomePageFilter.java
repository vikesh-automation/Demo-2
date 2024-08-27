package xotiv.com.rmrProject;

import xotiv.com.comman.Webutil;

import java.lang.ref.PhantomReference;
import java.util.logging.Logger;

public class HomePageFilter {

    Logger log;
    Webutil util;
    public HomePageFilter(Webutil utill){
        this.util =utill;
        log= util.getLogger();
    }
    private final String CLICK_ON_ALL_READING ="//button[text()='All']";
    private final String SELECT_FILTER ="//div[@class='flex flex-row items-center space-x-3']/button";
    private final String CLICK_ON_DOCTORS ="//div[text()='Select doctors']";
    private final String SELECT_DOCTOR ="(//div[@class='w-96 h-auto max-h-80 overflow-y-auto']/div/span[@class='absolute left-2 flex h-3.5 w-3.5 items-center justify-center'])[2]";
    private final String CLICK_ON_READING ="//div[text()='Select reading type']";
    private final String SELECT_ON_READING ="//div[@class='w-96 h-auto max-h-80 overflow-y-auto']/div[text()='Abnormal Reading']";
    private final String CLICK_ON_START_DATE ="//span[text()='Select start date']";
    private final String SELECT_ON_START_DATE ="//button[text()='1']";
    private final String CLICK_ON_END_DATE ="//span[text()='Select end date']";
    private final String SELECT_ON_END_DATE ="//button[text()='13']";
    private final String SUBMIT_BUTTON ="//span[text()='Apply']";

    public void clickOnAllReading(){
        util.click(CLICK_ON_ALL_READING,"All");
        log.info(util.getMethodName()+" Success !!");
    }
    public void selectOnFilter(){
        util.click(SELECT_FILTER,"Filter");
        log.info(util.getMethodName()+" Success !!");
    }
    public void clickOnDoctor(){
        util.click(CLICK_ON_DOCTORS,"Doctor Reading");
        log.info(util.getMethodName()+" Success !!");
    }
    public void selectOnDoctor(){
        util.click(SELECT_DOCTOR,"Doctor");
        log.info(util.getMethodName()+" Success !!");
    }
    public void clickOnReading(){
        util.click(CLICK_ON_READING,"Reading");
        log.info(util.getMethodName()+" Success !!");
    }
    public void selectOnReading(){
        util.click(SELECT_ON_READING,"Reading");
        log.info(util.getMethodName()+" Success !!");
    }
    public void clickOnStartedDate(){
        util.click(CLICK_ON_START_DATE,"Select start date");
        log.info(util.getMethodName()+" Success !!");
    }
    public void selectOnStartedDate(){
        util.click(SELECT_ON_START_DATE,"1");
        log.info(util.getMethodName()+" Success !!");
    }
    public void clickOnEndingDate(){
        util.click(CLICK_ON_END_DATE,"13");
        log.info(util.getMethodName()+" Success !");
    }
    public void selectOnEndingDate(){
        util.click(SELECT_ON_END_DATE,"13");
        log.info(util.getMethodName()+" Success !!");
    }
    public void clickOnSubmit(){
        util.click(SUBMIT_BUTTON,"Apply");
        log.info(util.getMethodName()+" Success !!");
    }

}
