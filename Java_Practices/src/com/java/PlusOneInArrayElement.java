package com.java;

public class PlusOneInArrayElement {
	public static void main(String[] args) {
		//int [] result = plusOne(new int[] {9,8,7,6,5,4,3,2,1,0});
		int [] result1 = plusOne(new int[] {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,9,9});
		
		for(long i: result1) {
			System.out.print(i+" ");
		}
	}

	public static int[] plusOne(int[] digits) {
		
		for(int i = digits.length - 1; i>=0 ; i--){
			if(digits[i] + 1 !=10){
				digits[i] += 1 ;
				return digits;
			}
			digits[i] = 0;
		}

		int newDigit[] = new int[digits.length - 1];
		newDigit[0] = 1;
		return newDigit;
	}

}
