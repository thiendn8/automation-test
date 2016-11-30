package com.mbank.mobile.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 19/10/2016.
 */
public class InitUtils {
     /*
    *@param: DesiredCapabilities
    *@param: driver
    * @return environment run on mobile or tab
    * */
    public static WebDriver intEviSelenium(DesiredCapabilities desiredCapabilities, WebDriver driver){

        System.setProperty(Constants.CUSTOMER_CONFIG.getString("webdriver_chrome_diver"),
                Constants.USER_DIR + Constants.CUSTOMER_CONFIG.getString("root_config_webdriver").concat(Constants.CHROME_DRIVER));

        if(desiredCapabilities == null){
            driver = new ChromeDriver();
        }else{
            driver = new ChromeDriver(desiredCapabilities);
        }

        return driver;
    }

    /*
    * create Emulated for device
    * @return: capabilities
    * */

    public static DesiredCapabilities deiredDevice(){

        Map<String, String> mobileEmulation = new HashMap<String, String>();

        mobileEmulation.put("deviceName", "Google Nexus 5");

        Map<String, Object> chromeOptions = new HashMap<String, Object>();

        chromeOptions.put("mobileEmulation", mobileEmulation);

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

        return capabilities;
    }

    public static void _drirectionGoSearchScreenMobile(WebDriver driver){
        // click link with text = –ž‘«‘n‘¢“Š•[
        driver.findElement(By.cssSelector("div > .tohyoEditLink")).click();

        //click in button (Ž–¼ŒŸõ)
        driver.findElement(By.className("searchShimeiStep0Button")).click();
    }
    public static void _drirectionGoVoteScreenMobile(WebDriver driver){
        // click link with text = –ž‘«‘n‘¢“Š•[
        driver.findElement(By.cssSelector("div > .tohyoEditLink")).click();
    }

}
