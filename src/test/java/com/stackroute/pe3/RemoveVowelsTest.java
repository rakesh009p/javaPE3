package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels removeVowels;

    @Before
    public void setUp() throws Exception {
        removeVowels = new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void givenStringShouldReturnString() {

        String[] strings = {"India", " United States", "Germany", " Egypt", "czechoslovakia"};
        String[] strings1 = {"Ind", "Untd Stts", "Grmny", "Egypt", "czchslvk"};
        String[] actualResult=removeVowels.vowelRemover(strings1);
        assertEquals(strings1, actualResult);
    }
    @Test
    public void givenInputStringShouldReturnString() {

        String[] strings = {"Indiaa", " United States", "Germany", " Egypt","Rakesh"};
        String[] strings1 = {"Ind", "Untd Stts", "Grmny", "Egypt", "czchslvk","Rksh"};
        String[] actualResult=removeVowels.vowelRemover(strings1);
        assertEquals(strings1, actualResult);
    }
}


