package com.mbank.mobile.search;

import com.mbank.mobile.common.CommonUtils;
import com.mbank.mobile.common.Constants;
import com.mbank.mobile.common.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 19/10/2016.
 */

public class SearchNameDisplay {
    private WebDriver driver ;
    private String txtKanjiById = "kanji";
    private String txtKanaById = "kana";


    public SearchNameDisplay(WebDriver driver) {
        this.driver= driver;
    }

    public boolean isCheckShowAllItem() {
        boolean isCheckItem = false;

        if(CommonUtils.isDisplayById(driver, "kanji_radio")
                && CommonUtils.isDisplayById(driver, "kanji")
                && CommonUtils.isDisplayById(driver, "kana_radio")
                && CommonUtils.isDisplayById(driver, "kana")
                && CommonUtils.isDisplayById(driver, "syukan_cd_radio")
                && CommonUtils.isDisplayById(driver, "syukan_cd")
                && CommonUtils.isDisplayById(driver, "jigyou_name_radio")
                && CommonUtils.isDisplayById(driver, "jigyou_cd_radio")){
           isCheckItem = true;
        }

        return isCheckItem;
    }

    public boolean isItemCharacterBlank() {

        boolean isCheckBlank = false;

       if(StringUtils.isEmpty(CommonUtils.getValueBoxById(driver,"kanji"))
                && StringUtils.isEmpty(CommonUtils.getValueBoxById(driver,"kana"))
                && StringUtils.isEmpty(CommonUtils.getValueBoxById(driver,"jigyou_name"))
                && StringUtils.isEmpty(CommonUtils.getValueBoxById(driver,"jigyou_cd"))){
            isCheckBlank = true;
        }

        return isCheckBlank;
    }

    public boolean isKanjiSelected() {
        return driver.findElement(By.id("kanji_radio")).isSelected();
    }

    public boolean isExeBranchSelected() {

        return driver.findElement(By.id("syukan_cd_radio")).isSelected();
    }

    public boolean isSortExeBranch() {
        return false;
    }

    public boolean isBranchAndEstabSelected() {


        boolean isCheckEstabSelected = false;

        String actualValueBranch = CommonUtils.getValueSelectedById(driver,"syukan_cd");
        if(StringUtils.isNotEmpty(actualValueBranch))
            isCheckEstabSelected = true;

        return isCheckEstabSelected;
    }


    public boolean isCheckNotBrnachSelected() {

        boolean isCheckBranchNotSelected = false;

        String actualValueBranch = CommonUtils.getValueSelectedById(driver,"syukan_cd");
        if(StringUtils.isEmpty(actualValueBranch))
            isCheckBranchNotSelected = true;

        return isCheckBranchNotSelected;
    }

    public boolean isCheckScrollUpToOffice() {
        CommonUtils.onClickById(driver, "jigyou_name");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"scrollTopKana.step2");

