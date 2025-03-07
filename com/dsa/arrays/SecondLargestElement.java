package com.dsa.arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {

        int[] arr = {1,3,5,3,2,190,123,144,144,18};
        int secondLargest = secondLargest(arr);
        System.out.println(secondLargest);

    }

    private static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest =0;
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            // Adding this statement will remove depenendency on sort
            if(arr[i] < largest && arr[i] > secondLargest)
                secondLargest = arr[i];
        }
        return secondLargest;
    }
}
