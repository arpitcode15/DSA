package com.dsa.arrays.search;

public class SearchInRotatedArray2 {

//	Identify the sorted half

    public static void main(String[] args) {

        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int pos = search(arr, 5);
        System.out.println(pos);

    }

    private static int search(int[] arr, int x) {

        int n = arr.length;

        int low = 0, high = n - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == x)
                return mid;

//			if left is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= x && x <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }

//			else if right is sorted
            else {
                if (arr[mid] <= x && x <= arr[high]) {
                    low = mid + 1;

                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

}
