package com.dsa.arrays.search;

public class MinimumInRotatedArray {

    public static void main(String[] args) {

        int[] arr = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
        int min = minimum(arr);
        System.out.println(min);

    }

    private static int minimum(int[] arr) {

        int n = arr.length;

        int low = 0, high = n - 1;
        int min = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[low] <= arr[mid]) {
                min = Math.min(min, arr[low]);
                low = mid + 1;
            } else {

                min = Math.min(min, arr[mid]);
                high = mid - 1;

            }

        }

        return min;
    }

}
