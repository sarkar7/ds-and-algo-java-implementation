package sarkar.dsa.algo.searching;

import java.util.Arrays;
import java.util.Scanner;


public class NumberOfOccurences {

    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        if(tc >= 1 && tc <= 10) {
            int temp = sc.nextInt();
            if(temp >= 1 && temp <= 5000000) {
                int arrLength = temp;
                String[] arr = sc.nextLine().split("");
            }
        }
        sc.close();
        */

        String str = "abcd";
        String[] arr = str.split("");
        Arrays.sort(arr);

        for(String S : arr) {
            //System.out.println(s);
        }
        //doBinarySearch(arr, int left, int right, char 'x');


    }

    public static void doBinarySearch(String[] arr, int left, int right, char target) {



    }

}
