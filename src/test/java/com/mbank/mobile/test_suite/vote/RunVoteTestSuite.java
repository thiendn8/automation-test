package com.mbank.mobile.test_suite.vote;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 * Created by FRAMGIA\dang.ngoc.thien on 31/10/2016.
 */
public class RunVoteTestSuite {
    private static final Logger logger = LogManager.getLogger();
    public static void main (String args[]){
        Result result = JUnitCore.runClasses(VoteTestSuite.class);
        for (Failure failure: result.getFailures()){
            logger.error(failure.toString());
        }
        logger.info(result.wasSuccessful());
    }
}
