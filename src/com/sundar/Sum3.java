package com.sundar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sum3 {

	public static List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> li = new ArrayList<>();
						li.add(nums[i]);
						li.add(nums[j]);
						li.add(nums[k]);
						Collections.sort(li);
						if (!list.contains(li)) {
							list.add(li);
						}
						k = nums.length;
					}
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {

		System.out.println(threeSum(new int[] { -2, 0, 1, 1, 2 }));

	}
}
