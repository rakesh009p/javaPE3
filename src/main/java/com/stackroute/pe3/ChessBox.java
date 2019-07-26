package com.stackroute.pe3;
import java.util.*;
public class ChessBox {
    public String patternPrinting(int row, int column) {
        String[][] pattern = new String[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
              int sum   = (i + j) ;
              if((sum)% 2 == 0 ){
                  System.out.print("WW|");}
                else{
                    System.out.print("BB|");
                }
    }
            System.out.println();
}
        return "pattern printed";
    }}