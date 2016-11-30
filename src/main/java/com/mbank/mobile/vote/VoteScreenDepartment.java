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
 * Created by FRAMGIA\dang.ngoc.thien on 31/10/2016.
 */
public class VoteScreenDepartment {
    public WebDriver driver;
    private boolean isCheckValue = false;
    private String idManzokuComment = "manzokucomment";
    private String idPersonalNumber = "vkojin_id";
    private String btnSearchByClass = "tohyoKozinSearchButton";
    private String btnConfirmByClass = "tohyoConfirmButton";
    private String btnErrorByClass = "error";

    public VoteScreenDepartment(WebDriver driver) {
        this.driver = driver;
    }
    /*test case line 68*/
    public boolean testInputCommentLine68(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"111740");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine68.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"111740") || StringUtils.equals(actualValue,"サービス")
                    || StringUtils.equals(actualValue, "031414") || StringUtils.equals(actualValue,"南葛西センター")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 69*/
    public boolean testInputCommentLine69(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"111740");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine69.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.onClickById(driver, idManzokuComment);
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｄ郎さん");
        CommonUtils.takeScreenShot(driver,Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine69.step3");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"111740") || StringUtils.equals(actualValue,"サービス")
                    || StringUtils.equals(actualValue, "031414") || StringUtils.equals(actualValue,"南葛西センター")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 70*/
    public boolean testInputCommentLine70(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"111740");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine70.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine70.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｄ郎さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine70.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine70.step5");

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
    /*test case line 71*/
    public boolean testInputCommentLine71(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"111740");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine71.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine71.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｄ郎さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine71.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine71.step5");

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
    /*test case line 72*/
    public boolean testInputCommentLine72(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"151914");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine72.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        for (int i = 0; i < elementList.size(); i ++){
            String actualValue = elementList.get(i).getText();
            if(i == 2 && StringUtils.equals(actualValue,"集配")){
                isCheckValue = true;
            }
        }
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine72.step3");
        return isCheckValue;
    }
    /*test case line 73*/
    public boolean testInputCommentLine73(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"151914");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine73.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.onClickById(driver, idManzokuComment);
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　慎三さん");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine73.step3");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        for (int i = 0; i < elementList.size(); i ++){
            String actualValue = elementList.get(i).getText();
            if(i == 2 && StringUtils.equals(actualValue,"集配")){
                isCheckValue = true;
            }
        }
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine73.step4");
        return isCheckValue;
    }
    /*test case line 74*/
    public boolean testInputCommentLine74(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102206");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine74.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        for (int i = 0; i < elementList.size(); i ++){
            String actualValue = elementList.get(i).getText();
            if(i == 2 && StringUtils.equals(actualValue,"作業")){
                isCheckValue = true;
            }
        }
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine74.step3");
        return isCheckValue;
    }
    /*test case line 75*/
    public boolean testInputCommentLine75(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102206");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine75.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.onClickById(driver, idManzokuComment);
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉田　慎四さん");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine75.step3");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        for (int i = 0; i < elementList.size(); i ++){
            String actualValue = elementList.get(i).getText();
            if(i == 2 && StringUtils.equals(actualValue,"作業")){
                isCheckValue = true;
            }
        }
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine75.step4");
        return isCheckValue;
    }
    /*test case line 76*/
    public boolean testInputCommentLine76(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"111740");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine76.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        for (int i = 0; i < elementList.size(); i ++){
            String actualValue = elementList.get(i).getText();
            if(i == 2 && StringUtils.equals(actualValue,"サービス")){
                isCheckValue = true;
            }
        }
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine76.step3");
        return isCheckValue;
    }
    /*test case line 77*/
    public boolean testInputCommentLine77(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"111740");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine77.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.onClickById(driver, idManzokuComment);
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｄ郎さん");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine77.step3");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        for (int i = 0; i < elementList.size(); i ++){
            String actualValue = elementList.get(i).getText();
            if(i == 2 &&(StringUtils.equals(actualValue,"サービス"))){
                isCheckValue = true;
            }
        }
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine77.step4");
        return isCheckValue;
    }
    /*test case line 78*/
    public boolean testInputCommentLine78(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine78.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        for (int i = 0; i < elementList.size(); i ++){
            String actualValue = elementList.get(i).getText();
            if(i == 2 && StringUtils.equals(actualValue,"スタッフ")){
                isCheckValue = true;
            }
        }
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine78.step3");
        return isCheckValue;
    }
    /*test case line 79*/
    public boolean testInputCommentLine79(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine79.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.onClickById(driver, idManzokuComment);
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｅ郎さん");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine79.step3");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        for (int i = 0; i < elementList.size(); i ++){
            String actualValue = elementList.get(i).getText();
            if(i ==2 && StringUtils.equals(actualValue,"スタッフ")){
                isCheckValue = true;
            }
        }
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine79.step4");
        return isCheckValue;
    }
    /*test case line 80*/
    public String testInputCommentLine80(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"140608");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine80.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine80.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 81*/
    public String testInputCommentLine81(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"140608");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine81.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉田　慎一さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine81.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 82*/
    public boolean testInputCommentLine82(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"140608");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine82.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine82.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉田　慎一さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine82.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine82.step5");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='comp']/span[@class='point']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"吉川　Ａ郎　0pt") || StringUtils.equals(actualValue,"吉田　慎一　10pt")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 83*/
    public String testInputCommentLine83(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"140608");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine83.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine83.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 84*/
    public String testInputCommentLine84(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"140608");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine84.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉田　慎一さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine84.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 85*/
    public boolean testInputCommentLine85(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"140608");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine85.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine85.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉田　慎一さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine85.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine85.step5");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='comp']/span[@class='point']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"吉川　慎四　3pt") || StringUtils.equals(actualValue,"吉田　慎一　10pt")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 86*/
    public String testInputCommentLine86(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"140608");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine86.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine86.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 87*/
    public String testInputCommentLine87(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"140608");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine87.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉田　慎一さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine87.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 88*/
    public boolean testInputCommentLine88(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"140608");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine88.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine88.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉田　慎一さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine88.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine88.step5");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='comp']/span[@class='point']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"吉川　Ｄ郎　3pt") || StringUtils.equals(actualValue,"吉田　慎一　10pt")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 89*/
    public String testInputCommentLine89(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine89.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine89.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 90*/
    public String testInputCommentLine90(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine90.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｃ郎さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine90.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 91*/
    public boolean testInputCommentLine91(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine91.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine91.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｃ郎さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine91.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine91.step5");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='comp']/span[@class='point']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"吉川　Ｂ郎　3pt") || StringUtils.equals(actualValue,"吉川　Ｃ郎　10pt")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 92*/
    public String testInputCommentLine92(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine92.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine92.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 93*/
    public String testInputCommentLine93(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine93.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｃ郎さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine93.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 94*/
    public boolean testInputCommentLine94(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine94.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine94.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｃ郎さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine94.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine94.step5");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='comp']/span[@class='point']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"吉川　Ｂ郎　3pt") || StringUtils.equals(actualValue,"吉川　Ｃ郎　10pt")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 95*/
    public String testInputCommentLine95(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine95.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine95.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 96*/
    public String testInputCommentLine96(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine96.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｃ郎さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine96.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 97*/
    public boolean testInputCommentLine97(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine97.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine97.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｃ郎さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine97.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine97.step5");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='comp']/span[@class='point']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"吉川　Ｂ郎　3pt") || StringUtils.equals(actualValue,"吉川　Ｃ郎　10pt")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }
    /*test case line 98*/
    public String testInputCommentLine98(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine98.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine98.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 99*/
    public String testInputCommentLine99(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine99.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｃ郎さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine99.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 100*/
    public String testInputCommentLine100(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine100.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine100.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 101*/
    public String testInputCommentLine101(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine101.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｃ郎さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine101.step3");

        return CommonUtils.getValueBoxByClassName(driver, btnErrorByClass);
    }
    /*test case line 102*/
    public boolean testInputCommentLine102(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"102056");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine102.step2");
        CommonUtils.onClickByClassName(driver, btnSearchByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine102.step3");

        CommonUtils.inputBoxById(driver, idManzokuComment, "いつもありがとう！吉川　Ｃ郎さん");
        CommonUtils.onClickByClassName(driver, btnConfirmByClass);
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine102.step4");

        CommonUtils.onClickByClassName(driver, "tohyouComButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE_COMMENT+"testInputCommentLine102.step5");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='comp']/span[@class='point']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            String actualValue = row.getText();
            if(StringUtils.equals(actualValue,"吉川　Ｂ郎　3pt") || StringUtils.equals(actualValue,"吉川　Ｃ郎　10pt")){
                isCheckValue = true;
            }
        }
        return isCheckValue;
    }

}
