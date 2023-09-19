package com.sundar;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateOrNot {
	public static boolean containsDuplicate(int[] nums) {

		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			if(!set.add(i)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
	}
}
