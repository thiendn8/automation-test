package com.mbank.mobile.common;


import java.util.ResourceBundle;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 18/10/2016.
 */
public class Constants {
    /*get bunlde from properties file*/
    public static ResourceBundle CUSTOMER_CONFIG = ResourceBundle.getBundle("sys-customer-config");
   /* get root in Dir project and Dir Home*/
    public static final String USER_DIR = System.getProperty("user.dir");
    public static final String USER_HOME = System.getProperty("user.home");

   /*Driver common*/
   public static final String CHROME_DRIVER = "chromedriver";
   public static final String FIRFOX_DRIVER = "firefoxdriver";

    /*Screen Common*/
    public static final String SCREEN_VOTE = "vote_screen.";
    public static final String SCREEN_VOTE_COMMENT = "vote_comment_screen.";
    public static final String SCREEN_SEARCH = "search_l.screen.";


    /*expect test case for each screen*/
    public static final String EXP_TITLE_HOME = "満足BANK";
    public static final String EXP_LOGIN_SUCCESS = "テスト太郎";
    public static final String EXP_LOGIN_NULL_FAIL = "個人番号を入力してください。";
    public static final String EXP_MSG_ERROR = "投票したい人の氏名（名字）を入力してください。";
    public static final String EXP_MSG_ERROR_NULL = "";
    public static final String EXP_COLOR_YELLOW = "rgba(254, 254, 154, 1)";

}
