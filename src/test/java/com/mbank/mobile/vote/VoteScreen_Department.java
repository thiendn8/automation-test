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
 * Created by FRAMGIA\dang.ngoc.thien on 31/10/2016.
 */
public class VoteScreen_Department {
    public WebDriver driver;
    public VoteScreenDepartment commentDepartment;

    @Before
    public void setUpEnvironment(){
        driver = InitUtils.intEviSelenium(InitUtils.deiredDevice(),driver);
        commentDepartment = new VoteScreenDepartment(driver);
    }
    /*Test case line 68*/
    @Test
    public void testInputCommentLine68(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine68.step1");
        Assert.assertTrue(commentDepartment.testInputCommentLine68());
    }
    /*Test case line 69*/
    @Test
    public void testInputCommentLine69(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine69.step1");
        Assert.assertTrue(commentDepartment.testInputCommentLine69());
    }
    /*Test case line 70*/
    @Test
    public void testInputCommentLine70(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine70.step1");
        Assert.assertTrue(commentDepartment.testInputCommentLine70());
    }
    /*Test case line 71*/
    @Test
    public void testInputCommentLine71(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine71.step1");
        Assert.assertTrue(commentDepartment.testInputCommentLine71());
    }
    /*Test case line 72*/
    @Test
    public void testInputCommentLine72(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine72.step1");
        Assert.assertTrue(commentDepartment.testInputCommentLine72());
    }
    /*Test case line 73*/
    @Test
    public void testInputCommentLine73(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine73.step1");
        Assert.assertTrue(commentDepartment.testInputCommentLine73());
    }
    /*Test case line 74*/
    @Test
    public void testInputCommentLine74(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine74.step1");
        Assert.assertTrue(commentDepartment.testInputCommentLine74());
    }
    @Test
    public void testInputCommentLine75(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine75.step1");
        Assert.assertTrue(commentDepartment.testInputCommentLine75());
    }
    @Test
    public void testInputCommentLine76(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine76.step1");
        Assert.assertTrue(commentDepartment.testInputCommentLine76());
    }
    @Test
    public void testInputCommentLine77(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine77.step1");
        Assert.assertTrue(commentDepartment.testInputCommentLine77());
    }
    @Test
    public void testInputCommentLine78(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine78.step1");
        Assert.assertTrue(commentDepartment.testInputCommentLine78());
    }
    @Test
    public void testInputCommentLine79(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine79.step1");
        Assert.assertTrue(commentDepartment.testInputCommentLine79());
    }
    @Test
    public void testInputCommentLine80(){
        CommonUtils.goUrlVoteSearch(driver,"331760");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine80.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine80());
    }
    @Test
    public void testInputCommentLine81(){
        CommonUtils.goUrlVoteSearch(driver,"331760");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine81.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine81());
    }
    @Test
    public void testInputCommentLine82(){
        CommonUtils.goUrlVoteSearch(driver,"331760");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine82.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine82());
    }
    @Test
    public void testInputCommentLine83(){
        CommonUtils.goUrlVoteSearch(driver,"102206 ");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine83.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine83());
    }
    @Test
    public void testInputCommentLine84(){
        CommonUtils.goUrlVoteSearch(driver,"102206");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine84.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine84());
    }
    @Test
    public void testInputCommentLine85(){
        CommonUtils.goUrlVoteSearch(driver,"102206");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine85.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine85());
    }
    @Test
    public void testInputCommentLine86(){
        CommonUtils.goUrlVoteSearch(driver,"111740");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine86.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine86());
    }
    @Test
    public void testInputCommentLine87(){
        CommonUtils.goUrlVoteSearch(driver,"111740");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine87.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine87());
    }
    @Test
    public void testInputCommentLine88(){
        CommonUtils.goUrlVoteSearch(driver,"111740");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine88.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine88());
    }
    @Test
    public void testInputCommentLine89(){
        CommonUtils.goUrlVoteSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine89.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine89());
    }
    @Test
    public void testInputCommentLine90(){
        CommonUtils.goUrlVoteSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine90.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine90());
    }
    @Test
    public void testInputCommentLine91(){
        CommonUtils.goUrlVoteSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine91.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine91());
    }
    @Test
    public void testInputCommentLine92(){
        CommonUtils.goUrlVoteSearch(driver,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine92.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine92());
    }
    @Test
    public void testInputCommentLine93(){
        CommonUtils.goUrlVoteSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine93.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine93());
    }
    @Test
    public void testInputCommentLine94(){
        CommonUtils.goUrlVoteSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine94.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine94());
    }
    @Test
    public void testInputCommentLine95(){
        CommonUtils.goUrlVoteSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine95.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine95());
    }
    @Test
    public void testInputCommentLine96(){
        CommonUtils.goUrlVoteSearch(driver,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine96.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine96());
    }
    @Test
    public void testInputCommentLine97(){
        CommonUtils.goUrlVoteSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine97.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine97());
    }
    @Test
    public void testInputCommentLine98(){
        CommonUtils.goUrlVoteSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine98.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine98());
    }
    @Test
    public void testInputCommentLine99(){
        CommonUtils.goUrlVoteSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine99.step1");
        Assert.assertEquals("ìØàÍå¬êlî‘çÜÇ÷ÇÃìäï[ÇÕêßå¿Ç≥ÇÍÇƒÇ¢Ç‹Ç∑ÅB", commentDepartment.testInputCommentLine99());
    }
    @Test
    public void testInputCommentLine100(){
        CommonUtils.goUrlVoteSearch(driver,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine100.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine100());
    }
    @Test
    public void testInputCommentLine101(){
        CommonUtils.goUrlVoteSearch(driver,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine101.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine101());
    }
    @Test
    public void testInputCommentLine102(){
        CommonUtils.goUrlVoteSearch(driver,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT +"testInputCommentLine102.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, commentDepartment.testInputCommentLine102());
    }


    @After
    public void closeBrowser(){
        driver.close();
    }

}
