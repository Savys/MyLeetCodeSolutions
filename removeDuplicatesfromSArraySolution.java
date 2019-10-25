package com.savitha.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*Remove duplicate element from sorted array without using additional space.Challenge : Resizing the array after deletion.>Thread exception sometimes*/
public class removeDuplicatesfromSArraySolution {

  public static void main(String[] args) {
    removeDuplicatesfromSArraySolution rd = new removeDuplicatesfromSArraySolution();

    int[] nums = { 1, 1, 2 };
    rd.removeDuplicates(nums);
    // System.out.println(result);
  }

  private void removeDuplicates(int[] input) {
    int n = input.length;
    System.out.println("Original Array " + Arrays.toString(input));
   
    for (int j = 1; j < n; j++) 
    {
      int key = input[j];
      int i = j - 1;
      if (input[i] == key)
      {
        input[j] = input[j+1];
       // break;
      }
      
    }
    System.out.println("Now Array " + Arrays.toString(input));
  }
  
}
