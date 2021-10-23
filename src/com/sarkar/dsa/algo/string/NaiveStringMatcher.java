package com.sarkar.dsa.algo.string;

/**
 *
 * Time Complexity - Big O((n - m + 1) * m)      when m < n
 *                 - Big O(n^2)                  when m = n/2
 *
 */

public class NaiveStringMatcher {

    public static int findWord(String text, String str) {
        int numberOfOccurrence = 0;
        int str_length = str.length();
        int text_length = text.length();
        for (int i = 0; i < text_length - str_length; i++) {
            if (match (text.substring(i, i + str_length), str)) {
                numberOfOccurrence++;
            }
        }
        return numberOfOccurrence;
    }

    private static boolean match(String text, String str) {
        for (int j = 0; j < str.length(); j++) {
            if (text.charAt(j) != str.charAt(j)) return false;
        }
        return true;
    }

}
