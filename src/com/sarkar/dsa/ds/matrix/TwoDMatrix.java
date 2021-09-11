package com.sarkar.dsa.ds.matrix;

public class TwoDMatrix {

    public static void main(String[] args) {
        int[][] mtx = new int[4][4];
        int counter = 1;

        for (int i = 0; i < 4; i++) {
            for (int j =0; j< 4; j++) {
                mtx[i][j] = counter;
                counter++;
            }
            counter++;
        }

        for (int i = 0; i < 4; i++) {
            for (int j =0; j< 4; j++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }

    }




}
