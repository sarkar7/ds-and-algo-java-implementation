package com.sarkar.dsa.algo.sorting;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {3, 5, 7, 8, 10, 11};
        int[] arr2 = {1, 2, 4, 6, 9};

        //Printing
        for (int i : merge(arr1, arr2)) {
            System.out.print(i + " ");
        }

    }

    private static int[] merge(int[] arr1, int[] arr2) {

        int[] merged = new int[arr1.length + arr2.length];
        int i, j, c = 0;
        for (i = 0, j = 0; i < arr1.length && j < arr2.length;) {
            if (arr1[i] < arr2[j]) {
                merged[c++] = arr1[i++];
            } else if (arr2[j] < arr1[i]) {
                merged[c++] = arr2[j++];
            } else {
                merged[c++] = arr1[i++];
            }
        }

        while (i < arr1.length) {
            merged[c++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[c++] = arr2[j++];
        }

        return merged;
    }

}
