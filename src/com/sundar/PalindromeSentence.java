package com.sundar;

public class PalindromeSentence {

	public static boolean isPalindrome(String s) {
		String s1 = s.toLowerCase();
		int length = s.length(), i = 0, j = length - 1;
		char c1, c2;
		while (j > i) {
			c1 = s1.charAt(i);
			c2 = s1.charAt(j);
			if (!Character.isLetterOrDigit(c1 )) {
				i++;
				continue;
			}
			if (!Character.isLetterOrDigit(c2 )) {
				j--;
				continue;
			}
			if (c1 == c2) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}

}
