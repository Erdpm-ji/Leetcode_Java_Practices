package com.java.binarySearch;

public class SearchInseartPosition {
	public static void main(String[] args) {
		int[] ar = { 1, 3, 5, 6 };
		//System.out.println(searchInsert(ar, 5));
		System.out.println(searchInsert(ar, 2));
	}

	public static int searchInsert(int[] nums, int target) {

		int low = 0, high = nums.length -1;
		int mid = 0;
		int ans = nums.length;

		while (low <= high) {
			mid = (low + high) / 2;

			if (nums[mid] >= target) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return ans;
	}

}
