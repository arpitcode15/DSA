package com.dsa.arrays;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {

        String s = "ABAB";
        int k = 2;

        helper1(s, k);
        helper2(s, k);
    }

    private static void helper1(String s, int k) {

        int maxFreq = 0;
        int changes = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] arr = new int[26];
            for (int j = i; j < s.length(); j++) {
                arr[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, arr[s.charAt(j) - 'A']);
                changes = (j - i + 1) - maxFreq;

                if (changes <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break;
                }
            }
        }

        System.out.println(maxLen);
    }

    private static void helper2(String s, int k) {


    }
}
