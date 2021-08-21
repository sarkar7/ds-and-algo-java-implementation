package com.sarkar.dsa.algo.recursion;

public class Program {

    public static int print(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return print(n - 1) + print(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(print(8));
    }

}
