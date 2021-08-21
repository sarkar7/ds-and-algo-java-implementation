package com.sarkar.dsa.algo.recursion;

public class PowerOfTwo {


    public static void main(String[] args) {
        System.out.println(

                getPowerOfTwo(5)
        );
    }

    private static int getPowerOfTwo(int i) {

        if(i == 0) {
            return 1;
        } else if (i == 1) {
            return 2;
        }

        return 2 * getPowerOfTwo(i - 1);

    }
}
