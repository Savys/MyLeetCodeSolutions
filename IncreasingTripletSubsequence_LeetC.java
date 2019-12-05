/**
 * 
 */
package com.savitha.leetcode;

/**
 * @author savithasrinivasan
 *
 */
public class IncreasingTripletSubsequence_LeetC {

	/**
	 * https://leetcode.com/problems/increasing-triplet-subsequence/  Medium
	 * Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.
	 * @param args
	 * Test Case1:
	 * Input: [1,2,3,4,5] Output: true
	 * Input: [5,4,3,2,1] Output: false
	 */
	public static void main(String[] args) {
		IncreasingTripletSubsequence_LeetC tripletEngine=new IncreasingTripletSubsequence_LeetC();
		int[] input= {1,2,3,4,5};
		//int[]input = {5,4,3,2,1};
		//int[]input = {5,4};

		//int[]input = {5,1,5,5,2,5,4};
		//int[]input = {2,1,5,0,4,6};
		//int[]input= {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		//boolean result=tripletEngine.findIncrSeq(input);
		boolean result=tripletEngine.increasingTriplet(input);
		System.out.println("result: "+result);
	}

	private boolean findIncrSeq(int[] nums) {
		boolean flag=false;
		for(int i=0;i<nums.length-3+1;i++)
		{		
			//   if (!(nums[i+1]==nums[i]+1 && (nums[i+2] ==nums[i]+2)))
	        if (!(nums[i+1]>=nums[i] && (nums[i+2] >=nums[i+1])))
			{
				continue;
			}
			else
				flag=true;
		}
		if(flag)
			return true;
		else
			return false;
		}
	public boolean increasingTriplet(int[] nums) {
		  int a,b,c;
		  a = b = c = Integer.MAX_VALUE;

		  for(int n : nums) {
		    a = Math.min(a,n);
		    if (a == n) continue;
		    b = Math.min(b,n);
		    if (b == n) continue;
		    c = Math.min(c,n);
		  }
		  return (a < b) && (b < c) && 
		    (a != Integer.MAX_VALUE && b != Integer.MAX_VALUE && c != Integer.MAX_VALUE);
		}
		
	}

