package com.dsa.arrays;

import java.util.Arrays;

public class RotateArrayByD {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        int n = arr.length;

        while (k > n) {
            k = k - n;
        }

        k = k % n;
//		Left rotated
//		k = n - k;

//		Right rotated
        k = n - k;

//		Transfer array into temp array
        int i = 0;
        int[] temp = new int[n];
        for (int num : arr) {
            temp[i++] = num;
        }

//		Shift second half

        for (i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

//		Shift first half

        int j = 0;
        for (i = n - k; i < n; i++) {
            arr[i] = temp[j++];
        }

        System.out.println(Arrays.toString(arr));
    }

}
