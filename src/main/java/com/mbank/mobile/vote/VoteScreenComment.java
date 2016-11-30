package com.mbank.mobile.vote;

import com.mbank.mobile.common.CommonUtils;
import com.mbank.mobile.common.Constants;
import com.mbank.mobile.common.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 28/10/2016.
 */
public class VoteScreenComment {
    public WebDriver driver;
    private boolean isCheckValue = false;
    private String idManzokuComment = "manzokucomment";
    private String idPersonalNumber = "vkojin_id";
    private String btnSearchByClass = "tohyoKozinSearchButton";
    private String btnConfirmByClass = "tohyoConfirmButton";
    private String btnErrorByClass = "error";
    public VoteScreenComment(WebDriver driver) {
        this.driver = driver;
    }
    /*test case line 38*/
    public String testInputCommentLine38(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine38.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine38.step3");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 39*/
    public String testInputCommentLine39(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine39.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine39.step3");
        CommonUtils.inputBoxById(driver, idManzokuComment, "ÇPÇQÇRÇSÇTÇUÇVÇWÇX");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine39.step4");

        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 40*/
    public String testInputCommentLine40(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine40.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine40.step3");
        CommonUtils.inputBoxById(driver, idManzokuComment, "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine40.step4");

        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 41*/
    public String testInputCommentLine41(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine41.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine41.step3");
        CommonUtils.inputBoxById(driver, idManzokuComment, "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇP");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine41.step4");

        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 42*/
    public String testInputCommentLine42(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine42.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine42.step3");
        CommonUtils.inputBoxById(driver, idManzokuComment, "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO\n" +
                "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇOÇPÇQ");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine42.step4");

        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 43*/
    public String testInputCommentLine43(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"999999");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine43.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine43.step3");
        CommonUtils.inputBoxById(driver, idManzokuComment, "ÇPÇQÇRÇSÇTÇUÇVÇWÇXÇO");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine43.step4");

        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 44*/
    public boolean testInputCommentLine44(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine44.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine44.step3");
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"501006") || StringUtils.equals(actualValue,"ÉXÉ^ÉbÉt")
                    || StringUtils.equals(actualValue, "0AE000") || StringUtils.equals(actualValue,"êléñêÌó™ïî")){
                  isCheckValue = true;
            }
        }
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine44.step4");
        return isCheckValue;
    }
    /*test case line 45*/
    public boolean testInputCommentLine45(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine45.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine45.step3");
        CommonUtils.inputBoxById(driver, idManzokuComment, "ÉRÉÅÉìÉg l?ÅuÇ¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgêÏÅ@BòYÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine45.step4");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"501006") || StringUtils.equals(actualValue,"ÉXÉ^ÉbÉt")
                    || StringUtils.equals(actualValue, "0AE000") || StringUtils.equals(actualValue,"êléñêÌó™ïî")){
                isCheckValue = true;
            }
        }
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine45.step5");
        return isCheckValue;
    }
    /*test case line 46*/
    public boolean testInputCommentLine46(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine46.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine46.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgêÏÅ@CòYÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine46.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine46.step5");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='comp']/span[@class='point']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"ãgìcÅ@êTàÍÅ@3pt") || StringUtils.equals(actualValue,"ãgêÏÅ@BòYÅ@10pt")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 47*/
    public boolean testInputCommentLine47(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine47.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine47.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgêÏÅ@CòYÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine47.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine47.step5");
        CommonUtils.onClickByClassName(driver, "tohyoEditLink");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine47.step6");
        return CommonUtils.isDisplayById(driver, idPersonalNumber);
    }
    /*test case line 48*/
    public boolean testInputCommentLine48(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine48.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine48.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgêÏÅ@CòYÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine48.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine48.step5");
        CommonUtils.onClickByClassName(driver, "tohyoEditLink");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine48.step6");

        return StringUtils.isEmpty(CommonUtils.getValueBoxById(driver, idPersonalNumber));
    }
    /*test case line 49*/
    public boolean testInputCommentLine49(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine49.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine49.step3");
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"102056") || StringUtils.equals(actualValue,"ÉXÉ^ÉbÉt")
                    || StringUtils.equals(actualValue, "000010") || StringUtils.equals(actualValue,"éDñyéÂä«éxìX")){
                isCheckValue = true;
            }
        }
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine49.step4");
        return isCheckValue;
    }
    /*test case line 50*/
    public boolean testInputCommentLine50(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine50.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine50.step3");
        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgêÏÅ@CòYÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine50.step4");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"102056") || StringUtils.equals(actualValue,"ÉXÉ^ÉbÉt")
                    || StringUtils.equals(actualValue, "000010") || StringUtils.equals(actualValue,"éDñyéÂä«éxìX")){
                isCheckValue = true;
            }
        }
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine50.step5");
        return isCheckValue;
    }
    /*test case line 51*/
    public boolean testInputCommentLine51(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine51.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine51.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgêÏÅ@CòYÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine51.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine51.step5");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='comp']/span[@class='point']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"102056") || StringUtils.equals(actualValue,"ÉXÉ^ÉbÉt")
                    || StringUtils.equals(actualValue, "000010") || StringUtils.equals(actualValue,"éDñyéÂä«éxìX")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 52*/
    public boolean testInputCommentLine52(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine52.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine52.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgêÏÅ@CòYÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine52.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine52.step5");
        CommonUtils.onClickByClassName(driver, "tohyoEditLink");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine52.step6");
        return CommonUtils.isDisplayById(driver, idPersonalNumber);
    }
    /*test case line 53*/
    public boolean testInputCommentLine53(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine53.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine53.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgêÏÅ@CòYÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine53.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine53.step5");
        CommonUtils.onClickByClassName(driver, "tohyoEditLink");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine53.step6");

        return StringUtils.isEmpty(CommonUtils.getValueBoxById(driver, idPersonalNumber));
    }

    /*test case line 54*/
    public boolean testInputCommentLine54(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine54.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine54.step3");
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"102056") || StringUtils.equals(actualValue,"èWîz")
                    || StringUtils.equals(actualValue, "000202") || StringUtils.equals(actualValue,"è¨íMìåÉZÉìÉ^Å[")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 55*/
    public boolean testInputCommentLine55(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine55.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine55.step3");
        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgìcÅ@êTìÒÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine55.step4");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"102056") || StringUtils.equals(actualValue,"èWîz")
                    || StringUtils.equals(actualValue, "000202") || StringUtils.equals(actualValue,"è¨íMìåÉZÉìÉ^Å[")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 56*/
    public boolean testInputCommentLine56(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine56.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine56.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgìcÅ@êTìÒÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine56.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine56.step5");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='comp']/span[@class='point']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"ãgìcÅ@êTàÍÅ@3pt") || StringUtils.equals(actualValue,"ãgêÏÅ@BòYÅ@10pt")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 57*/
    public boolean testInputCommentLine57(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine57.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine57.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgìcÅ@êTìÒÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine57.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine57.step5");
        CommonUtils.onClickByClassName(driver, "tohyoEditLink");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine57.step6");
        return CommonUtils.isDisplayById(driver, idPersonalNumber);
    }
    /*test case line 58*/
    public boolean testInputCommentLine58(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine58.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine58.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgìcÅ@êTìÒÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine58.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine58.step5");
        CommonUtils.onClickByClassName(driver, "tohyoEditLink");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine58.step6");

        return StringUtils.isEmpty(CommonUtils.getValueBoxById(driver, idPersonalNumber));
    }
    /*test case line 59*/
    public boolean testInputCommentLine59(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"151914");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine59.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine59.step3");
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"151914") || StringUtils.equals(actualValue,"èWîz")
                    || StringUtils.equals(actualValue, "000201") || StringUtils.equals(actualValue,"è¨íMêºÉZÉìÉ^Å[")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 60*/
    public boolean testInputCommentLine60(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"151914");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine60.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine60.step3");
        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgêÏÅ@ÇdòYÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine60.step4");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"151914") || StringUtils.equals(actualValue,"èWîz")
                    || StringUtils.equals(actualValue, "000201") || StringUtils.equals(actualValue,"è¨íMêºÉZÉìÉ^Å[")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 61*/
    public boolean testInputCommentLine61(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"151914");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine61.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine61.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgêÏÅ@ÇdòYÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine61.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine61.step5");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='comp']/span[@class='point']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"ãgìcÅ@êTàÍÅ@3pt") || StringUtils.equals(actualValue,"ãgêÏÅ@BòYÅ@10pt")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 62*/
    public boolean testInputCommentLine62(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"151914");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine62.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine62.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "Ç¢Ç¬Ç‡Ç†ÇËÇ™Ç∆Ç§ÅIãgêÏÅ@ÇdòYÇ≥ÇÒ");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine62.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine62.step5");
        CommonUtils.onClickByClassName(driver, "tohyoEditLink");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine62.step6");
        return CommonUtils.isDisplayById(driver, idPersonalNumber);
    }
}
