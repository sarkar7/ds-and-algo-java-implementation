package com.sarkar.dsa.algo.sorting;

import java.util.Arrays;

public class MergeSort {

    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;
        int mid = arr.length / 2;
        int[] leftArr = mergeSort(subArray(arr, 0, mid));
        int[] rightArr = mergeSort(subArray(arr, mid, arr.length));

        return merge(leftArr, rightArr);
    }

    private static int[] subArray(int[] arr, int start, int end) {
        int[] temp = new int[end - start];
        int c = 0;
        while (start < end) {
            temp[c++] = arr[start++];
        }
        return temp;
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


    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        Arrays.stream(mergeSort(arr)).forEach(System.out::print);
    }
}
