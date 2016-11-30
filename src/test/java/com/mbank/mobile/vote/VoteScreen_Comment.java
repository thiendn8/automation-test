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

public class VoteScreen_Comment {
    public WebDriver driver;
    public VoteScreenComment voteComment;

    @Before
    public void setEnvironment(){
        driver = InitUtils.intEviSelenium(InitUtils.deiredDevice(), driver);
        voteComment = new VoteScreenComment(driver);
    }
    /*Test case line 38*/
    @Test
    public void testInputCommentLine38(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine38.step1");
        Assert.assertEquals("コメントは10文字以上200文字以下を入力して下さい。",voteComment.testInputCommentLine38());
    }
    /*Test case line 39*/
    @Test
    public void testInputCommentLine39(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine39.step1");
        Assert.assertEquals("コメントは10文字以上200文字以下を入力して下さい。",voteComment.testInputCommentLine39());
    }
    /*Test case line 40*/
    @Test
    public void testInputCommentLine40(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine40.step1");
        Assert.assertEquals("",voteComment.testInputCommentLine40());
    }
    /*Test case line 41*/
    @Test
    public void testInputCommentLine41(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine41.step1");
        Assert.assertEquals("",voteComment.testInputCommentLine41());
    }
    /*Test case line 42*/
    @Test
    public void testInputCommentLine42(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine42.step1");
        Assert.assertEquals("コメントは10文字以上200文字以下を入力して下さい。",voteComment.testInputCommentLine42());
    }
    /*Test case line 43*/
    @Test
    public void testInputCommentLine43(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine43.step1");
        Assert.assertEquals("",voteComment.testInputCommentLine43());
    }
    /*Test case line 44*/
    @Test
    public void testInputCommentLine44(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine44.step1");
        Assert.assertTrue(voteComment.testInputCommentLine44());
    }
    /*Test case line 45*/
    @Test
    public void testInputCommentLine45(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine45.step1");
        Assert.assertTrue(voteComment.testInputCommentLine45());
    }
    /*Test case line 46*/
    @Test
    public void testInputCommentLine46(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine46.step1");
        Assert.assertTrue(voteComment.testInputCommentLine46());
    }
    /*Test case line 47*/
    @Test
    public void testInputCommentLine47(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine47.step1");
        Assert.assertTrue(voteComment.testInputCommentLine47());
    }
    /*Test case line 48*/
    @Test
    public void testInputCommentLine48(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine48.step1");
        Assert.assertTrue(voteComment.testInputCommentLine48());
    }
    /*Test case line 49*/
    @Test
    public void testInputCommentLine49(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine49.step1");
        Assert.assertTrue(voteComment.testInputCommentLine49());
    }
    /*Test case line 50*/
    @Test
    public void testInputCommentLine50(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine50.step1");
        Assert.assertTrue(voteComment.testInputCommentLine50());
    }
    /*Test case line 51*/
    @Test
    public void testInputCommentLine51(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine51.step1");
        Assert.assertTrue(voteComment.testInputCommentLine51());
    }
    /*Test case line 52*/
    @Test
    public void testInputCommentLine52(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine52.step1");
        Assert.assertTrue(voteComment.testInputCommentLine52());
    }
    /*Test case line 53*/
    @Test
    public void testInputCommentLine53(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine53.step1");
        Assert.assertTrue(voteComment.testInputCommentLine53());
    }
    /*Test case line 54*/
    @Test
    public void testInputCommentLine54(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine54.step1");
        Assert.assertTrue(voteComment.testInputCommentLine54());
    }
    /*Test case line 55*/
    @Test
    public void testInputCommentLine55(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine55.step1");
        Assert.assertTrue(voteComment.testInputCommentLine55());
    }
    /*Test case line 56*/
    @Test
    public void testInputCommentLine56(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine56.step1");
        Assert.assertTrue(voteComment.testInputCommentLine56());
    }
    /*Test case line 57*/
    @Test
    public void testInputCommentLine57(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine57.step1");
        Assert.assertTrue(voteComment.testInputCommentLine57());
    }
    /*Test case line 58*/
    @Test
    public void testInputCommentLine58(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine58.step1");
        Assert.assertTrue(voteComment.testInputCommentLine58());
    }
    /*Test case line 59*/
    @Test
    public void testInputCommentLine59(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine59.step1");
        Assert.assertTrue(voteComment.testInputCommentLine59());
    }
    /*Test case line 60*/
    @Test
    public void testInputCommentLine60(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine60.step1");
        Assert.assertTrue(voteComment.testInputCommentLine60());
    }
    /*Test case line 61*/
    @Test
    public void testInputCommentLine61(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine61.step1");
        Assert.assertTrue(voteComment.testInputCommentLine61());
    }
    /*Test case line 62*/
    @Test
    public void testInputCommentLine62(){
        CommonUtils.goUrlVoteSearch(driver,"151914 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine62.step1");
        Assert.assertTrue(voteComment.testInputCommentLine62());
    }

    @After
    public void closeBrowser(){
        driver.close();
    }
}
