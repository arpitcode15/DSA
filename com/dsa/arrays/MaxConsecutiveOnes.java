package com.dsa.arrays;

//Longest subarray with atmost K zeroes 
public final class MaxConsecutiveOnes {

//	arr[] = {1,1,1,0,0,0,1,1,1,1,0};
//	k = 2

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        int out = helper(arr, k);
        System.out.println(out);

    }

    //	Brute Force Approach
    private static int helper(int[] arr, int k) {

        int maxLen = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            int zeroes = 0;
            for (int j = i; j < arr.length; j++) {

                if (arr[j] == 0 && zeroes < k) {
                    zeroes++;
                    len = j - i + 1;
                    maxLen = Math.max(len, maxLen);

                } else if (zeroes > k) {
                    break;
                }
            }
        }


        return maxLen;
    }

//	Optimized Solution


}
