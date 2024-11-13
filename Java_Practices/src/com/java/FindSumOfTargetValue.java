package com.java;

public class FindSumOfTargetValue {
	public static void main(String[] args) {
		
		int[] nums = {3,2,4};
		int target = 6;
		
		;
		for(int a : twoSum(nums, target)) {
			System.out.print(a+" ");	
		}
	}
	 public static int[] twoSum(int[] arr, int target) {
		 
		 int [] result = {0,0};
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]+arr[j]==target) {
					 result[0]=i;
					 result[1]=j;
				 }
			 }
		 }
		 return result;
	 }
}
