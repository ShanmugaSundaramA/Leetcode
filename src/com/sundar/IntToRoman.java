package com.sundar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class IntToRoman {

	public static String intToRoman(int num) {

		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");

		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		for (int price : map.keySet()) {
			list.add(price);
		}

		Collections.reverse(list);

		for (Integer integer : list) {
			while (num >= integer) {
				sb.append(map.get(integer));
				num = num - integer;
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(intToRoman(1994));

	}
}
