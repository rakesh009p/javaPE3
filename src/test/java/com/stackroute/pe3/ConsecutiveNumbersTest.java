package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers consecutiveNumbers;
    @Before
    public void setUp()  {
        consecutiveNumbers= new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void gievnIntegerShouldReturnString(){
        String strings="23,24,25";
        assertEquals("consecutive",consecutiveNumbers.consecutiveCheck(strings));
    }
}