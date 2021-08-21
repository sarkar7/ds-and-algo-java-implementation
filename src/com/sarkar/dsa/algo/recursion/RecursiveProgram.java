package com.sarkar.dsa.algo.recursion;

import java.util.Scanner;

public class RecursiveProgram {

    static int count = 0;
    static boolean flag = false;


    public static void doItRecursively(int n) {


        if (n > 0 && !flag) {
            System.out.print(n + " ");
            n -= 5;
            count++;
            doItRecursively(n);
        } else if (count > -1) {
            System.out.print(n + " ");
            flag = true;
            n += 5;
            count--;
            doItRecursively(n);
        }


    }

    public static void main(String[] args) {
        //System.out.println(fact(5));

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        if (tc >= 1 && tc <= 6) {
            int[] tcArr = new int[tc];
            for (int i = 0; i < tc; i++) {
                tcArr[i] = sc.nextInt();
            }
            sc.close();


            for (int p = 0; p < tcArr.length; p++) {
                if (tcArr[p] <= 0) {
                    System.out.println("N should be greater than zero!");
                } else {
                    doItRecursively(tcArr[p]);
                    count = 0;
                    flag = false;
                    System.out.println();
                }
            }

        }


    }

}
