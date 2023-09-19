package com.sundar;

import java.util.Arrays;

public class RemoveDuplicate {

	public static int removeDuplicates(int[] nums) {

		Arrays.sort(nums);
		int max = Integer.MIN_VALUE, count = 0;
		for (int i : nums) {
			if (max < i) {
				max = i;
				nums[count] = i;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
	}
}
