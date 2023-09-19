package com.sundar;

public class FirstOccurenceOfString {

    public static int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }
	
	public static void main(String[] args) {
		
		System.out.println(strStr("leetcode", "leeto"));
		
	}
	
}
