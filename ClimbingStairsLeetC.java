/**
 * 
 */
package com.savitha.leetcode;

/**
 * @author savithasrinivasan LeetCode 70. Climbing Stairs -Easy You are climbing
 *         a stair case. It takes n steps to reach to the top.
 * 
 *         Each time you can either climb 1 or 2 steps. In how many distinct
 *         ways can you climb to the top?
 *         https://leetcode.com/problems/climbing-stairs/
 *         Can be approched both top down and bottom up.Below is bottom up approach.BackTo Back SWE
 *         
 */
public class ClimbingStairsLeetC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClimbingStairsLeetC climbEng = new ClimbingStairsLeetC();
		int n = 3;
		int result = climbEng.findways(n);
		System.out.println("No of ways to climb: " +result);

	}

	public int findways(int n) {
		if (n <= 1)
			return 1;
		int[] ways = new int[n + 1];
		ways[0] = 1;
		ways[1] = 1;
		for (int i = 2; i <= n; i++) {
			ways[i] = ways[i - 2] + ways[i - 1];
		}

		return ways[n];
	}
}
