package com.mbank.mobile.vote;

import com.mbank.mobile.common.CommonUtils;
import com.mbank.mobile.common.Constants;
import com.mbank.mobile.common.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 28/10/2016.
 */
public class VoteScreenCommentDisplay {
    public WebDriver driver;
    private boolean isCheckValue = false;
    private String idManzokuComment = "manzokucomment";
    private String idPersonalNumber = "vkojin_id";
    private String btnSearchByClass = "tohyoKozinSearchButton";
    private String btnConfirmByClass = "tohyoConfirmButton";
    private String btnErrorByClass = "error";
    public VoteScreenCommentDisplay(WebDriver driver) {
        this.driver = driver;
    }
    /*test case line 63*/
    public boolean testInputCommentLine63(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102206");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine63.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine63.step3");
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"102206") || StringUtils.equals(actualValue,"作業")
                    || StringUtils.equals(actualValue, "031414") || StringUtils.equals(actualValue,"南葛西センター")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 64*/
    public boolean testInputCommentLine64(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102206");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine64.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine64.step3");
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉田　慎四さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine64.step4");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"102206") || StringUtils.equals(actualValue,"作業")
                    || StringUtils.equals(actualValue, "031414") || StringUtils.equals(actualValue,"南葛西センター")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 65*/
    public boolean testInputCommentLine65(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102206");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine65.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine65.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉田　慎四さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine65.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine65.step5");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='comp']/span[@class='point']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"吉田　慎一　3pt") || StringUtils.equals(actualValue,"吉川　B郎　10pt")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 66*/
    public boolean testInputCommentLine66(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102206");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine66.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine66.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉田　慎四さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine66.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine66.step5");
        CommonUtils.onClickByClassName(driver, "tohyoEditLink");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine66.step6");
        return CommonUtils.isDisplayById(driver, idPersonalNumber);
    }

    /*test case line 67*/
    public String testInputCommentLine67(){
        String actualMessage;
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"331760");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine67.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        actualMessage = CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
        return actualMessage;
    }

}
