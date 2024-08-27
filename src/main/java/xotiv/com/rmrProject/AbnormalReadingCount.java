package xotiv.com.rmrProject;

import xotiv.com.comman.Webutil;

import java.util.logging.Logger;

public class AbnormalReadingCount {
    Logger log;
    Webutil util;
    public AbnormalReadingCount(Webutil utill){
        this.util =utill;
        log= util.getLogger();
    }

    private final String MY_READING = "//button[text()='My Readings']";
    private final String BUTTON = "//button[@class='flex h-10 space-x-2 items-center justify-between rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background placeholder:text-muted-foreground focus:outline-none focus:ring-2 focus:ring-ring focus:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 w-40']";
    private final String PER_PAGE_150_READING = "//span[text()='150 per page']";
    private final String COUNT_ABNORMAL_READING = "//div[@class='hidden md:block md:mt-6 mb-28']/div/div/a/div[@class='cursor-pointer mt-2 border-l-4 items-center p-5 border rounded-sm   hover:scale-105 transition-all border-abnormalColor']";

    public void clickOnMyReading(){
    util.click(MY_READING,"My Reading");
    log.info(util.getMethodName()+" Success !!");
    }
    public void clickOnItemsAllReading(){
        util.click(BUTTON,"Open");
        log.info(util.getMethodName()+" Success !!");
    }
    public void selectOn_150_Pages(){
        util.click(PER_PAGE_150_READING,"All");
        log.info(util.getMethodName()+" Success !!");
        util.verifyGetText(PER_PAGE_150_READING,"150 per page");
    }
    public void countAllAbnormal(){
        util.getTableDataRowCount(COUNT_ABNORMAL_READING,"Abnormal Reading");
        log.info(util.getMethodName()+" Success !!");

    }

}
