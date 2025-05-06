package com.dsa.arrays.search;

//Duplicate  elements present
public class SearchInRotatedArray {

//	Identify the sorted half

    public static void main(String[] args) {

        int[] arr = {3, 3, 2, 3, 3, 3, 3};
        boolean pos = search(arr, 3);
        System.out.println(pos);

    }

    private static boolean search(int[] arr, int x) {

        int n = arr.length;

        int low = 0, high = n - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == x)
                return true;

            if (arr[mid] == arr[low] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

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

        return false;
    }

}
