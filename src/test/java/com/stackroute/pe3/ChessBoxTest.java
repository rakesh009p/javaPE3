package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoxTest {
    ChessBox chessBox ;

    @Before
    public void setUp() {
        chessBox = new ChessBox();
    }

    @After
    public void tearDown() {
    }
    @Test
    public void givenInputRowsAndColumnsShouldPrintPattern(){
        //act
        assertEquals("pattern printed",chessBox.patternPrinting(6,6));

    }
    @Test
    public void givenRowsAndColumnsShouldPrintPattern(){
        //act
        assertEquals("pattern printed",chessBox.patternPrinting(5,6));

    }
}