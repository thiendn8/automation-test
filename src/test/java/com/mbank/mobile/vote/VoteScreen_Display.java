package com.mbank.mobile.vote;

import com.mbank.mobile.common.CommonUtils;
import com.mbank.mobile.common.Constants;
import com.mbank.mobile.common.InitUtils;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 27/10/2016.
 */
public class VoteScreen_Display {
    public WebDriver driver;
    public VoteScreenDisplay voteDisplay;

    @Before
    public void setEnvironment(){
        driver = InitUtils.intEviSelenium(InitUtils.deiredDevice(), driver);
        voteDisplay = new VoteScreenDisplay(driver);
    }
    /*Test case line 4*/
    @Test
    public void testVoteScreenLLine4(){
        CommonUtils.goUrlVoteSearch(driver,"140608");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testVoteScreenLLine4.step1");
        Assert.assertTrue(voteDisplay.testVoteScreenLLine4());
    }
    /*Test case line 5*/
    @Test
    public void testVoteScreenLine5(){
        CommonUtils.goUrlVoteSearch(driver,"140608");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testVoteScreenLine5.step1");
        Assert.assertTrue(voteDisplay.testVoteScreenLine5());
    }
    /*Test case line 6*/
    @Test
    public void testVoteScreenLine6(){
        CommonUtils.goUrlVoteSearch(driver,"140608");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testVoteScreenLine6.step1");
        Assert.assertTrue(voteDisplay.testVoteScreenLine6());
    }
    /*Test case line 7*/
    @Test
    public void testVoteScreenLine7(){
        CommonUtils.goUrlVoteSearch(driver,"140608");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testVoteScreenLine7.step1");
        Assert.assertTrue(voteDisplay.testVoteScreenLine7());
    }
    /*Test case line 8*/
    @Test
    public void testVoteScreenLine8(){
        CommonUtils.goUrlVoteSearch(driver,"140608");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testVoteScreenLine8.step1");
        Assert.assertTrue(voteDisplay.testVoteScreenLine8());
    }
    /*Test case line 9*/
    @Test
    public void testVoteScreenLine9(){
        CommonUtils.goUrlVoteSearch(driver,"140608");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testVoteScreenLine9.step1");
        Assert.assertTrue(voteDisplay.testVoteScreenLine9());
    }
    /*Test case line 10*/
    @Test
    public void testVoteScreenLine10(){
        CommonUtils.goUrlVoteSearch(driver,"140608");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testVoteScreenLine10.step1");
        Assert.assertTrue(voteDisplay.testVoteScreenLine10());
    }


    @After
    public void ensTest(){
        driver.close();
    }
}
