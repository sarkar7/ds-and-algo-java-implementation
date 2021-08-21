package com.sarkar.dsa.ds.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAword {

    public static void main(String[] args) {
        String str = "Hello World";

        List<String> strArr = Arrays.asList(str.split(" "));
        Collections.reverse(strArr);

        for(String s : strArr) {
            System.out.print(s + " ");
        }
    }


    //Doing it another way
    /*
    public static void strRev(char[] str, int start, int end) {
        if (str == null || str.length < 2) {
            return;
        }

        while (start < end) {

            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }
    }

    public static void reverseWords(char[] sentence) {

        if (sentence == null || sentence.length == 0) {
            return;
        }

        int len = sentence.length;
        strRev(sentence, 0, len - 2);

        int start = 0;
        int end;
        while (true) {

            while (sentence[start] == ' ') {
                ++start;
            }

            if (start >= sentence.length - 1) {
                break;
            }

            end = start + 1;

            while (end < sentence.length - 1 && sentence[end] != ' ') {
                ++end;
            }

            strRev(sentence, start, end - 1);

            start = end;
        }
    }

    static char[] getArray(String t) {
        char[] s = new char[t.length() + 1];
        int i = 0;
        for (; i < t.length(); ++i) {
            s[i] = t.charAt(i);
        }
        return s;
    }
    */

}
