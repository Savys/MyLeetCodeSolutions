package com.savitha.leetcode;

/*Given an array of integers, every element appears twice except for one. Find that single one.
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 
 * */

public class SingleNumberSolution {

  public static void main(String[] args) {
    int ret;
    int[] input = { 1, 2, 2, 3, 1 };
    SingleNumberSolution ss = new SingleNumberSolution();
    ss.singleNumber(input);
  }

  public void singleNumber(int[] nums) {
    int ret = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      int ele = nums[i];
      ret = getSingleNo(nums, ele);

    }
    if (ret == -1) {
     
    } else {
      System.out.println(ret);
    }
  }

  private int getSingleNo(int[] input, int x) {
    int count = 0;
    for (int j = 0; j < input.length; j++) {
      if (input[j] == x) {
        count++;
      }
    }
    System.out.println("ele " + x + " count: " + count);
    if (count % 2 != 0) {
      return x;
    }
    return -1;
  }

}
