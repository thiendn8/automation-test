package com.mbank.mobile.test_suite.vote;

import com.mbank.mobile.vote.*;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 31/10/2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        VoteScreen_Display.class,
        VoteScreen_Function.class,
        VoteScreenComment.class,
        VoteScreenComment_Display.class,
        VoteScreen_Department.class
})
public class VoteTestSuite {
}
