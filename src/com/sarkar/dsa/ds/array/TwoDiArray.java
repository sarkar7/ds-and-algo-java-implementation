package com.sarkar.dsa.ds.array;

import java.util.Arrays;

public class TwoDiArray {



    public static void main(String[] args) {

        int r = 4;
        int c = 4;
        int val = 1;
        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = val++;
            }
        }

        Arrays.stream(matrix).forEach(
                i -> Arrays.stream(i).forEach(
                        j -> System.out.println(j + " ")
                )
        );

        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        Arrays.stream(arr).forEach(
                i -> Arrays.stream(i).forEach(
                        j -> System.out.print(j + " ")
                )
        );



    }

}
