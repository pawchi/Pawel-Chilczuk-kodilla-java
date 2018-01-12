package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLog() {
        //Given
       Logger logger = Logger.getInstance();
        //When
        String log1 = "First log";
        logger.log(log1);
        //Then
        Assert.assertEquals("First log",logger.getLastLog());
    }
}
