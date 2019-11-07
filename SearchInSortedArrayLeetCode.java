package com.savitha.leetcode;

public class SearchInSortedArrayLeetCode {
	// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
	// Thoughts : 	Prolem No :33 Solve using binary search.Focus on updating pointers,try using iterative way

	public static void main(String[] args) {
		SearchInSortedArrayLeetCode searchEngine = new SearchInSortedArrayLeetCode();
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		// int target=2;
		// int target=7;
		int target = 11;

		int output = searchEngine.searchTarget(nums, target);
		System.out.println("output : " + output);
		if (output > 0) {
			System.out.println("Found");
		}
		else {
		System.out.println("Not Found");
		}
	}

	private int searchTarget(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
		    while(left<=right){
		        int mid = left + (right-left)/2;
		        if(target==nums[mid])
		            return mid;
		 
		        if(nums[left]<=nums[mid]){
		            if(nums[left]<=target&& target<nums[mid]){
		                right=mid-1;
		            }else{
		                left=mid+1;
		            }
		        }else{
		            if(nums[mid]<target&& target<=nums[right]){
		                left=mid+1;
		            }else{
		                right=mid-1;
		            }
		        }    
		    }
		 
		   
		}
		return -1;
}
}