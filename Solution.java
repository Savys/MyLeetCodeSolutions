package com.savitha.leetcode;
class Solution {
  public static void main(String[] args) {
     int ret;
     //int[] input = { 1, 2, 2, 3, 1 };
     //int[] input = { 1 };
     int[] input={1,3,1,-1,3};
     
     Solution ss = new Solution();
     int singleno=ss.singleNumber(input);
     System.out.println(singleno);
   }

   public int singleNumber(int[] nums) {
     int ret = 0;
     for (int i = 0; i <= nums.length - 1; i++) {
       int ele = nums[i];
       ret = getSingleNo(nums, ele);

     }
     return ret;
   }

   private int getSingleNo(int[] input, int x) {
     int count = 0;
     for (int j = 0; j < input.length; j++) {
       if (input[j] == x) {
         count++;
       }
     }
     //System.out.println("ele " + x + " count: " + count);
     if (count % 2 != 0) {
       return x;
     }
     return 1 ;
   }
 }
