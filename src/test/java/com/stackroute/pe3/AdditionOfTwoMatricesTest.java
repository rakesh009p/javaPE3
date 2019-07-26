package com.stackroute.pe3;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfTwoMatricesTest {
    AdditionOfTwoMatrices additionOfTwoMatrices;

    @Before
    public void setUp()  {
        additionOfTwoMatrices =new AdditionOfTwoMatrices();
    }

    @After
    public void tearDown()  {

        }
        @Test
    public void givenMatricesShouldReturnSum(){
        int[][] matrice1= {{1,2},{1,2}};
        int[][] matrice2={{1,2},{1,2}};
        int[][] matriceSum={{2,4},{2,4}};
         int[][] actualResult=   additionOfTwoMatrices.matriceAddition(2,2,matrice1,matrice2);

        assertEquals(matriceSum,actualResult);

    }
    @Test
    public void givenInputMatricesShouldReturnSum(){
        int[][] matrice1= {{1,9},{1,2}};
        int[][] matrice2={{1,2},{1,2}};
        int[][] matriceSum={{2,11},{2,4}};
        int[][] actualResult=   additionOfTwoMatrices.matriceAddition(2,2,matrice1,matrice2);

        assertEquals(matriceSum,actualResult);

    }

}