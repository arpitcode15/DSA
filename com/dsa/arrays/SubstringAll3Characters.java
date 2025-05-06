package com.dsa.arrays;

//Given a string s consisting only of characters a, b and c.

//Return the number of substrings containing at least one occurrence 
//of all these characters a, b and c.

/*Input: s = "abcabc"
Output: 10
ExplanationThe substrings containing at least one occurrence of the 
characters a, b and c are 
"abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" */

public class SubstringAll3Characters {

    public static void main(String[] args) {

        String s = "bbacba";

//		helper1(s);
        helper2(s);

    }

    //	Brute Force Approach
    private static void helper1(String s) {

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] arr = new int[3];
            for (int j = i; j < n; j++) {
                arr[s.charAt(j) - 'a'] = 1;
                if (arr[0] + arr[1] + arr[2] == 3) {
                    ++count;
                }

            }

        }
        System.out.println(count);

    }

//	Optimised approach

    private static void helper2(String s) {

        int[] lastSeen = {-1, -1, -1};
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            lastSeen[s.charAt(i) - 'a'] = i;
            if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
                count += (1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2])));
            }

        }
        System.out.println(count);

    }

}
