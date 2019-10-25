package com.savitha.leetcode;
/*
 * Basically the answer is f(n) = max( f(n-1), f(n-2) + arr[n] ) and you are asking why.

Let's suppose this array arr = [9,1,7,9] and f(n) is the function.

When the array is only [9], your max f(0) will be arr[0].

When the array is [9,1], your max f(1) is max(arr[0], arr[1]).

When the array is [9,1,7], if you select 7, you can't select 1 therefore f(n-2) + arr[n]. However, if you don't select 7, you max f(2) will be same as f(1) which is f(n-1).

When the array is [9,1,7,9], you need to drop both 1 & 7 and choose 9, 9. f(n) = max( f(n-1), f(n-2)+arr[n] ) equation satisfies this case.

or

Similarly for first 3 houses, max[3]=max(max[2],house[3]+max[1])

Observing this trend, it can be formulated that max[k]=max(max[k-1],house[k]+max[k-2]).Observing this trend, it can be formulated that
 * */

public class LeetCodeHouseRobber {

  public static void main(String[] args) {
    LeetCodeHouseRobber rob =new LeetCodeHouseRobber();
    int[] x= {1,2,3,1};
    rob.findMaxAmt(x);

  }

public  int findMaxAmt(int[] nums)
 {
    
   if(nums.length==0 )
     return 0;
   

   if(nums.length==1)
           return nums[0];
 
   if(nums.length==2)
     return Math.max(nums[0],nums[1]);
   
   int[]sum=new int[nums.length];
   sum[0]=nums[0];
   sum[1]= Math.max(nums[0],nums[1]);
   

   for(int i=2;i<sum.length;i++)   
     sum[i]=Math.max(sum[i-2]+nums[i], sum[i-1]);
   
   return sum[sum.length-1];
}
   
 
}