        return (CommonUtils.getValueScrollY(driver) == 0);
    }

    public boolean isCheckBackgroundInputOfficeFocus() {

        String expectColor = "rgba(255, 255, 255, 1)"; // yellow
        CommonUtils.setFocusById(driver, "jigyou_name");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"backgroundInputOffice.step2");
        return Constants.EXP_COLOR_YELLOW.equals(CommonUtils.getCssValueById(driver,"jigyou_name", "background-color"));
    }

    public boolean isCheckRadioOnOffice() {
        return CommonUtils.isEnabledById(driver, "jigyou_name_radio");
    }

    public boolean isCheckScrollUpToOfKanji() {
        CommonUtils.onClickById(driver, "kanji");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"scrollTopOffice_Code.step2");

        return (CommonUtils.getValueScrollY(driver) == 0);
    }

    public boolean isCheckBackgroundInputKanjiFocus() {
        CommonUtils.setFocusById(driver, "kanji");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testBackgroundInputKanji.step2");
        return Constants.EXP_COLOR_YELLOW.equals(CommonUtils.getCssValueById(driver,"kanji","background-color"));
    }

    public boolean isCheckRadioOnOfKanji() {
        return CommonUtils.isDisplayById(driver, "kanji");
    }

    public boolean isCheckScrollUpToOffice_Code() {
        CommonUtils.onClickById(driver, "jigyou_cd");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"scrollTopOffice_Code.step2");

        return (CommonUtils.getValueScrollY(driver) == 0);
    }

    public boolean isCheckBackgroundInputOffice_CodeFocus() {
        CommonUtils.setFocusById(driver, "jigyou_cd");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"backgroundInputOffice_Code.step2");
        return Constants.EXP_COLOR_YELLOW.equals(CommonUtils.getCssValueById(driver,"jigyou_cd", "background-color"));
    }

    public boolean isCheckRadioOnOffice_Code() {
        return CommonUtils.isDisplayById(driver, "jigyou_cd");
    }

    public boolean isCheckScrollUpToOfKana() {

        CommonUtils.onClickById(driver, "kana");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"scrollTopKana.step2");

        return (CommonUtils.getValueScrollY(driver) == 0);
    }

    public boolean isCheckBackgroundInputOKanaFocus() {
        CommonUtils.setFocusById(driver, "kana");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"backgroundInputKana.step2");
        return Constants.EXP_COLOR_YELLOW.equals(CommonUtils.getCssValueById(driver,"kana", "background-color"));
    }

    public boolean isCheckRadioOnKana() {
        return CommonUtils.isDisplayById(driver, "kana");
    }
    /*Inpur character in box kanji 漢字*/
    public boolean inputBoxKanjiShowX() {
        CommonUtils.inputBoxById(driver, txtKanjiById, "text");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkkanjiShowX.step2");
        return CommonUtils.isDisplayX(driver);
    }

    public boolean deleteBoxKanjiHiddenX() {
        CommonUtils.inputBoxById(driver,txtKanjiById, "text");
        CommonUtils.clearValueBoxById(driver,txtKanjiById);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkkanjiHiddenX.step4");
        return !CommonUtils.isHiddenX(driver);
    }

    public boolean inputBoxKanjiAndClickX() {
        CommonUtils.inputBoxById(driver, txtKanjiById, "test");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkkanjiAndClickX.step4");
        CommonUtils.onClickActionX(driver);
        return StringUtils.isEmpty(CommonUtils.getValueBoxById(driver, txtKanjiById));
    }

    /*Inpur character in box Kanaa カナ*/
    public boolean inputBoxKanaShowX() {
        CommonUtils.inputBoxById(driver, txtKanaById, "text");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkkannaShowX.step2");
        return CommonUtils.isDisplayX(driver);
    }

    public boolean deleteBoxKanaHiddenX() {
        CommonUtils.inputBoxById(driver, txtKanaById, "text");
        CommonUtils.clearValueBoxById(driver, txtKanaById);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkkannaHiddenX.step2");
        return !CommonUtils.isHiddenX(driver);
    }

    public boolean inputBoxKanaAndClickX() {
        CommonUtils.inputBoxById(driver, txtKanaById, "test");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkkannaAndClickX.step2");
        CommonUtils.onClickActionX(driver);
        return StringUtils.isEmpty(CommonUtils.getValueBoxById(driver, txtKanaById));
    }
    /*Inpur character in box name office 事業所名 カナ*/
    public boolean inputBoxNameOfficeShowX() {
        CommonUtils.inputBoxById(driver, "jigyou_name", "text");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkNameOfficeShowX.step3");
        return CommonUtils.isDisplayX(driver);
    }

    public boolean deleteBoxNameOfficeHiddenX() {
        CommonUtils.inputBoxById(driver, "jigyou_name", "Text");
        CommonUtils.clearValueBoxById(driver, "jigyou_name");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkNameOfficeHiddenX.step2");
        return !CommonUtils.isHiddenX(driver);
    }

    public boolean inputBoxNameOfficeAndClickX() {
        CommonUtils.inputBoxById(driver, "jigyou_name", "test");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkNameOfficeAndClickX.step2");
        CommonUtils.onClickActionX(driver);
        return StringUtils.isEmpty(CommonUtils.getValueBoxById(driver,"jigyou_name"));
    }
    /*Inpur character in box code office 事業所コード*/
    public boolean inputBoxCodeOfficeShowX() {
        CommonUtils.inputBoxById(driver, "jigyou_cd", "Text");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkCodeOfficeiShow.step2");
        return CommonUtils.isDisplayX(driver);
    }

    public boolean deleteBoxCodeOfficeHiddenX() {
        CommonUtils.inputBoxById(driver,"jigyou_cd","test");
        CommonUtils.clearValueBoxById(driver,"jigyou_cd");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkCodeOfficeHiddenX.step2");
        return !CommonUtils.isHiddenX(driver);
    }

    public boolean inputBoxCodeOfficeAndClickX() {
        CommonUtils.inputBoxById(driver, "jigyou_cd", "test");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"checkCodeOfficeAndClickX.step2");
        CommonUtils.onClickActionX(driver);
        return StringUtils.isEmpty(CommonUtils.getValueBoxById(driver,"jigyou_cd"));
    }
}
