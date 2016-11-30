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
public class VoteScreen_Function {
    private WebDriver driver;

    private VoteScreenFunction voteDisplay;

    @Before
    public void setEnvironment(){
        driver = InitUtils.intEviSelenium(InitUtils.deiredDevice(), driver);
        voteDisplay = new VoteScreenFunction(driver);
    }
    /*Test case line 11, 12 Focus in box �l�ԍ�*/
    @Test
    public void testPersonalNumberLine11V12(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testPersonalNumberLine11V12.step1");
        Assert.assertTrue(voteDisplay.testPersonalNumberLine11V12());
    }
    /*Test case line 13*/
    @Test
    public void testInputPersonalNumberLine13(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine13.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberLine13());
    }
    /*Test case line 14*/
    @Test
    public void testInputPersonalNumberLine14(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine14.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberLine14());
    }
    /*Test case line 15*/
    @Test
    public void testInputPersonalNumberLine15(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine15.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberLine15());
    }
    /*Test case line 16*/
    @Test
    public void testInputPersonalNumberLine16(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine16.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberLine16());
    }
    /*Test case line 17*/
    @Test
    public void testInputPersonalNumberLine17(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine17.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberLine17());
    }
    /*Test case line 18*/
    @Test
    public void testInputPersonalNumberLine18(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine18.step1");
        Assert.assertEquals("���[�������l�̎����i�����j�Ǝ��Ə�����͂��Ă��������B",voteDisplay.testInputPersonalNumberLine18());
    }
    /*Test case line 19*/
    @Test
    public void testInputPersonalNumberLine19(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine19.step1");
        Assert.assertEquals("",voteDisplay.testInputPersonalNumberLine19());
    }
    /*Test case line 20*/
    @Test
    public void testInputPersonalNumberLine20(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine20.step1");
        Assert.assertEquals("���͂����l�ԍ��͌l���j���[�̗��p�ΏۊO�ł��B",voteDisplay.testInputPersonalNumberLine20());
    }
    /*Test case line 21*/
    @Test
    public void testInputPersonalNumberLine21(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine21.step1");
        Assert.assertEquals("���͂����l�ԍ��͌l���j���[�̗��p�ΏۊO�ł��B",voteDisplay.testInputPersonalNumberLine21());
    }
    /*Test case line 22*/
    @Test
    public void testInputPersonalNumberLine22(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine22.step1");
        Assert.assertEquals("���͂����l�ԍ��͌l���j���[�̗��p�ΏۊO�ł��B",voteDisplay.testInputPersonalNumberLine22());
    }
    /*Test case line 23*/
    @Test
    public void testInputPersonalNumberLine23(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine23.step1");
        Assert.assertEquals("���[����l�͓���l�ԍ��ɓ��[���邱�Ƃ͂ł��܂���B",voteDisplay.testInputPersonalNumberLine23());
    }
    /*Test case line 24*/
    @Test
    public void testInputPersonalNumberLine24(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine24.step1");
        Assert.assertEquals("",voteDisplay.testInputPersonalNumberLine24());
    }
    /*Test case line 25*/
    @Test
    public void testInputPersonalNumberLine25(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine25.step1");
        Assert.assertEquals("",voteDisplay.testInputPersonalNumberLine25());
    }
    /*Test case line 26*/
    @Test
    public void testInputPersonalNumberLine26(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine26.step1");
        Assert.assertEquals("1",voteDisplay.testInputPersonalNumberLine26());
    }
    /*Test case line 27*/
    @Test
    public void testInputPersonalNumberLine27(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine27.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberLine27());
    }
    /*Test case line 28*/
    @Test
    public void testInputPersonalNumberLine28(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine28.step1");
        Assert.assertEquals("",voteDisplay.testInputPersonalNumberLine28());
    }
    /*Test case line 29*/
    @Test
    public void testInputPersonalNumberLine29(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine29.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberLine29());
    }
    /*Test case line 30*/
    @Test
    public void testInputPersonalNumberLine30(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberLine30.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberLine30());
    }


    /*Test case line 31*/
    @Test
    public void testInputPersonalNumberAndCommentLine31(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberAndCommentLine31.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberAndCommentLine31());
    }
    /*Test case line 31*/
    @Test
    public void testInputPersonalNumberAndCommentLine32(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberAndCommentLine32.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberAndCommentLine32());
    }
 /*Test case line 33*/
    @Test
    public void testInputPersonalNumberAndCommentLine33(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberAndCommentLine33.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberAndCommentLine33());
    }
    /*Test case line 34*/
    @Test
    public void testInputPersonalNumberAndCommentLine34(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberAndCommentLine34.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberAndCommentLine34());
    }
    /*Test case line 35*/
    @Test
    public void testInputPersonalNumberAndCommentLine35(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberAndCommentLine35.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberAndCommentLine35());
    }
    /*Test case line 36*/
    @Test
    public void testInputPersonalNumberAndCommentLine36(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberAndCommentLine36.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberAndCommentLine36());
    }
    /*Test case line 37*/
    @Test
    public void testInputPersonalNumberAndCommentLine37(){
        CommonUtils.goUrlVoteSearch(driver,"123456");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE +"testInputPersonalNumberAndCommentLine37.step1");
        Assert.assertTrue(voteDisplay.testInputPersonalNumberAndCommentLine37());
    }


    @After
    public void andTest(){

        driver.close();
    }

}
