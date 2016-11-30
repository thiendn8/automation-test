package com.mbank.mobile.test_ng.search;

import com.mbank.mobile.common.CommonUtils;
import com.mbank.mobile.common.Constants;
import com.mbank.mobile.common.InitUtils;
import com.mbank.mobile.search.SearchNameFunction;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 02/11/2016.
 */
public class TestNGFunction {
    private WebDriver driver;

    private SearchNameFunction searchNameFunc;

    @BeforeClass
    public void setEnvironment(){
        driver = InitUtils.intEviSelenium(InitUtils.deiredDevice(), driver);
        searchNameFunc = new SearchNameFunction(driver);
    }


    /*Test-case line 45 Selected branch and check radio kanji*/
    @Test(enabled = false)
    public void testSelectBranchAndCheckRadioKanji(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndCheckRadiokanji.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR, searchNameFunc.getMsgOfBranchAndCheckRadiokanji());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndCheckRadiokanji.step2");
    }
    /*Test-case line 46, line 47 Selected branch and input box kanji*/
    @Test
    public void testSelectBranchAndInputBoxKanjiLine46(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanjiLine46.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR, searchNameFunc.getMsgOfBranchAndInputBoxkanjiLine46());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanjiLine46.step3");
    }
    /*Test-case line 48 Selected branch and input box kanji*/
    @Test
    public void testSelectBranchAndInputBoxKanjiLine48(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanjiLine48.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, searchNameFunc.getMsgOfBranchAndInputBoxkanjiLine48());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanjiLine48.step3");
    }

    /*Test-case line 49 Selected branch and check radio kanna*/
    @Test
    public void testSelectBranchAndCheckRadioKanna(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndCheckRadiokana.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR, searchNameFunc.getMsgOfBranchAndCheckRadiokana());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndCheckRadiokana.step2");
    }
    /*Test-case line 50, line 51 Selected branch and input box kanji*/
    @Test
    public void testSelectBranchAndInputBoxKanaLarge15(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanaLarge15.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR, searchNameFunc.getMsgOfBranchAndInputBoxkanaLarge15());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanaLarge15.step3");
    }
    /*Test-case line 52 Selected branch and input box kanji*/
    @Test
    public void testSelectBranchAndInputBoxKanaMax15(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanaMax15.step1");
        Assert.assertEquals(Constants.EXP_MSG_ERROR_NULL, searchNameFunc.getMsgOfBranchAndInputBoxkanaMax15());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanaMax15.step3");
    }

    /*Test-case line 53 Selected branch IS NULL and input box kanji with 12345*/
    @Test
    public void testSelectBranchAndInputBoxKanji_12345(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanji_12345.step1");
        Assert.assertEquals("投票したい人が所属をしている事業所名、事業所コード、主管支店を入力してください。",
                searchNameFunc.getMsgOfBranchNullAndInputBoxkanji());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectBranchAndInputBoxKanaMax15.step4");
    }

    /*Test-case line 58 */
    @Test
    public void testSelectNameOfficeAndInputBoxKanjiLine58(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectNameOfficeAndInputBoxKanjiLine58.step1");
        Assert.assertEquals("投票したい人が所属をしている事業所名、事業所コード、主管支店を入力してください。",
                searchNameFunc.testSelectNameOfficeAndInputBoxKanjiLine58());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"selectNameOfficeAndInputBoxKanjiLine58.step4");
    }

    /*Test-case line 59 */
    @Test
    public void testNameOfficeAndInputBoxKanjiLine59(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine59.step1");
        Assert.assertEquals("",
                searchNameFunc.testNameOfficeAndInputBoxKanjiLine59());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine59.step4");
    }

    /*Test-case line 60 */
    @Test
    public void testNameOfficeAndInputBoxKanjiLine60(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine60.step1");
        Assert.assertEquals("入力された事業所名は、指定不可となっています。再度、入力してください。",
                searchNameFunc.testNameOfficeAndInputBoxKanjiLine59());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine60.step5");
    }

    /*Test-case line 61 */
    @Test
    public void testNameOfficeAndInputBoxKanjiLine61(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine61.step1");
        Assert.assertEquals("",
                searchNameFunc.testNameOfficeAndInputBoxKanjiLine61());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine61.step5");
    }

    /*Test-case line 62 */
    @Test
    public void testNameOfficeAndInputBoxKanjiLine62(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine62.step1");
        Assert.assertEquals("入力された事業所名は、指定不可となっています。再度、入力してください。",
                searchNameFunc.testNameOfficeAndInputBoxKanjiLine62());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine62.step5");
    }

    /*Test-case line 63*/
    @Test
    public void testNameOfficeAndInputBoxKanjiLine63(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine63.step1");
        Assert.assertEquals("入力された事業所名は、指定不可となっています。再度、入力してください。",
                searchNameFunc.testNameOfficeAndInputBoxKanjiLine63());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine63.step5");
    }
    /*Test-case line 64*/
    @Test
    public void testNameOfficeAndInputBoxKanjiLine64(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine64.step1");
        Assert.assertEquals("入力された事業所名は、指定不可となっています。再度、入力してください。",
                searchNameFunc.testNameOfficeAndInputBoxKanjiLine64());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine64.step5");
    }
    /*Test-case line 65*/
    @Test
    public void testNameOfficeAndInputBoxKanjiLine65(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine65.step1");
        Assert.assertEquals("入力された事業所名は、指定不可となっています。再度、入力してください。",
                searchNameFunc.testNameOfficeAndInputBoxKanjiLine63());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine65.step5");
    }
    /*Test-case line 66*/
    @Test
    public void testNameOfficeAndInputBoxKanjiLine66(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine66.step1");
        Assert.assertEquals("入力された事業所名は、指定不可となっています。再度、入力してください。",
                searchNameFunc.testNameOfficeAndInputBoxKanjiLine63());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine66.step5");
    }
    /*Test-case line 67*/
    @Test
    public void testNameOfficeAndInputBoxKanjiLine67(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine67.step1");
        Assert.assertEquals("入力された事業所名は、指定不可となっています。再度、入力してください。",
                searchNameFunc.testNameOfficeAndInputBoxKanjiLine63());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine67.step5");
    }
    /*Test-case line 68*/
    @Test
    public void testNameOfficeAndInputBoxKanjiLine68(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine68.step1");
        Assert.assertEquals("",
                searchNameFunc.testNameOfficeAndInputBoxKanjiLine68());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine68.step5");
    }
    /*Test-case line 69*/
    @Test
    public void testCodeOfficeAndInputBoxKanjiLine69(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine69.step1");
        Assert.assertEquals("投票したい人が所属をしている事業所名、事業所コード、主管支店を入力してください。",
                searchNameFunc.testCodeOfficeAndInputBoxKanjiLine69());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine69.step4");
    }
    /*Test-case line 70*/
    @Test
    public void testCodeOfficeAndInputBoxKanjiLine70(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine70.step1");
        Assert.assertEquals("事業所コードは6桁で入力してください。",
                searchNameFunc.testCodeOfficeAndInputBoxKanjiLine70());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine70.step5");
    }
    /*Test-case line 71*/
    @Test
    public void testCodeOfficeAndInputBoxKanjiLine71(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine71.step1");
        Assert.assertEquals("事業所コードは6桁で入力してください。",
                searchNameFunc.testCodeOfficeAndInputBoxKanjiLine71());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine71.step5");
    }
    /*Test-case line 72*/
    @Test
    public void testCodeOfficeAndInputBoxKanjiLine72(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine72.step1");
        Assert.assertEquals("入力した事業所コードは対象外です",
                searchNameFunc.testCodeOfficeAndInputBoxKanjiLine72());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine72.step5");
    }
    /*Test-case line 73*/
    @Test
    public void testCodeOfficeAndInputBoxKanjiLine73(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine73.step1");
        Assert.assertEquals("",
                searchNameFunc.testCodeOfficeAndInputBoxKanjiLine73());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine73.step5");
    }
    /*Test-case line 74*/
    @Test
    public void testBranchAndInputBoxKanjiLine74(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine74.step1");
        Assert.assertEquals("投票したい人の氏名（名字）と事業所を入力してください。",
                searchNameFunc.testCodeOfficeAndInputBoxKanjiLine74());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine74.step5");
    }
    /*Test-case line 75*/
    @Test
    public void testInputKanaAndInputBoxKanjiLine75(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"inputKanaAndInputBoxKanjiLine75.step1");
        Assert.assertEquals("投票したい人の氏名（名字）と事業所を入力してください。",
                searchNameFunc.testInputKanaAndInputBoxKanjiLine75());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"inputKanaAndInputBoxKanjiLine75.step5");
    }
    /*Test-case line 76*/
    @Test
    public void testCodeOfficeAndInputBoxKanjiLine76(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine76.step1");
        Assert.assertEquals("投票したい人が所属をしている事業所名、事業所コード、主管支店を入力してください。",
                searchNameFunc.testCodeOfficeAndInputBoxKanjiLine76());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine76.step6");
    }
    /*Test-case line 77*/
    @Test
    public void testCodeOfficeAndInputBoxKanjiLine77(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine77.step1");
        Assert.assertEquals("投票したい人が所属をしている事業所名、事業所コード、主管支店を入力してください。",
                searchNameFunc.testCodeOfficeAndInputBoxKanjiLine77());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine77.step5");
    }
    /*Test-case line 78*/
    @Test
    public void testCodeOfficeAndInputBoxKanjiLine78(){
        CommonUtils.goUrlHomeSearch(driver,"127516");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine78.step1");
        Assert.assertEquals("投票したい人が所属をしている事業所名、事業所コード、主管支店を入力してください。",
                searchNameFunc.testCodeOfficeAndInputBoxKanjiLine78());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine78.step5");
    }
    //kanji with branch
    /*Test-case line 81*/
    @Test
    public void testBranchAndInputBoxKanjiLine81(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine81.step1");
        Assert.assertTrue(searchNameFunc.testBranchAndInputBoxKanjiLine81().contains("小樽東センター"));
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine81.step5");
    }

    /*Test-case line 82*/
    @Test
    public void testOfficeScreenLine82(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine82.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine82().contains("吉田　慎一"));
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine82.step6");
    }
    /*Test-case line 83*/
    @Test
    public void testBranchAndInputBoxKanjiLine83(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine81.step1");
        Assert.assertTrue(searchNameFunc.testBranchAndInputBoxKanjiLine83().contains("小樽東センター"));
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine81.step6");
    }
    /*Test-case line 84*/
    @Test
    public void testOfficeScreenLine84(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine84.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine84().contains("吉川　慎一"));
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine84.step6");
    }
    /*Test-case line 85*/
    @Test
    public void testBranchAndInputBoxKanjiLine85(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine85.step1");
        Assert.assertEquals("該当する事業所は0件でした。再度STEP1の事業所検索を行ってください。",
                searchNameFunc.testBranchAndInputBoxKanjiLine85());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanjiLine85.step4");
    }
    //kana with branch
    /*Test-case line 86*/
    @Test
    public void testBranchAndInputBoxKanaLine86(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanaLine86.step1");
        Assert.assertTrue(searchNameFunc.testBranchAndInputBoxKanaLine86().contains("札幌主管支店"));
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanaLine86.step5");
    }

    /*Test-case line 87*/
    @Test
    public void testOfficeScreenLine87(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"OfficeScreenLine87.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine87().contains("吉田　慎一"));
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"OfficeScreenLine87.step6");
    }
    /*Test-case line 88*/
    @Test
    public void testBranchAndInputBoxKanaLine88(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanaLine88.step1");
        Assert.assertTrue(searchNameFunc.testBranchAndInputBoxKanaLine88().contains("小樽東センター"));
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanaLine88.step6");
    }
    /*Test-case line 89*/
    @Test
    public void testOfficeScreenLine89(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine89.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine89());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine89.step6");
    }
    /*Test-case line 90*/
    @Test
    public void testBranchAndInputBoxKanjiLine90(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanaLine90.step1");
        Assert.assertEquals("該当する事業所は0件でした。再度STEP1の事業所検索を行ってください。",
                searchNameFunc.testBranchAndInputBoxKanaLine90());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"branchAndInputBoxKanaLine90.step4");
    }
    // kanji with name office
    /*Test-case line 91*/
    @Test
    public void testNameOfficeAndInputBoxKanjiLine91(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine91.step1");
        Assert.assertTrue(searchNameFunc.testNameOfficeAndInputBoxKanjiLine91().contains("南葛西センター"));
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine91.step5");
    }

    /*Test-case line 92*/
    @Test
    public void testOfficeScreenLine92(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine92.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine92().contains("吉川　D郎") &&
                searchNameFunc.testOfficeScreenLine92().contains("吉田　慎四"));
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine92.step6");
    }
    /*Test-case line 93*/
    @Test
    public void testNameOfficeAndInputBoxKanjiLine93(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine93.step1");
        Assert.assertTrue(searchNameFunc.testNameOfficeAndInputBoxKanjiLine93().contains("南葛西センター"));
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine93.step6");
    }
    /*Test-case line 94*/
    @Test
    public void testOfficeScreenLine94(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine94.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine94());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine94.step6");
    }
    /*Test-case line 95*/
    @Test
    public void testNameOfficeAndInputBoxKanjiLine95(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine95.step1");
        Assert.assertTrue(searchNameFunc.testBranchAndInputBoxKanaLine95());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"nameOfficeAndInputBoxKanjiLine95.step4");
    }
    /*Test-case line 96*/
    @Test
    public void testOfficeScreenLine96(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine96.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine96());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine96.step6");
    }
    //code office
    /*Test-case line 97*/
    @Test
    public void testCodeOfficeAndInputBoxKanjiLine97(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine97.step1");
        Assert.assertTrue(searchNameFunc.testCodeOfficeAndInputBoxKanjiLine97());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"codeOfficeAndInputBoxKanjiLine97.step5");
    }

    /*Test-case line 98*/
    @Test
    public void testOfficeScreenLine98(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine98.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine98());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"officeScreenLine98.step6");
    }
    /*Test-case line 99*/
    @Test
    public void testSelectBranchAndInputKanjiLine99(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testSelectBranchAndInputKanjiLine99.step1");
        Assert.assertTrue(searchNameFunc.testSelectBranchAndInputKanjiLine99());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testSelectBranchAndInputKanjiLine99.step6");
    }
    /*Test-case line 100*/
    @Test
    public void testOfficeScreenLine100(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine100.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine100());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine100.step6");
    }
    /*Test-case line 101*/
    @Test
    public void testSelectBranchAndInputKanjiLine101(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testSelectBranchAndInputKanjiLine101.step1");
        Assert.assertTrue(searchNameFunc.testSelectBranchAndInputKanjiLine101());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testSelectBranchAndInputKanjiLine101.step6");
    }
    /*Test-case line 102*/
    @Test
    public void testOfficeScreenLine102(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine102.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine102());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine102.step6");
    }
    /*Test-case line 103*/
    @Test
    public void testNameOfficeAndInputKanjiLine103(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine103.step1");
        Assert.assertTrue(searchNameFunc.testNameOfficeAndInputKanjiLine103());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine103.step4");
    }
    /*Test-case line 104*/
    @Test
    public void testOfficeScreenLine104(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine104.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine104());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine104.step6");
    }
    /*Test-case line 105*/
    @Test
    public void testCodeOfficeAndInputKanjiLine105(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanjiLine9105.step1");
        Assert.assertTrue(searchNameFunc.testCodeOfficeAndInputKanjiLine105());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanjiLine9105.step6");
    }
    /*Test-case line 106*/
    @Test
    public void testOfficeScreenLine106(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine106.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine106());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine106.step6");
    }
    /*Test-case line 107*/
    @Test
    public void testSelectBranchAndInputKanaLine107(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testSelectBranchAndInputKanaLine107.step1");
        Assert.assertTrue(searchNameFunc.testSelectBranchAndInputKanaLine107());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testSelectBranchAndInputKanaLine107.step6");
    }
    /*Test-case line 108*/
    @Test
    public void testOfficeScreenLine108(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine108.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine108());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine108.step6");
    }
    /*Test-case line 109*/
    @Test
    public void testNameOfficeAndInputKanaLine109(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanaLine109.step1");
        Assert.assertTrue(searchNameFunc.testNameOfficeAndInputKanaLine109());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanaLine109.step6");
    }
    /*Test-case line 110*/
    @Test
    public void testOfficeScreenLine110(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine110.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine110());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine110.step6");
    }
    /*Test-case line 111*/
    @Test
    public void testCodeOfficeAndInputKanaLine111(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanaLine111.step1");
        Assert.assertTrue(searchNameFunc.testCodeOfficeAndInputKanaLine111());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanaLine111.step6");
    }
    /*Test-case line 112*/
    @Test
    public void testOfficeScreenLine112(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine112.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine112());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine112.step6");
    }
    /*Test-case line 113*/
    @Test
    public void testCodeOfficeAndInputKanaLine113(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanaLine113.step1");
        Assert.assertTrue(searchNameFunc.testCodeOfficeAndInputKanaLine113());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testCodeOfficeAndInputKanaLine113.step6");
    }
    /*Test-case line 114*/
    @Test
    public void testClickFourLine114(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testClickFourLine114.step1");
        Assert.assertTrue(searchNameFunc.testClickFourLine114());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testClickFourLine114.step6");
    }
    /*Test-case line 115*/
    @Test
    public void testNameOfficeAndInputKanjiLine115(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine115.step1");
        Assert.assertTrue(searchNameFunc.testNameOfficeAndInputKanjiLine115());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine115.step6");
    }
    /*Test-case line 116*/
    @Test
    public void testOfficeScreenLine116(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine116.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine116());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine116.step6");
    }
    /*Test-case line 117*/
    @Test
    public void testNameOfficeAndInputKanjiLine117(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine117.step1");
        Assert.assertTrue(searchNameFunc.testNameOfficeAndInputKanjiLine117());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine117.step6");
    }
    /*Test-case line 118*/
    @Test
    public void testOfficeScreenLine118(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine118.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine118());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine118.step6");
    }
    /*Test-case line 119*/
    @Test
    public void testNameOfficeAndInputKanjiLine119(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine119.step1");
        Assert.assertTrue(searchNameFunc.testNameOfficeAndInputKanjiLine119());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testNameOfficeAndInputKanjiLine119.step6");
    }
    /*Test-case line 120*/
    @Test
    public void testOfficeScreenLine120(){
        CommonUtils.goUrlHomeSearch(driver,"501006");
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine120.step1");
        Assert.assertTrue(searchNameFunc.testOfficeScreenLine120());
        CommonUtils.takeScreenShot(driver, Constants.SCREEN_SEARCH +"testOfficeScreenLine120.step6");
    }








    @AfterClass
    public void quickTest(){
        driver.close();
    }

}
