package com.sundar;

import java.util.Stack;

public class LongestValidParentheses {

	public static int longestValidParentheses(String s) {

		Stack<Integer> stack = new Stack<>();stack.push(-1);
		int length = s.length(),max = 0;

		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else if (s.charAt(i) == ')') {
				stack.pop();
				if(!stack.empty()) {
				max = Math.max(max, i-stack.peek());
				}else {
					stack.push(i);
				}
			} 
		}

		return max;
	}

	public static void main(String[] args) {

		System.out.println(longestValidParentheses(")()(())"));

	}
}
