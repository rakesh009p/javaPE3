package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentMarks;

    @Before
    public void setUp()  {
         studentMarks=new StudentMarks();

    }

    @After
    public void tearDown()  {
        studentMarks = null;
    }

    @Test
    public void givenIntegerInputShouldReturnString(){
        //arrange
        //act
        int grades[]={45,78,89};

       String actualResult=studentMarks.StudentGrade(3,grades);
        //assert
        assertEquals("with in a range",actualResult);

    }
    @Test
    public void givenIntegerShouldReturnString(){
        //arrange
        //act
        int grades[]={95,98,129};

        String actualResult=studentMarks.StudentGrade(3,grades);
        //assert
        assertEquals("not in a range",actualResult);

    }




}