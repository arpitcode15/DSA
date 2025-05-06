package com.dsa.arrays.greedy;

import java.util.Arrays;

public class AssignCookies {

	public static void main(String[] args) {
		int[] greed = {1, 2, 3};
		int[] cookies = {1, 1};

		System.out.println(helper(greed, cookies));
	}

	private static int helper(int[] greed, int[] cookies) {

		Arrays.sort(greed);
		Arrays.sort(cookies);

		int i = 0;
		int j = 0;
		while (i < cookies.length) {
			if (cookies[i] >= greed[j]) {
				++j;
			}
			++i;
		}
		return j;

	}

}
