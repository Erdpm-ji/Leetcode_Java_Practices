package com.java;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
	public static void main(String[] args) {
		
		System.out.println(converToNumber("MCMXCIV"));
	}
	public static int converToNumber(String romanNumber) {
		char [] roman = romanNumber.toUpperCase().toCharArray();
		Map<Character, Integer> values = new HashMap<>();
		values.put('I', 1);
		values.put('V', 5);
		values.put('X', 10);
		values.put('L', 50);
		values.put('C', 100);
		values.put('D', 500);
		values.put('M', 1000);
		
		int previus = 0;
		int current = 0;
		int total = 0;
		for(int i=0;i<roman.length;i++) {
			current = values.get(roman[i]);
			if(previus<current && previus!=0) {
				total = total - previus;
				current = current - previus;
			}
			total = total + current;
			previus = current;
		}
		return total;
	}
}
