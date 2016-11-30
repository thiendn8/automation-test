package com.mbank.mobile.search;

import com.mbank.mobile.common.CommonUtils;
import com.mbank.mobile.common.Constants;
import com.mbank.mobile.common.InitUtils;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 19/10/2016.
 */
public class SearchName_Display {
    private WebDriver driver;

    private SearchNameDisplay iSearchName;

    @Before
    public void setEnvironment(){
        driver = InitUtils.intEviSelenium(InitUtils.deiredDevice(), driver);
        iSearchName = new SearchNameDisplay(driver);
    }


    /*test for Home Mbank*/
    @Test
    public void homeMbankMobile(){
        CommonUtils.goUrlHomeSearch(driver,"140608");
        Assert.assertEquals(Constants.EXP_TITLE_HOME, driver.getTitle());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testHomeMbankMobile.step1");
    }


    /*Test-case line 04 : check all item of screen*/

    @Test
    public void testAllItemScreen(){
        CommonUtils.goUrlHomeSearch(driver,"140608");
        Assert.assertTrue(iSearchName.isCheckShowAllItem());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testAllItem.step1");
    }
    /* Test-case line 05:  check all item äøéöÅAÉJÉiÅAéÂä«éxìXÅAÅAéñã∆èäÉRÅ[Éh is blank*/

