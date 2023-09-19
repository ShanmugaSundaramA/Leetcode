package com.sundar;

import java.util.Arrays;

public class FindKthLargest {

	public static int findKthLargest(int[] nums, int k) {
		int count = 0, max = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
				nums[count] = nums[i];
				count++;
			}
		}
	    System.out.println(Arrays.toString(nums) +"  "+ count+"   "+k );
		return nums[count-k];
	}

	public static void main(String[] args) {

		System.out.println(findKthLargest(new int[] { 3,2,1,5,6,4 }, 4));
	}

}
