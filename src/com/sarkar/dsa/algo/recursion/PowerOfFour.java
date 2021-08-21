package com.sarkar.dsa.algo.recursion;

public class PowerOfFour {

    private static  boolean isPowerOfFour(int n) {
        return  Math.log(n) / Math.log(4) % 1 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(-2147483648));
    }

}
