package com.mbank.mobile.search;

import com.mbank.mobile.common.CommonUtils;
import com.mbank.mobile.common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 21/10/2016.
 */
public class SearchNameFunction {
    public WebDriver driver;

    public SearchNameFunction(WebDriver driver) {
        this.driver = driver;
    }

    /*Selected branch and check radio kanji*/
    public String getMsgOfBranchAndCheckRadiokanji(){
        String messageError = "";

        CommonUtils.onClickById(driver, "kanji_radio");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = CommonUtils.getValueBoxByClassName(driver, "error");

        return messageError;
    }
    /*Test-case line 46 Selected branch and input box kanji*/
    public String getMsgOfBranchAndInputBoxkanjiLine46(){
        String messageError = "";
        
        CommonUtils.inputBoxById(driver, "kanji","�P�Q�R�S�T�U�V�W�X�O�P");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanjiLine46.step2");
        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();


        return messageError;
    }
    /*Test-case line 46 Selected branch and input box kanji*/
    public String getMsgOfBranchAndInputBoxkanjiLine48(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","�P�Q�R�S�T�U�V�W�X�O");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanjiLine48.step2");
        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();


        return messageError;
    }

    /*Selected branch and check radio kana*/
    public String getMsgOfBranchAndCheckRadiokana(){
        String messageError = "";

        CommonUtils.onClickById(driver, "kana_radio");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = CommonUtils.getValueBoxByClassName(driver, "error");

        return messageError;
    }
    /*Test-case line 50, 51 Selected branch and input box kana*/
    public String getMsgOfBranchAndInputBoxkanaLarge15(){
        String messageError = "";

//        String actualValueBranch = CommonUtils.getValueSelectedById(driver,"syukan_cd");

        CommonUtils.inputBoxById(driver, "kana","�P�Q�R�S�T�U�V�W�X�O�P�Q�R�S�T�U");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanaLarge15.step2");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }

    /*Test-case line 52 Selected branch and input box kanji*/
    public String getMsgOfBranchAndInputBoxkanaMax15(){
        String messageError = "";

//        String actualValueBranch = CommonUtils.getValueSelectedById(driver,"syukan_cd");

        CommonUtils.inputBoxById(driver, "kana","123456789012345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanjiLine48.step2");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }

    /*Test-case line 53 Selected branch and input box kanji*/
    public String getMsgOfBranchNullAndInputBoxkanji(){
        String messageError = "";
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));

        drop.selectByIndex(0);

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanjiLine48.step2");

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanjiLine48.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 58*/
    public String testSelectNameOfficeAndInputBoxKanjiLine58(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectNameOfficeAndInputBoxKanjiLine58.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectNameOfficeAndInputBoxKanjiLine58.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 59*/
    public String testNameOfficeAndInputBoxKanjiLine59(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine59.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine59.step3");

        CommonUtils.inputBoxById(driver,"jigyou_name", "�P�Q�R�S�T�U�V�W�X�O�P�Q�R�S�T�U�V�W�X�O�P");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine59.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }

    /*Test-case line 60*/
    public String testNameOfficeAndInputBoxKanjiLine60(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine60.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine60.step3");

        CommonUtils.inputBoxById(driver,"jigyou_name", "��}��");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine60.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 61*/
    public String testNameOfficeAndInputBoxKanjiLine61(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine61.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine61.step3");

        CommonUtils.inputBoxById(driver,"jigyou_name", "���[����");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine61.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 62*/
    public String testNameOfficeAndInputBoxKanjiLine62(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine62.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine62.step3");

        CommonUtils.inputBoxById(driver,"jigyou_name", "����");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine62.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 63*/
    public String testNameOfficeAndInputBoxKanjiLine63(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine63.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine63.step3");

        CommonUtils.inputBoxById(driver,"jigyou_name", "��ǎx�X");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine63.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 64*/
    public String testNameOfficeAndInputBoxKanjiLine64(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine64.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine64.step3");

        CommonUtils.inputBoxById(driver,"jigyou_name", "���");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine64.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 65/*/
    public String testNameOfficeAndInputBoxKanjiLine65(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine65.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine65.step3");

        CommonUtils.inputBoxById(driver,"jigyou_name", "�x�X");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine65.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 66*/
    public String testNameOfficeAndInputBoxKanjiLine66(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine66.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine66.step3");

        CommonUtils.inputBoxById(driver,"jigyou_name", "�G���A");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine66.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 67*/
    public String testNameOfficeAndInputBoxKanjiLine67(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine67.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine67.step3");

        CommonUtils.inputBoxById(driver,"jigyou_name", "�Z���^�[");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine67.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 68*/
    public String testNameOfficeAndInputBoxKanjiLine68(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine68.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine68.step3");

        CommonUtils.inputBoxById(driver,"jigyou_name", "�N���l�R��}��");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine68.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 69*/
    public String testCodeOfficeAndInputBoxKanjiLine69(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine69.step2");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine69.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 70*/
    public String testCodeOfficeAndInputBoxKanjiLine70(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine70.step2");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine70.step3");

        CommonUtils.inputBoxById(driver,"jigyou_cd", "12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine70.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 71*/
    public String testCodeOfficeAndInputBoxKanjiLine71(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine71.step2");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine71.step3");

        CommonUtils.inputBoxById(driver,"jigyou_cd", "1234567");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine71.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 72*/
    public String testCodeOfficeAndInputBoxKanjiLine72(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine72.step2");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine72.step3");

        CommonUtils.inputBoxById(driver,"jigyou_cd", "�P�Q�R�S�T�U");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine72.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 73*/
    public String testCodeOfficeAndInputBoxKanjiLine73(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine73.step2");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine73.step3");

        CommonUtils.inputBoxById(driver,"jigyou_cd", "�P�Q�R�S�T�U�V�W�X�O�P�Q�R�S�T�U�V�W�X�O");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine73.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 74*/
    public String testCodeOfficeAndInputBoxKanjiLine74(){
        String messageError = "";

        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine74.step2");

        CommonUtils.inputBoxById(driver, "kana","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine74.step3");

        CommonUtils.onClickById(driver, "kanji_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine74.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 75*/
    public String testInputKanaAndInputBoxKanjiLine75(){
        String messageError = "";

        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"inputKanaAndInputBoxKanjiLine75.step2");

        CommonUtils.inputBoxById(driver, "kanji","12345");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"inputKanaAndInputBoxKanjiLine75.step3");

        CommonUtils.onClickById(driver, "kana_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"inputKanaAndInputBoxKanjiLine75.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 76*/
    public String testCodeOfficeAndInputBoxKanjiLine76(){
        String messageError = "";

        CommonUtils.inputBoxById(driver, "kanji","12345");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine76.step2");

        CommonUtils.inputBoxById(driver, "jigyou_name","");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine76.step3");

        CommonUtils.inputBoxById(driver, "jigyou_cd","000006");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine76.step4");

        CommonUtils.onClickById(driver, "syukan_cd_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine76.step5");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 77*/
    public String testCodeOfficeAndInputBoxKanjiLine77(){
        String messageError = "";
        CommonUtils.inputBoxById(driver, "kanji","12345");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine77.step2");

        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine77.step3");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine77.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 78*/
    public String testCodeOfficeAndInputBoxKanjiLine78(){
        String messageError = "";
        CommonUtils.inputBoxById(driver, "kanji","12345");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine78.step2");

        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(3);

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine78.step3");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine78.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        messageError = driver.findElement(By.className("error")).getText();

        return messageError;
    }
    /*Test-case line 81*/
    public String testBranchAndInputBoxKanjiLine81(){
        String message = "";
        CommonUtils.inputBoxById(driver, "kanji","�g�c�@�T��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine81.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine81.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled())
            message = driver.findElement(By.cssSelector("ul.searchList > li.searchShimeiStep2Button > div > p")).getText();

        return message;
    }
    /*Test-case line 82*/
    public String testOfficeScreenLine82(){
        String message = "";
        CommonUtils.inputBoxById(driver, "kanji","�g�c�@�T��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine82.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine82.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine82.step4");

//        String  indexClick = driver.findElement(By.cssSelector("ul.searchList > li.searchShimeiStep2Button > div > span")).getText();
        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){

            CommonUtils.onClickByClassName(driver, "searchShimeiStep2Button");

            CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine82.step5");

            message = driver.findElement(By.cssSelector("ul.searchList > li.selectVotedUserButton > div > p")).getText();
        }

        return message;
    }

    /*Test-case line 83*/
    public String testBranchAndInputBoxKanjiLine83(){
        String message = "";
        CommonUtils.inputBoxById(driver, "kanji","�g�c");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine83.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(1);

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine83.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled())
            message = driver.findElement(By.cssSelector("ul.searchList > li.searchShimeiStep2Button > div > p")).getText();

        return message;
    }
    /*Test-case line 84*/
    public String testOfficeScreenLine84(){
        String message = "";
        CommonUtils.inputBoxById(driver, "kanji","�g�c�@�T��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine84.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine84.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine84.step4");

//        String  indexClick = driver.findElement(By.cssSelector("ul.searchList > li.searchShimeiStep2Button > div > span")).getText();
        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){

            CommonUtils.onClickByClassName(driver, "searchShimeiStep2Button");

            CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine84.step5");

            message = driver.findElement(By.cssSelector("ul.searchList > li.selectVotedUserButton > div > p")).getText();
        }
        return message;
    }
    /*Test-case line 85*/
    public String testBranchAndInputBoxKanjiLine85(){
        String message = "";
        CommonUtils.inputBoxById(driver, "kanji","�T��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine85.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine85.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");
        message = driver.findElement(By.className("error")).getText();

        return message;
    }

    /*Test-case line 86*/
    public String testBranchAndInputBoxKanaLine86(){
        String message = "";

        CommonUtils.onClickById(driver, "kana_radio");
        CommonUtils.inputBoxById(driver, "kana","ּ�� �ݲ�");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanaLine86.step2");

        CommonUtils.onClickById(driver, "kana_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanaLine86.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled())
            message = driver.findElement(By.cssSelector("ul.searchList > li.searchShimeiStep2Button > div > p")).getText();

        return message;
    }
    /*Test-case line 87*/
    public String testOfficeScreenLine87(){
        String message = "";

        CommonUtils.onClickById(driver, "kana_radio");
        CommonUtils.inputBoxById(driver, "kana","�g�c�@�T��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine87.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine87.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine87.step4");

//        String  indexClick = driver.findElement(By.cssSelector("ul.searchList > li.searchShimeiStep2Button > div > span")).getText();
        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){

            CommonUtils.onClickByClassName(driver, "searchShimeiStep2Button");

            CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine87.step5");

            message = driver.findElement(By.cssSelector("ul.searchList > li.selectVotedUserButton > div > p")).getText();
        }

        return message;
    }

    /*Test-case line 88*/
    public String testBranchAndInputBoxKanaLine88(){
        String message = "";

        CommonUtils.onClickById(driver, "kana_radio");
        CommonUtils.inputBoxById(driver, "kana","ּ��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanaLine88.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanaLine88.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled())
            message = driver.findElement(By.cssSelector("ul.searchList > li.searchShimeiStep2Button > div > p")).getText();

        return message;
    }
    /*Test-case line 89*/
    public boolean testOfficeScreenLine89(){
        boolean checkTextExist = false;

        CommonUtils.onClickById(driver, "kana_radio");
        CommonUtils.inputBoxById(driver, "kana","�g�c�@�T��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine89.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine89.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine89.step4");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�슋���Z���^�[")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '���M���Z���^�[')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine89.step5");
                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(subActualValue.contains("�g�c�@�T��") || subActualValue.contains("�g��@�T��")){
                            checkTextExist = true;
                        }
                    }
                }
            }

        }
        return checkTextExist;
    }
    /*Test-case line 90*/
    public String testBranchAndInputBoxKanaLine90(){
        String message = "";
        CommonUtils.onClickById(driver,"kana_radio");
        CommonUtils.inputBoxById(driver, "kana","�ݲ�");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanaLine90.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);

        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanaLine90.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");
        message = driver.findElement(By.className("error")).getText();

        return message;
    }

    /*Test-case line 91*/
    public String testNameOfficeAndInputBoxKanjiLine91(){
        String message = "";

        CommonUtils.inputBoxById(driver, "kanji","�g");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine91.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine91.step3");

        CommonUtils.inputBoxById(driver ,"jigyou_name", "�슋���Z���^�[");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine91.step4");


        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled())
            message = driver.findElement(By.cssSelector("ul.searchList > li.searchShimeiStep2Button > div > p")).getText();

        return message;
    }
    /*Test-case line 92*/
    public String testOfficeScreenLine92(){
        String message = "";

        CommonUtils.inputBoxById(driver, "kanji","�g");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine92.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine92.step3");

        CommonUtils.inputBoxById(driver ,"jigyou_name", "�슋���Z���^�[");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine92.step4");


        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){

            CommonUtils.onClickByClassName(driver, "searchShimeiStep2Button");

            CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine92.step5");

            message = driver.findElement(By.cssSelector("ul.searchList > li.selectVotedUserButton > div > p")).getText();
        }

        return message;
    }

    /*Test-case line 93*/
    public String testNameOfficeAndInputBoxKanjiLine93(){
        String message = "";

        CommonUtils.inputBoxById(driver, "kanji","�g");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine93.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine93.step3");

        CommonUtils.inputBoxById(driver ,"jigyou_name", "�슋��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine93.step4");


        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled())
            message = driver.findElement(By.cssSelector("ul.searchList > li.searchShimeiStep2Button > div > p")).getText();

        return message;
    }
    /*Test-case line 94*/
    public boolean testOfficeScreenLine94(){
        boolean checkTextExist = true;

        CommonUtils.inputBoxById(driver, "kanji","�g");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine94.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine94.step3");

        CommonUtils.inputBoxById(driver ,"jigyou_name", "�슋��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine94.step4");


        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�슋���Z���^�[")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '�슋���Z���^�[')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine94.step5");

                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(subActualValue.contains("�g��@D�Y") || subActualValue.contains("�g�c�@�T�l")){
                            checkTextExist = true;
                        }
                    }
                }
            }
        }
        return checkTextExist;
    }
    /*Test-case line 95*/
    public boolean testBranchAndInputBoxKanaLine95(){
        boolean checkTextExist = true;

        CommonUtils.inputBoxById(driver, "kanji","�g");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine95.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine95.step3");

        CommonUtils.inputBoxById(driver ,"jigyou_name", "���Z���^�[");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine95.step4");


        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(!actualValue.contains("���M���Z���^�[") || !actualValue.contains("�슋���Z���^�[")){
                    checkTextExist = false;
                }
            }
        }

        return checkTextExist;
    }

    /*Test-case line 96*/
    public boolean testOfficeScreenLine96(){
       boolean checkTextExist = false;
        CommonUtils.inputBoxById(driver, "kanji","�g");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine96.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine96.step3");

        CommonUtils.inputBoxById(driver ,"jigyou_name", "���M���Z���^�[");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine96.step4");


        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("���M���Z���^�[")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '���M���Z���^�[')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine96.step5");

                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(subActualValue.contains("�g�c�@�T�O")){
                            checkTextExist = true;
                        }
                    }
                }
            }
        }
        return checkTextExist;
    }
    /*Test-case line 97*/
    public boolean testCodeOfficeAndInputBoxKanjiLine97(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine97.step2");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine97.step3");

        CommonUtils.inputBoxById(driver ,"jigyou_cd", "000202");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine97.step4");


        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("���M���Z���^�[")){
                    checkTextExist = true;
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 98*/
    public boolean testOfficeScreenLine98(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine98.step2");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine98.step3");

        CommonUtils.inputBoxById(driver ,"jigyou_cd", "000202");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine98.step4");


        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("���M���Z���^�[")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '���M���Z���^�[')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine98.step5");
                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(subActualValue.contains("�g�c�@�T��") || subActualValue.contains("�g�c�@�T��")){
                            checkTextExist = true;
                        }
                    }
                }
            }
        }
        return checkTextExist;
    }
    /*Test-case line 99*/
    public boolean testSelectBranchAndInputKanjiLine99(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testSelectBranchAndInputKanjiLine99.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testSelectBranchAndInputKanjiLine99.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("���M���Z���^�[") || actualValue.contains("�D�y��ǎx�X")
                        || actualValue.contains("���M���Z���^�[")){
                    checkTextExist = true;
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 100*/
    public boolean testOfficeScreenLine100(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine100.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine100.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�D�y��ǎx�X")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '�D�y��ǎx�X')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine100.step5");
                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(subActualValue.contains("�g��@C�Y")){
                            checkTextExist = true;
                        }
                    }
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 101*/
    public boolean testSelectBranchAndInputKanjiLine101(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g�c");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testSelectBranchAndInputKanjiLine101.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testSelectBranchAndInputKanjiLine101.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("���M���Z���^�[") || actualValue.contains("���M���Z���^�[")){
                    checkTextExist = true;
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 102*/
    public boolean testOfficeScreenLine102(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine102.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine102.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�슋���Z���^�[")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '�슋���Z���^�[')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine102.step5");
                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(subActualValue.contains("�g�c�@�T�O")){
                            checkTextExist = true;
                        }
                    }
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 103*/
    public boolean testNameOfficeAndInputKanjiLine103(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g�c");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine103.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.inputBoxById(driver, "jigyou_name", "���Z���^�[");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine103.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("���M���Z���^�[") || actualValue.contains("�슋���Z���^�[")){
                    checkTextExist = true;
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 104*/
    public boolean testOfficeScreenLine104(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine104.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.inputBoxById(driver, "jigyou_name", "���Z���^�[");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine104.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�슋���Z���^�[")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '�슋���Z���^�[')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine104.step5");
                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(subActualValue.contains("�g�c�@�T�l")){
                            checkTextExist = true;
                        }
                    }
                }
            }
        }
        return checkTextExist;
    }
    /*Test-case line 105*/
    public boolean testCodeOfficeAndInputKanjiLine105(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g�c");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanjiLine105.step2");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");
        CommonUtils.inputBoxById(driver, "jigyou_cd", "031414");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanjiLine105.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�슋���Z���^�[")){
                    checkTextExist = true;
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 106*/
    public boolean testOfficeScreenLine106(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine106.step2");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");
        CommonUtils.inputBoxById(driver, "jigyou_cd", "031414");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine106.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�슋���Z���^�[")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '�슋���Z���^�[')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine106.step5");
                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(subActualValue.contains("�g�c�@�T�l")){
                            checkTextExist = true;
                        }
                    }
                }
            }
        }
        return checkTextExist;
    }
    /*Test-case line 107*/
    public boolean testSelectBranchAndInputKanaLine107(){
        boolean checkTextExist = false;

        CommonUtils.onClickById(driver, "kana_radio");
        CommonUtils.inputBoxById(driver, "kana","ּ��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testSelectBranchAndInputKanaLine107.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testSelectBranchAndInputKanaLine107.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("���M���Z���^�[") || actualValue.contains("���M���Z���^�[")){
                    checkTextExist = true;
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 108*/
    public boolean testOfficeScreenLine108(){
        boolean checkTextExist = false;

        CommonUtils.onClickById(driver, "kana_radio");
        CommonUtils.inputBoxById(driver, "kana","ּ��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine108.step2");

        CommonUtils.onClickById(driver, "syukan_cd_radio");
        Select drop = new Select(driver.findElement(By.id("syukan_cd")));
        drop.selectByIndex(2);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine108.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("���M���Z���^�[")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '���M���Z���^�[')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine108.step5");
                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(subActualValue.contains("�g�c�@�T�O")){
                            checkTextExist = true;
                        }
                    }
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 109*/
    public boolean testNameOfficeAndInputKanaLine109(){
        boolean checkTextExist = false;

        CommonUtils.onClickById(driver, "kana_radio");
        CommonUtils.inputBoxById(driver, "kana","ּ��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanaLine109.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.inputBoxById(driver, "jigyou_name", "���Z���^�[");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanaLine109.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("���M���Z���^�[") || actualValue.contains("�슋���Z���^�[")){
                    checkTextExist = true;
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 110*/
    public boolean testOfficeScreenLine110(){
        boolean checkTextExist = false;

        CommonUtils.onClickById(driver, "kana_radio");
        CommonUtils.inputBoxById(driver, "kana","ּ��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine110.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.inputBoxById(driver, "jigyou_name", "���Z���^�[");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine110.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�슋���Z���^�[")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '�슋���Z���^�[')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine110.step5");
                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(subActualValue.contains("�g�c�@�T�l")){
                            checkTextExist = true;
                        }
                    }
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 111*/
    public boolean testCodeOfficeAndInputKanaLine111(){
        boolean checkTextExist = false;

        CommonUtils.onClickById(driver, "kana_radio");
        CommonUtils.inputBoxById(driver, "kana","ּ��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanaLine111.step2");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");
        CommonUtils.inputBoxById(driver, "jigyou_cd", "031414");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanaLine111.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("���M���Z���^�[") || actualValue.contains("�슋���Z���^�[")){
                    checkTextExist = true;
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 112*/
    public boolean testOfficeScreenLine112(){
        boolean checkTextExist = false;

        CommonUtils.onClickById(driver, "kana_radio");
        CommonUtils.inputBoxById(driver, "kana","ּ��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine112.step2");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");
        CommonUtils.inputBoxById(driver, "jigyou_cd", "031414");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine112.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�슋���Z���^�[")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '�슋���Z���^�[')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine112.step5");
                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(subActualValue.contains("�g�c�@�T�l")){
                            checkTextExist = true;
                        }
                    }
                }
            }
        }
        return checkTextExist;
    }
    /*Test-case line 113*/
    public boolean testCodeOfficeAndInputKanaLine113(){
        boolean checkTextExist = false;

        CommonUtils.onClickById(driver, "kana_radio");
        CommonUtils.inputBoxById(driver, "kana","ּ��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanaLine113.step2");

        CommonUtils.onClickById(driver, "jigyou_cd_radio");
        CommonUtils.inputBoxById(driver, "jigyou_cd", "031414");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanaLine113.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("���M���Z���^�[") || actualValue.contains("�슋���Z���^�[")){
                    checkTextExist = true;
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 114*/
    public boolean testClickFourLine114(){
        boolean checkTextExist = false;

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanaLine113.step2");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanaLine113.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanaLine113.step4");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanaLine113.step5");

       if(CommonUtils.getValueBoxByClassName(driver, "error").equals("�����񐔂̏���𒴂��܂����B"))
           checkTextExist = true;


        return checkTextExist;
    }

    /*Test-case line 115*/
    public boolean testNameOfficeAndInputKanjiLine115(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine115.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.inputBoxById(driver, "jigyou_name", "�l��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine115.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�l���헪��") || actualValue.contains("�l���헪������")){
                    checkTextExist = true;
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 116*/
    public boolean testOfficeScreenLine116(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine116.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.inputBoxById(driver, "jigyou_name", "�l��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine116.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�l������������")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '�l������������')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine116.step5");
                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(!subActualValue.contains("�g��@�`�Y")){
                            checkTextExist = true;
                        }
                    }
                }
            }
        }
        return checkTextExist;
    }
    /*Test-case line 117*/
    public boolean testNameOfficeAndInputKanjiLine117(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine117.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.inputBoxById(driver, "jigyou_name", "�l��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine117.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�l���헪��") || actualValue.contains("�l������������")){
                    checkTextExist = true;
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 118*/
    public boolean testOfficeScreenLine118(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine118.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.inputBoxById(driver, "jigyou_name", "�l��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine118.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�l���헪��")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '�l���헪��')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine118.step5");
                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(subActualValue.contains("�g��@B�Y")){
                            checkTextExist = true;
                        }
                    }
                }
            }
        }
        return checkTextExist;
    }
    /*Test-case line 119*/
    public boolean testNameOfficeAndInputKanjiLine119(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine119.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.inputBoxById(driver, "jigyou_name", "�k���{���");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine119.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�l���헪��") || actualValue.contains("�l������������")){
                    checkTextExist = true;
                }
            }
        }
        return checkTextExist;
    }

    /*Test-case line 120*/
    public boolean testOfficeScreenLine120(){
        boolean checkTextExist = false;

        CommonUtils.inputBoxById(driver, "kanji","�g��");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine120.step2");

        CommonUtils.onClickById(driver, "jigyou_name_radio");
        CommonUtils.inputBoxById(driver, "jigyou_name", "�k���{���");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine120.step3");

        CommonUtils.onClickByClassName(driver, "searchShimeiStep1Button");

        if(driver.findElement(By.cssSelector("ul.searchList")).isEnabled()){
            List<WebElement> listMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li"));
            Iterator<WebElement> items = listMessage.iterator();
            while (items.hasNext()){
                WebElement row  = items.next();
                String actualValue = row.getText();
                if(actualValue.contains("�k���{��ǎx�X")){
                    driver.findElement(By.xpath("//*[@id='page_1']/ul/li//p[contains(text(), '�k���{��ǎx�X')]")).click();
                    CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine120.step5");
                    List<WebElement> subListMessage = driver.findElements(By.xpath("//*[@id='page_1']/ul/li[contains(@class,'selectVotedUserButton')]"));
                    Iterator<WebElement> subItems = subListMessage.iterator();
                    while (subItems.hasNext()){
                        WebElement subRow  = subItems.next();
                        String subActualValue = subRow.getText();
                        if(subActualValue.contains("�g��@E�Y")){
                            checkTextExist = true;
                        }
                    }
                }
            }
        }
        return checkTextExist;
    }
}
