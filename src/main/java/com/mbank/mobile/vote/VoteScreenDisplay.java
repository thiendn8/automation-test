package com.mbank.mobile.vote;

import com.mbank.mobile.common.CommonUtils;
import com.mbank.mobile.common.Constants;
import com.mbank.mobile.common.StringUtils;
import com.sun.org.apache.xpath.internal.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 27/10/2016.
 */
public class VoteScreenDisplay {

    public WebDriver driver;
    boolean isCheckControl = false;
    public VoteScreenDisplay(WebDriver driver) {
        this.driver = driver;
    }
    /*Test case line 4*/
    public boolean testVoteScreenLLine4(){

        if(CommonUtils.isDisplayById(driver,"vkojin_id")
            && CommonUtils.isDisplayByClassName(driver, "tohyoKozinSearchButton")
            && CommonUtils.isDisplayByClassName(driver, "searchShimeiStep0Button")
            && CommonUtils.isDisplayByClassName(driver, "textTableB")
            && CommonUtils.isDisplayById(driver, "manzokucomment")
            && CommonUtils.isDisplayByClassName(driver, "tohyoConfirmButton")){
            isCheckControl = true;
        }

     return isCheckControl;
    }
    /*Test case line 5*/
    public boolean testVoteScreenLine5(){

       isCheckControl = StringUtils.isEmpty(CommonUtils.getValueBoxById(driver,"vkojin_id"));

     return isCheckControl;
    }
    /*Test case line 6*/
    public boolean testVoteScreenLine6(){

        List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='textTableB']//tr/td[@class='lineText']"));
        Iterator<WebElement> items = elementList.iterator();
        while (items.hasNext()){
            WebElement row  = items.next();
            java.lang.String actualValue = row.getText();
            if(StringUtils.isEmpty(actualValue)){
                isCheckControl = true;
            }
        }

     return isCheckControl;
    }
    /*Test case line 7*/
    public boolean testVoteScreenLine7(){
     return !CommonUtils.isEnabledById(driver,"manzokucomment");
    }
    /*Test case line 8*/
    public boolean testVoteScreenLine8(){
     return !CommonUtils.isEnabledByClassName(driver,"tohyoConfirmButton");
    }
    /*Test case line 9*/
    public boolean testVoteScreenLine9(){

        driver.findElement(By.xpath("//*[@class='mainMenuLink menuButtonArea']")).click();

     return Constants.EXP_TITLE_HOME.equals(driver.getTitle());
    }
    /*Test case line 10*/
    public boolean testVoteScreenLine10(){

        CommonUtils.onClickByClassName(driver, "searchShimeiStep0Button");

     return Constants.EXP_TITLE_HOME.equals(driver.getTitle());
    }

}
