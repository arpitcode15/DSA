package com.dsa.arrays.search;

public class FirstAndLastOccurrence {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 4, 4, 4, 8, 9};
        int first = lowerBound(arr, 4);
        if (first == -1)
            System.out.println("-1");

        int last = upperBound(arr, 4);
        System.out.println(first + " , " + last);

    }

    private static int lowerBound(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;

    }

    private static int upperBound(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;

    }

}
