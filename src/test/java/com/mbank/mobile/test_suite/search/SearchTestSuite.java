package com.mbank.mobile.test_suite.search;

import com.mbank.mobile.search.SearchName_Display;
import com.mbank.mobile.search.SearchName_Function;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 02/11/2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        SearchName_Display.class,
        SearchName_Function.class
})
public class SearchTestSuite {
}
