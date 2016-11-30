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
 * Created by FRAMGIA\dang.ngoc.thien on 28/10/2016.
 */
public class VoteScreenComment_Display {
    public WebDriver driver;

    public VoteScreenCommentDisplay commentDisplay;

    @Before
    public void setUpEnvironment(){
        driver = InitUtils.intEviSelenium(InitUtils.deiredDevice(),driver);
        commentDisplay = new VoteScreenCommentDisplay(driver);
    }
    /*Test case line 63*/
    @Test
    public void testInputCommentLine63(){
        CommonUtils.goUrlVoteSearch(driver,"151914");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine63.step1");
        Assert.assertTrue(commentDisplay.testInputCommentLine63());
    }
    /*Test case line 64*/
    @Test
    public void testInputCommentLine64(){
        CommonUtils.goUrlVoteSearch(driver,"151914");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine64.step1");
        Assert.assertTrue(commentDisplay.testInputCommentLine64());
    }
    /*Test case line 65*/
    @Test
    public void testInputCommentLine65(){
        CommonUtils.goUrlVoteSearch(driver,"151914");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine65.step1");
        Assert.assertTrue(commentDisplay.testInputCommentLine65());
    }
    /*Test case line 66*/
    @Test
    public void testInputCommentLine66(){
        CommonUtils.goUrlVoteSearch(driver,"151914");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine66.step1");
        Assert.assertTrue(commentDisplay.testInputCommentLine66());
    }
    /*Test case line 67*/
    @Test
    public void testInputCommentLine67(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine67.step1");
        Assert.assertEquals("入力した個人番号は個人メニューの利用対象外です。",commentDisplay.testInputCommentLine66());
    }

    @After
    public void closeBrowser(){
        driver.close();
    }
}
