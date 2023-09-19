package com.sundar;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();

		Arrays.sort(s1);
		Arrays.sort(t1);

		String s2 = new String(s1);
		String t2 = new String(t1);
		
		if (s2.equals(t2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagarat"));
	}
}
