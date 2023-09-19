package com.sundar;

public class ValidParenthesis {

	public static boolean isValid(String s) {
		
		int j = 0 ;

		for(int i = 0 ; i < s.length() ; i ++) {
			j = i + 1;
			if(s.charAt(i) == '{' && s.charAt(j) == '}') {
					i++;
			}else if (s.charAt(i) == '[' && s.charAt(j) == ']') {
				    i++;
			}else if (s.charAt(i) == '(' && s.charAt(j) == ')') {
				    i++;
			}
			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isValid("(]"));
		
	}
}
