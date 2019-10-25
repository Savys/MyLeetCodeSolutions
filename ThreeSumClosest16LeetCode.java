package com.savitha.leetcode;

public class ThreeSumClosest16LeetCode {

	public static void main(String[] args) {
		int[] s = {-1,2,1,-4};
		int t=1;
		ThreeSumClosest16LeetCode find=new ThreeSumClosest16LeetCode();
       int output=find.ClosestSum(s,t);
       System.out.println(output);

	}

	private int ClosestSum(int[] nums,int target) {
		  if(nums == null || nums.length <3)
		  {
			  return -1;
		  }
		  int closestSum=nums[0]+nums[1]+nums[2];
		  for(int i=0;i<nums.length;i++)
		  {
			  int left=i+1;
			  int right=nums.length-1;
			  while(left<right)
			  {
				  int sum=nums[i]+nums[left]+nums[right];
				  if(Math.abs(sum-target)<Math.abs(closestSum-target))
				  {
					  closestSum=sum;
				  }
				  if(sum<target)
				  {
					  left++;
				  }
				  else {
					  right++;
				  }
			  }
			  
		  }
		return closestSum;
		  
		
	}

}
