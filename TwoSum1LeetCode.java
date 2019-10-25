package com.savitha.leetcode;

import java.util.Arrays;

public class TwoSum1LeetCode {

	public static void main(String[] args) {
		TwoSum1LeetCode twoSumSoln = new TwoSum1LeetCode();
		int[] x = { 2, 7, 11, 15 };
		int target = 9;
		int[]output=twoSumSoln.findIndexBruteForce(x,target);
       System.out.println("output:" +Arrays.toString(output));
       
	}

	private int[] findIndexBruteForce(int[] x,int t) {
		//Time Complexity : O(n^2),Space O(1) .Alternative can be done with hashMap/hasSet
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[j]==t-x[i])
				{
					return new int[] {i,j};
				}
			}
			
		}
		return new int[] {-1,-1};	
		
	}

}
