package com.dsa.arrays.search;

public class SingleElementInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int elem = helper(arr);
        System.out.println(elem);
    }

    private static int helper(int[] arr) {
        int n = arr.length;
        int ind = 0;

        int low = 1, high = n - 2;
        int single = -1;

        if (arr[0] != arr[1])
            return arr[0];
        if (arr[n - 1] != arr[n - 2])
            return arr[n - 1];

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1])
                return arr[mid];
//			in left
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            }
//			in right
            else
                high = mid - 1;

        }

        return -1;
    }

}
