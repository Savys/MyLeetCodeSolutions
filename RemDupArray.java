package com.savitha.leetcode;

import java.util.Arrays;

public class RemDupArray {
  public int removeDuplicates(int[] nums) {
    int i = 1; //iterator thru array
    int j = 0; //current index
    for (; i<nums.length; i++) { 
        if (nums[i] != nums[j]) { 
            j++; 
            nums[j] = nums[i]; //fill current index with new number
         } 
        //System.out.println(Arrays.toString(nums));
    }
return j+1;

}
  public static void main(String args[])
  {
    RemDupArray rd=new RemDupArray();
    int[]input={1,1,3,4,5,5,6};
    int value=rd.removeDuplicates(input);
    System.out.println(value);
  }
}
