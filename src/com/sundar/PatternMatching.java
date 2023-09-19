package com.sundar;

import java.util.regex.Pattern;

public class PatternMatching {
	public static void main(String[] args) {
		System.out.println(isMatch("aa","a*"));
	}

	public static boolean isMatch(String s, String p) {

		try {
			return Pattern.matches(p, s);
		} catch (Exception e) {
			return true;
		}

	}
}
