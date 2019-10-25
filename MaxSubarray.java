package com.savitha.leetcode;

import java.util.Arrays;

/*Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
*/
public class MaxSubarray {

  public int maxSubArray(int[] nums) {
    for(int i=0;i<nums.length;i++){
   //   int[] result=new [];
    //    findmazSubArray(i,nums,result);
    }
    return 0;
  }
  private void findmazSubArray(int i, int[] nums,int []result) {
    int sum=0;

   for(int j=i;j<nums.length;j++)
   {
     sum=sum+nums[j];
     result[j]=nums[j];
     //System.out.println(sum);
   }
   System.out.println(Arrays.toString(result));
  }
  public static void main(String[] args) {
   
    MaxSubarray ms=new MaxSubarray();
    int[] nums={1,2,3,4};
   // int[]nums={-2,1,-3,4,-1,2,1,-5,4};
    int result=ms.maxSubArray(nums);
    //System.out.println("Result:"+result);
    
  }

}
