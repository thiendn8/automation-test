package com.mbank.mobile.common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 25/10/2016.
 */
public class CommonUtils {

    public static String ROOT_URL_APP = Constants.CUSTOMER_CONFIG.getString("root_url_app");

    /*
    * save sceen name in screenshot_result package
    * @param: driver
    * @param: [screenName].[testCaseName].[stepName]
    * @return: void
    * */
    public static void takeScreenShot(WebDriver driver, String fileName) {
        String [] pathFileItem = fileName.split("\\.");
        String directoryFile = pathFileItem[0].concat("/"+pathFileItem[1]);
        String nameStep = "/"+pathFileItem[2];
        File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dir = new File(Constants.USER_HOME.concat(Constants.CUSTOMER_CONFIG.getString("direction_save_screenshot")+directoryFile));
        if(!dir.exists()){
            dir.mkdir();
        }
        try {
            FileUtils.copyFile(screenShot, new File(dir+nameStep + ".png"));
        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage(), ioe);
        }
    }
    /*
     * Go Home screen follow User
     * @param: driver
     * @param: userId
     * @return: Home screen
     * */
    public static void goUrlHomeSearch(WebDriver driver, String userId){
        driver.get(ROOT_URL_APP.concat(userId));
        InitUtils._drirectionGoSearchScreenMobile(driver);
    }
    /*
    * Go Vote screen follow User
    * @param: driver
    * @param: userId
    * @return: Vote screen
    * */
    public static void goUrlVoteSearch(WebDriver driver, String userId){
        driver.get(ROOT_URL_APP.concat(userId));
        InitUtils._drirectionGoVoteScreenMobile(driver);
    }

    /*
    * @desc: isEnabledById
    * @param: driver
    * @param: id
    * @return: boolean
    * */
    public static boolean isEnabledById(WebDriver driver, String id){
        return driver.findElement(By.id(id)).isEnabled();
    }
    /*
    * desc: isEnabledByClassName
    * @param: driver
    * @param: className
    * @return: boolean
    * */
    public static boolean isEnabledByClassName(WebDriver driver, String className){
        return driver.findElement(By.className(className)).isEnabled();
    }
    /*
    * @desc: is display by Id
    * @param: driver
    * @param: id
    * @return: boolean
    * */
    public static boolean isDisplayById(WebDriver driver, String id){
        return driver.findElement(By.id(id)).isDisplayed();
    }
    /*
    * desc: is display by className
    * @param: driver
    * @param: className
    * @return: boolean
    * */
    public static boolean isDisplayByClassName(WebDriver driver, String className){
        return driver.findElement(By.className(className)).isDisplayed();
    }
    /*
    * desc: inputBoxById
    * @param: driver
    * @param: id
    * @return: void
    * */
    public static void inputBoxById(WebDriver driver, String boxId, String value){
      driver.findElement(By.id(boxId)).sendKeys(value);
    }
    /*
    * desc: inputBoxByClassName
    * @param: driver
    * @param: className
    * @return: void
    * */
    public static void inputBoxByClassName(WebDriver driver, String className, String value){
      driver.findElement(By.className(className)).sendKeys(value);
    }
    /*
   * desc: getValueBoxById
   * @param: driver
   * @param: id
   * @return: String
   * */
    public static String getValueBoxById(WebDriver driver, String boxId){
       return driver.findElement(By.id(boxId)).getAttribute("value");
    }
    /*
    * desc: getValueBoxByClassName
    * @param: driver
    * @param: className
    * @return: String
    * */
    public static String getValueBoxByClassName(WebDriver driver, String className){
        return driver.findElement(By.className(className)).getText();
    }
    /*
  * desc: clean input
  * @param: driver
  * @param: id
  * @return: void
  * */
    public static void clearValueBoxById(WebDriver driver, String boxId){
         driver.findElement(By.id(boxId)).clear();
    }
    /*
    * desc: clean input
    * @param: driver
    * @param: className
    * @return: void
    * */
    public static void clearValueBoxByClassName(WebDriver driver, String className, String value){
         driver.findElement(By.className(className)).clear();
    }
    /*
    * desc: process click event follow id
    * @param: driver
    * @param: id
    * @return: void
    * */
    public static void onClickById(WebDriver driver, String id){
         driver.findElement(By.id(id)).click();
    }
    /*
    * desc: process click event follow className
    * @param: driver
    * @param: className
    * @return: String
    * */
    public static void onClickByClassName(WebDriver driver, String className){
         driver.findElement(By.className(className)).click();
    }

    /*
   * desc: set radio is ON
   * @param: driver
   * @param: id
   * @return: void
   * */
    public static void setRadioById(WebDriver driver, String id){
        driver.findElement(By.id(id)).isSelected();
    }
    /*
    * desc: set radio is ON
    * @param: driver
    * @param: className
    * @return: void
    * */
    public static void setRadioByClassName(WebDriver driver, String className){
        driver.findElement(By.className(className)).isSelected();
    }
    /*
    * desc: get css value by className
    * @param: driver
    * @param: className
    * @param: attributeCss
    * @return: String
    * */
    public static String getCssValueByClassName(WebDriver driver, String className, String cssAttribute){
       return  (String) driver.findElement(By.className(className)).getCssValue(cssAttribute);
    }
    /*
    * desc: get css value by id
    * @param: driver
    * @param: id
    * @param: attributeCss
    * @return: String
    * */
    public static String getCssValueById(WebDriver driver, String id, String cssAttribute){
        return  (String)driver.findElement(By.id(id)).getCssValue(cssAttribute);
    }

    /*
    * desc: get css value by className
    * @param: driver
    * @return: Long
    * */
    public static Long getValueScrollY(WebDriver driver){
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        return (Long) executor.executeScript("return window.scrollY;");
    }
    /*
    * desc: get value selected of option by id
    * @param: driver
    * @param: id
    * @return: String
    * */
    public static String getValueSelectedById(WebDriver driver, String id){
        Select select = new Select(driver.findElement(By.id(id)));
        return (String)select.getFirstSelectedOption().getAttribute("Value");
    }
    /*
    * desc: get value selected of option by class name
    * @param: driver
    * @param: className
    * @return: String
    * */
    public static String getValueSelectedByClassName(WebDriver driver, String className){
        Select select = new Select(driver.findElement(By.className(className)));
        return (String)select.getFirstSelectedOption().getAttribute("Value");
    }
    /*
    * desc: set focus by class name
    * @param: driver
    * @param: className
    * @return: void
    * */
    public static void setFocusByClassName(WebDriver driver, String className){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.className(className)));
        wait.until(ExpectedConditions.elementToBeClickable(By.className(className)));
        actions.click().perform();
    }
    /*
    * desc: set focus by id
    * @param: driver
    * @param: id
    * @return: void
    * */
    public static void setFocusById(WebDriver driver, String id){
        WebDriverWait wait = new WebDriverWait(driver, 5);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.id(id)));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
//        actions.click().perform();
        onClickById(driver, id);

    }
    /*
    * close browser after assert test complete
    * @param: driver
    * @return: void
    * */

    public static void closeBrowser(WebDriver driver) {
        driver.close();
    }
    /*
    * check display for X
     * @param: driver
     * @return: boolean
    * */
    public static boolean isDisplayX(WebDriver driver){
        return driver.findElement(By.xpath("//a[contains(@style,'display: inline')]")).isDisplayed();
    }
   /*
    * check hidden for X
     * @param: driver
     * @return: boolean
    * */
    public static boolean isHiddenX(WebDriver driver){
        return driver.findElement(By.xpath("//a[contains(@style,'display: none')]")).isDisplayed();
    }
    /*
    * Click action on X
     * @param: driver
     * @return: void
    * */
    public static void onClickActionX(WebDriver driver){
        driver.findElement(By.xpath("//a[contains(@style,'display: inline')]")).click();
    }
}
