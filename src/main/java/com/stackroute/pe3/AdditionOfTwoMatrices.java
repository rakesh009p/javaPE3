package com.stackroute.pe3;

public class AdditionOfTwoMatrices {

    public int[][] matriceAddition(int row, int column, int matrice1[][], int matrice2[][]) {
        int matriceSum[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matriceSum[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }
        return matriceSum;
    }
}
