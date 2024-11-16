package com.java.binarySearch;

public class SearchInseartPosition {
	public static void main(String[] args) {
		int[] ar = { 1, 3, 5, 6 };
		//System.out.println(searchInsert(ar, 5));
		System.out.println(searchInsert(ar, 7));
	}

	public static int searchInsert(int[] nums, int target) {

		int low = 0, high = nums.length;
		int mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;

			if (nums[mid] == target) {
				return mid;
			}
			if(mid == high) {
				return high+1;
			}

			if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return 0;
	}

}
