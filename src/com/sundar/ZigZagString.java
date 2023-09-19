package com.sundar;

public class ZigZagString {

	public static String convert(String s, int numRows) {

		int count = 0, i = 0, j = 0;
		StringBuilder sb = new StringBuilder();

		while (numRows > 0) {
			while (i < s.length()) {
				count = numRows - 1;
				sb.append(s.charAt(i));
				while (count > 0) {
					i = i + 2;
					count--;
				}
			}
			j++;
			i = j;
			numRows--;
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(convert("SUNDARAMSOWMI", 5));
	}
}
