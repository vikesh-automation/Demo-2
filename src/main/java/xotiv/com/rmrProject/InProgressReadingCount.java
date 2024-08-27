package xotiv.com.rmrProject;

import xotiv.com.comman.Webutil;

import java.util.logging.Logger;

public class InProgressReadingCount {
    Logger log;
    Webutil util;
    public InProgressReadingCount(Webutil utill){
        this.util =utill;
        log= util.getLogger();
    }
    private final String ALL_READING = "//button[text()='All']";
    private final String ITEMS_BUTTON = "//button[@class='flex h-10 space-x-2 items-center justify-between rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background placeholder:text-muted-foreground focus:outline-none focus:ring-2 focus:ring-ring focus:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 w-40']";
    private final String PER_PAGE_150_READING = "//span[text()='150 per page']";
    private final String COUNT_ALL_IN_PROGRESS_READING ="//div[@class='hidden md:block md:mt-6 mb-28']/div/div/a/div[@class='cursor-pointer mt-2 border-l-4 items-center p-5 border rounded-sm   hover:scale-105 transition-all border-inprogressColor']";

    public void clickOnAllReading(){
        util.click(ALL_READING,"All Reading");
        log.info(util.getMethodName()+"Success !!");
    }
    public void clickOnItemsAllReadingPages(){
        util.click(ITEMS_BUTTON,"Open");
        log.info(util.getMethodName()+" Success !!");
    }
    public void selectOn_150_PagesReadings(){
        util.click(PER_PAGE_150_READING,"All");
        log.info(util.getMethodName()+" Success !!");
        util.verifyGetText(PER_PAGE_150_READING,"150 per page");
    }
    public void countAllInProgressReadings(){
        util.getTableDataRowCount(COUNT_ALL_IN_PROGRESS_READING,"InProgress Reading");
        log.info(util.getMethodName()+" Success !!");
    }

}
