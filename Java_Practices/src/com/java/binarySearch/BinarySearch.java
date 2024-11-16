package com.java.binarySearch;

public class BinarySearch {
	public static void main(String[] args) {
		int [] ar = {1,3,5,6};
		System.out.println(search(ar, 5));
		System.out.println(search(ar, 1));
	}

	public static int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		int mid = 0;
		
		while(low<=high) {//0<=3
			 mid = (low + high)/2; //3/2 =1
			if(nums[mid] == target) {//3 == 1
				return mid+1;
			}
			if(nums[mid]>target) {//1>5
				high = mid -1;
			}else {
				low = mid +1;
			}
		}
		return 0;
	}

}
