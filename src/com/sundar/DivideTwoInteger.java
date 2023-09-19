package com.sundar;

public class DivideTwoInteger {

	public static int divide(int dividend, int divisor) {

		if (Integer.MIN_VALUE == dividend && divisor == -1) {
			dividend = dividend + 1;
		}
		return dividend / divisor;
	}

	public static void main(String[] args) {
		System.out.println(divide(-2147483648, 1));

	}
}
