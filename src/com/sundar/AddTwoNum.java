package com.sundar;

import java.util.Arrays;

public class AddTwoNum {

	public static int[] twoSum(int[] nums, int target) {

		int numsLength = nums.length;
		for (int i = 0; i < numsLength - 1; i++) {
			for (int j = i + 1; j < numsLength; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {

		int[] nums = { 2, 9, 2, 15 };

		System.out.println(Arrays.toString(twoSum(nums, 9)));

	}
}
