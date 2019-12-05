package com.savitha.leetcode;
/*
 *https://leetcode.com/problems/house-robber/ 198- Easy *
 *Dynamic Programming
 */
 
public class HouseRobberLeetC {

	public static void main(String[] args) {
		HouseRobberLeetC engine=new HouseRobberLeetC();
		int[] input= new int[] {1,2,3,1};
		int out=engine.robHouse(input);
		System.out.println("output:" +out);

	}
	public int robHouse(int[] money)
	{
		int prevMax=0;
		int currMax=0;
		 
		 for(int m:money)
		 {
		    int tmp=	 currMax;
		    currMax=Math.max(prevMax + m, currMax);
		    prevMax=tmp;
		 }
		 return currMax;
	}

}
