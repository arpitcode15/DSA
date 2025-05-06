package com.dsa.arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {

		int[] nums = {1, 1, 0, 3, 12};
		int n = nums.length;
		int[] ans = moveZeros(n, nums);
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println("");

	}

	public static int[] moveZeros(int n, int[] nums) {
		int left = 0;

		for (int right = 0; right < nums.length; right++) {
			if (nums[right] != 0) {
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left] = temp;
				left++;
			}
		}
		return nums;
	}

}
