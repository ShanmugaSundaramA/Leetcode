package com.sundar;

public class SearchInsert {

	public static int searchInsert(int[] nums, int target) {
		int min = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
			if (nums[i] < target) {
				min = i + 1;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 0));
	}
}
