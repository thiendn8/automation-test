package com.mbank.mobile.test_suite.search;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 02/11/2016.
 */

public class RunSearchTestSuite {
    private static final Logger logger = LogManager.getLogger();
    public static void main (String args[]){
        Result result = JUnitCore.runClasses(SearchTestSuite.class);
        for (Failure failure: result.getFailures()){
            logger.error(failure.toString());
        }
        logger.info(result.wasSuccessful());
    }
}
