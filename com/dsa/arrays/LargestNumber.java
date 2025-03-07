package com.dsa.arrays;

import java.util.Arrays;
import java.util.Objects;

/*
179. Largest Number
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"


Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 109

 */
public class LargestNumber {

    public static void main(String[] args) {
        int[] arr = {3,30,34,5,9};
        String largest = printLargest(arr);
        System.out.println(largest);

    }

    private static String printLargest(int[] arr) {
        String[] str = new String[arr.length];
        for(int i = 0 ; i < arr.length; i++) {
            str[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(str, (a,b) -> (b+a).compareTo(a+b));
        if(Objects.equals(str[0], "0"))
            return "0";

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length;i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }


}
