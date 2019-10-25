package com.savitha.leetcode;
/*
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are 
 * drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, 
 * such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
 * */
public class ContainerWithMostWater11LeetCode {

	public static void main(String[] args) {
		int[] input= {1,8,6,2,5,4,8,3,7};
		ContainerWithMostWater11LeetCode soln=new ContainerWithMostWater11LeetCode();
		int output=soln.getMaxAreaBruteForce(input);
      System.out.println(output);
	}

	private int getMaxAreaBruteForce(int[] height) {
		//area=(right=left)*min(LeftHt,rightHt);
		//maxArea=Max(area1,area2...)
		int max=Integer.MIN_VALUE;
		for(int i=0;i<height.length;i++)
		{
			for(int j=i+1;j<height.length;j++)
			{
				int min=Math.min(height[j], height[i]);
            max=Math.max(max, min*(j-i));  
			}
		}
	 return max;		
	}

}
