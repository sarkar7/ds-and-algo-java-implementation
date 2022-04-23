package com.sarkar.dsa.algo.searching;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {


    public static void doBinarySearch(List<Integer> list, int left, int right, int target) {

        int mid = left + (right - left) / 2;

        if (right > left) {
            if (list.get(mid) > target) {
                right = mid;
                doBinarySearch(list, left, right, target);
            } else if (list.get(mid) < target) {
                left = mid + 1;
                doBinarySearch(list, left, right, target);
            } else if (list.get(mid) == target) {
                System.out.println("Target Found");
            }
        } else {
            System.out.println("Target not found");
        }

    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 8, 10, 12, 15, 17, 20, 22);
        doBinarySearch(list, 0, list.size(), 8);

    }

}
