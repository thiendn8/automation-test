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
 * Created by FRAMGIA\dang.ngoc.thien on 27/10/2016.
 */
public class VoteScreenFunction {
    public WebDriver driver;
    private String idPersonalNumber = "vkojin_id";
    private String idComment = "manzokucomment";
    boolean isCheckControl = false;

    public VoteScreenFunction(WebDriver driver) {
        this.driver = driver;
    }

    /*test case line 11*/
    public boolean testPersonalNumberLine11V12(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        String actualColor = CommonUtils.getCssValueById(driver, idPersonalNumber,"background-color");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testPersonalNumberLine11V12.step2");
        isCheckControl = Constants.EXP_COLOR_YELLOW.equals(actualColor);

        return isCheckControl;
    }
    /*test case line 13*/
    public boolean testInputPersonalNumberLine13(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"個人番号");
        String actualColor = CommonUtils.getCssValueById(driver, idPersonalNumber,"background-color");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine13.step2");
        isCheckControl = Constants.EXP_COLOR_YELLOW.equals(actualColor);

        return isCheckControl;
    }
    /*test case line 14*/
    public boolean testInputPersonalNumberLine14(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"個人番号");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine14.step2");

        isCheckControl = driver.findElement(By.xpath("//*[@id='mainContents2']/div/dl/dd/p/a[contains(@style,'display: inline')]")).isEnabled();

        return isCheckControl;
    }
    /*test case line 15*/
    public boolean testInputPersonalNumberLine15(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"個人番号");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine15.step2");
        CommonUtils.clearValueBoxById(driver, idPersonalNumber);
        driver.findElement(By.xpath("//*[@id='mainContents2']/div/dl/dd/p/a[contains(@style,'display: inline')]")).click();
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine15.step3");

        isCheckControl = driver.findElement(By.xpath("//*[@id='mainContents2']/div/dl/dd/p/a[contains(@style,'display: none')]")).isEnabled();

        return isCheckControl;
    }
    /*test case line 16*/
    public boolean testInputPersonalNumberLine16(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"個人番号");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine16.step2");
        CommonUtils.clearValueBoxById(driver, idPersonalNumber);
        driver.findElement(By.xpath("//*[@id='mainContents2']/div/dl/dd/p/a[contains(@style,'display: inline')]")).click();
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine16.step3");

        isCheckControl = StringUtils.isEmpty(CommonUtils.getValueBoxById(driver, idPersonalNumber));

        return isCheckControl;
    }
    /*test case line 17*/
    public boolean testInputPersonalNumberLine17(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"個人番号");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine17.step2");
        CommonUtils.clearValueBoxById(driver, idPersonalNumber);
        driver.findElement(By.xpath("//*[@id='mainContents2']/div/dl/dd/p/a[contains(@style,'display: inline')]")).click();
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine17.step3");

        isCheckControl = driver.findElement(By.xpath("//*[@id='mainContents2']/div/dl/dd/p/a[contains(@style,'display: none')]")).isEnabled();

        return isCheckControl;
    }
    /*test case line 18*/
    public String testInputPersonalNumberLine18(){

        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine18.step3");
        return CommonUtils.getValueBoxByClassName(driver,"error");
    }
    /*test case line 19*/
    public String testInputPersonalNumberLine19(){
        String message = "";
        int actualLenght = 7;
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"1234567");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine19.step2");
        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine19.step3");
        if(actualLenght != CommonUtils.getValueBoxById(driver,idPersonalNumber).length())
            message = CommonUtils.getValueBoxByClassName(driver,"error");
        return message;
    }
    /*test case line 20*/
    public String testInputPersonalNumberLine20(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"12345");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine20.step2");
        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine20.step3");
        return CommonUtils.getValueBoxByClassName(driver,"error");
    }
    /*test case line 21*/
    public String testInputPersonalNumberLine21(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"1234567");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine21.step2");
        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine21.step3");
        return CommonUtils.getValueBoxByClassName(driver,"error");
    }
    /*test case line 22*/
    public String testInputPersonalNumberLine22(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"999999");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine22.step2");
        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine22.step3");
        return CommonUtils.getValueBoxByClassName(driver,"error");
    }
    /*test case line 23*/
    public String testInputPersonalNumberLine23(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"140608");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine23.step2");
        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine23.step2");
        return CommonUtils.getValueBoxByClassName(driver,"error");
    }
    /*test case line 24*/
    public String testInputPersonalNumberLine24(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine24.step2");
        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine24.step2");
        return CommonUtils.getValueBoxByClassName(driver,"error");
    }
    /*test case line 25*/
    public String testInputPersonalNumberLine25(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine25.step2");
        CommonUtils.inputBoxById(driver,"manzokucomment","1");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine25.step3");
        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine25.step4");
        return CommonUtils.getValueBoxByClassName(driver,"error");
    }
    /*test case line 26*/
    public String testInputPersonalNumberLine26(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine26.step2");
        CommonUtils.inputBoxById(driver,"manzokucomment","1");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine26.step3");
        return CommonUtils.getValueBoxById(driver,"manzokucomment");
    }
    /*test case line 27*/
    public boolean testInputPersonalNumberLine27(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine27.step2");
        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            java.lang.String actualValue = row.getText();
            if(StringUtils.isNotEmpty(actualValue)){
                isCheckControl = true;
            }
        }
        return isCheckControl;
    }
    /*test case line 28*/
    public String testInputPersonalNumberLine28(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine26.step2");
        return CommonUtils.getValueBoxById(driver,idPersonalNumber);
    }
    /*test case line 29*/
    public boolean testInputPersonalNumberLine29(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine29.step2");
        return CommonUtils.isEnabledById(driver,"manzokucomment");
    }
    /*test case line 30*/
    public boolean testInputPersonalNumberLine30(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.onClickByClassName(driver, "tohyoKozinSearchButton");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberLine30.step2");
        return CommonUtils.isEnabledByClassName(driver, "tohyoConfirmButton");
    }

    /*test case line 31*/
    public boolean testInputPersonalNumberAndCommentLine31(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberAndCommentLine31.step2");
        CommonUtils.onClickByClassName(driver,"tohyoKozinSearchButton");
        CommonUtils.onClickById(driver, "manzokucomment");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberAndCommentLine31.step3");

        isCheckControl = CommonUtils.getValueScrollY(driver) == 0;

        return isCheckControl;
    }
    /*test case line 32*/
    public boolean testInputPersonalNumberAndCommentLine32(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        String actualColor = CommonUtils.getCssValueById(driver, idComment,"background-color");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberAndCommentLine32.step2");
        isCheckControl = Constants.EXP_COLOR_YELLOW.equals(actualColor);

        return isCheckControl;
    }

    /*test case line 33*/
    public boolean testInputPersonalNumberAndCommentLine33(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberAndCommentLine33.step2");
        CommonUtils.onClickByClassName(driver,"tohyoKozinSearchButton");
        CommonUtils.onClickById(driver, "manzokucomment");
        CommonUtils.inputBoxById(driver, idComment, "コメント");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberAndCommentLine33.step3");
        String actualColor = CommonUtils.getCssValueById(driver, idComment, "background-color");
        isCheckControl = Constants.EXP_COLOR_YELLOW.equals(actualColor);

        return isCheckControl;
    }
    /*test case line 34*/
    public boolean testInputPersonalNumberAndCommentLine34(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberAndCommentLine34.step2");
        CommonUtils.onClickByClassName(driver,"tohyoKozinSearchButton");
        CommonUtils.onClickById(driver, "manzokucomment");
        CommonUtils.inputBoxById(driver, idComment, "コメント");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberAndCommentLine34.step3");
        isCheckControl = driver.findElement(By.xpath("//*[@class='voteCommentArea']/p/a")).isEnabled();

        return isCheckControl;
    }
    /*test case line 35*/
    public boolean testInputPersonalNumberAndCommentLine35(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberAndCommentLine35.step2");
        CommonUtils.onClickByClassName(driver,"tohyoKozinSearchButton");
        CommonUtils.onClickById(driver, "manzokucomment");
        CommonUtils.inputBoxById(driver, idComment, "コメント");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberAndCommentLine35.step3");
        CommonUtils.clearValueBoxById(driver, idComment);
        driver.findElement(By.xpath("//*[@class='voteCommentArea']/p/a")).click();
        isCheckControl = driver.findElement(By.xpath("//*[@class='voteCommentArea']/p/a[contains(@style,'display: none')]")).isEnabled();

        return isCheckControl;
    }
    /*test case line 35*/
    public boolean testInputPersonalNumberAndCommentLine36(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberAndCommentLine35.step2");
        CommonUtils.onClickByClassName(driver,"tohyoKozinSearchButton");
        CommonUtils.onClickById(driver, "manzokucomment");
        CommonUtils.inputBoxById(driver, idComment, "コメント");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberAndCommentLine35.step3");
        CommonUtils.clearValueBoxById(driver, idComment);
        driver.findElement(By.xpath("//*[@class='voteCommentArea']/p/a")).click();
        isCheckControl = StringUtils.isEmpty(CommonUtils.getValueBoxById(driver,idComment));

        return isCheckControl;
    }
    /*test case line 35*/
    public boolean testInputPersonalNumberAndCommentLine37(){
        CommonUtils.onClickById(driver, idPersonalNumber);
        CommonUtils.inputBoxById(driver, idPersonalNumber,"121546");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberAndCommentLine37.step2");
        CommonUtils.onClickByClassName(driver,"tohyoKozinSearchButton");
        CommonUtils.onClickById(driver, "manzokucomment");
        CommonUtils.inputBoxById(driver, idComment, "コメント");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_VOTE+"testInputPersonalNumberAndCommentLine37.step3");
        CommonUtils.clearValueBoxById(driver, idComment);
        driver.findElement(By.xpath("//*[@class='voteCommentArea']/p/a")).click();
        isCheckControl = driver.findElement(By.xpath("//*[@class='voteCommentArea']/p/a[contains(@style,'display: none')]")).isEnabled();

        return isCheckControl;
    }
}