    @Test
    public void  testBankAllItem(){
        CommonUtils.goUrlHomeSearch(driver,"140608");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"bankAllItem.step1");
        Assert.assertTrue(iSearchName.isItemCharacterBlank());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"bankAllItem.step2");
    }

    /* Test-case line 06:  Radio of äøéö default l? ON*/
    @Test
    public void testKanjiDefaultCheck(){
        CommonUtils.goUrlHomeSearch(driver,"140608");
        Assert.assertTrue(iSearchName.isKanjiSelected());
    }

    /* Test-case line 07:  (éÂä«éxìX) default l? ON*/
    @Test
    public void testBranchDefaultCheck(){
        CommonUtils.goUrlHomeSearch(driver,"140608");
        Assert.assertTrue(iSearchName.isExeBranchSelected());
    }


    /* Test-case line 11:  check default selected for éÂä«éxìX have exe branch + YTC on UserId = 102056*/
    @Test
    public void testBranchHaveYTCSelected_102056(){
        CommonUtils.goUrlHomeSearch(driver,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchHaveYTCSelected_102056.step1");

        Assert.assertTrue(iSearchName.isBranchAndEstabSelected());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchHaveYTCSelected_102056.step2");
    }

    /* Test-case line 12:  check default selected for éÂä«éxìX have exe branch + YTC on UserId = 140608*/
    @Test
    public void testBranchHaveYTCSelected(){
        CommonUtils.goUrlHomeSearch(driver,"140608");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchHaveYTCSelected.step1");
        Assert.assertTrue(iSearchName.isBranchAndEstabSelected());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchHaveYTCSelected.step2");
    }

    /* Test-case line 13:  check default selected is blank for éÂä«éxìX haven't exe branch + YTC on UserId = 501006*/
    @Test
    public void testBranchHaveYTCBlank(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchHaveYTCBlank.step1");
        Assert.assertTrue(iSearchName.isCheckNotBrnachSelected());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchHaveYTCBlank.step2");
    }

    /* Test-case line 14:  check default selected for éÂä«éxìX have exe branch + YTC on UserId = 127516*/
    @Test
    public void testBranchHaveYTCSelected_127516(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchHaveYTCSelected_127516.step1");
        Assert.assertTrue(iSearchName.isBranchAndEstabSelected());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchHaveYTCSelected_127516.step2");
    }
   /* Test-case line 15*/
    @Test
    public void showSearchScreen(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"showSearchScreen.step1");
    }

    /*Test case line 16*/
   @Test
   public void testScrollTopOffice(){
       CommonUtils.goUrlHomeSearch(driver,"127516");
       CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"scrollTopOffice.step1");
       Assert.assertTrue(iSearchName.isCheckScrollUpToOffice());
   }
    /*Test case line 17*/
    @Test
    public void testBackgroundInputOffice(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"backgroundInputOffice.step1");
        Assert.assertTrue(iSearchName.isCheckBackgroundInputOfficeFocus());
    }
    /*Test case line 18*/
    @Test
    public void testCheckRadioOnOffice(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkRadioOnOffice.step1");

        Assert.assertTrue(iSearchName.isCheckRadioOnOffice());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkRadioOnOffice.step2");
    }

    /*Test case line 19*/
    @Test
    public void testScrollTopKanji(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"scrollTopKanji.step1");

        Assert.assertTrue(iSearchName.isCheckScrollUpToOfKanji());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"scrollTopKanji.step3");
    }

    /*Test case line 20*/
    @Test
    public void testBackgroundInputKanji(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testBackgroundInputKanji.step2");
        Assert.assertTrue(iSearchName.isCheckBackgroundInputKanjiFocus());
    }

    /*Test case line 21*/
    @Test
    public void testCheckRadioOnKanji(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkRadioOnKanji.step1");
        Assert.assertTrue(iSearchName.isCheckRadioOnOfKanji());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkRadioOnKanji.step2");
    }

    /*Test case line 22*/
    @Test
    public void testScrollTopOffice_Code(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"scrollTopOffice_Code.step1");
        Assert.assertTrue(iSearchName.isCheckScrollUpToOffice_Code());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"scrollTopOffice_Code.step3");
    }

    /*Test case line 23*/
    @Test
    public void testBackgroundInputOffice_Code(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"backgroundInputOffice_Code.step1");
        Assert.assertTrue(iSearchName.isCheckBackgroundInputOffice_CodeFocus());

    }

    /*Test case line 24*/
    @Test
    public void testCheckRadioOnOffice_Code(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkRadioOnOffice_Code.step1");

        Assert.assertTrue(iSearchName.isCheckRadioOnOffice_Code());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkRadioOnOffice_Code.step2");
    }


    /*Test case line 25*/
    @Test
    public void testScrollTopKana(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"scrollTopKana.step1");
        Assert.assertTrue(iSearchName.isCheckScrollUpToOfKana());
    }
    /*Test case line 26*/
    @Test
    public void testBackgroundInputKana(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"backgroundInputKana.step1");
        Assert.assertTrue(iSearchName.isCheckBackgroundInputOKanaFocus());

    }

    /*Test case line 27*/
    @Test
    public void testCheckRadioOnkana(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkRadioOnkana.step1");
        Assert.assertTrue(iSearchName.isCheckRadioOnKana());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkRadioOnkana.step1");
    }
    /*Test case line 28*/
    @Test
    public void testCheckkanjiShowX(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkkanjiShowX.step1");
        Assert.assertTrue(iSearchName.inputBoxKanjiShowX());

    }
    /*Test case line 29*/
    @Test
    public void testCheckkanjiHiddenX(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkkanjiHiddenX.step1");
        Assert.assertTrue(iSearchName.deleteBoxKanjiHiddenX());
    }

    /*Test case line 30 , line 31*/
    @Test
    public void testCheckkanjiAndClickX(){
        CommonUtils.goUrlHomeSearch(driver,"127516");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkkanjiAndClickX.step1");
        Assert.assertTrue(iSearchName.inputBoxKanjiAndClickX());
    }

    /*Test case line 32*/
    @Test
    public void testCheckkannaShowX(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkkannaShowX.step1");
        Assert.assertTrue(iSearchName.inputBoxKanaShowX());

    }
    /*Test case line 33*/
    @Test
    public void testCheckkannaHiddenX(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkkannaHiddenX.step1");
        Assert.assertTrue(iSearchName.deleteBoxKanaHiddenX());
    }

    /*Test case line 34, line 35 */
    @Test
    public void testCheckkannaAndClickX(){
        CommonUtils.goUrlHomeSearch(driver,"127516");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkkannaAndClickX.step1");
        Assert.assertTrue(iSearchName.inputBoxKanaAndClickX());

    }

    /*Test case line 36*/
    @Test
    public void testCheckNameOfficeShowX(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkNameOfficeShowX.step1");
        Assert.assertTrue(iSearchName.inputBoxNameOfficeShowX());
    }
    /*Test case line 37*/
    @Test
    public void testCheckNameOfficeHiddenX(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkNameOfficeHiddenX.step1");
        Assert.assertTrue(iSearchName.deleteBoxNameOfficeHiddenX());
    }

    /*Test case line 38, line 39*/
    @Test
    public void testCheckNameOfficeAndClickX(){
        CommonUtils.goUrlHomeSearch(driver,"127516");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkNameOfficeAndClickX.step1");
        Assert.assertTrue(iSearchName.inputBoxNameOfficeAndClickX());
    }

    /*Test case line 40*/
    @Test
    public void testCheckCodeOfficeiShowX(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkCodeOfficeiShow.step1");
        Assert.assertTrue(iSearchName.inputBoxCodeOfficeShowX());
    }
    /*Test case line 41*/
    @Test
    public void testCheckCodeOfficeHiddenX(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkCodeOfficeHiddenX.step1");
        Assert.assertTrue(iSearchName.deleteBoxCodeOfficeHiddenX());
    }

    /*Test case line 42, line 43*/
    @Test
    public void testCheckCodeOfficeAndClickX(){
        CommonUtils.goUrlHomeSearch(driver,"127516");;
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkCodeOfficeAndClickX.step1");
        Assert.assertTrue(iSearchName.inputBoxCodeOfficeAndClickX());
    }


    @After
    public void andTest(){

        driver.close();
    }
}
