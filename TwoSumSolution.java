package com.savitha.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
  /*
   * Time complexity : O(n^2).For each element, we try to find its complement by
   * looping through the rest of array which takes O(n)O(n) time. Therefore, the
   * time complexity is O(n^2) Space complexity : O(1)O(1).
   */

  public int[] twoSumApproach1(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] == target - nums[i]) {
          return new int[] { i, j };
        }

      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }
  //Two Pass Hash Complexity Time complexity : O(n),Space complexity : O(n).  If the complement exists, we need to look up its index. What is the best way to maintain a mapping of each element in the array to its index? A hash table.

  /*We reduce the look up time from O(n) to O(1)O(1) by trading space for speed. A hash table is built exactly for this purpose, it supports fast look up in near constant time. 
   * I say "near" because if a collision occurred, a look up could degenerate to O(n)O(n) time. But look up in hash table should be amortized O(1)O(1) time as long as the hash
   *  function was chosen carefully.*/

  public int[] twoSumApproach2(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != i) {
        return new int[] { i, map.get(complement) };
      }
    }
    throw new IllegalArgumentException("No two sum solution");

  }
  //One pass Hash Time complexity : O(n)Space comp : O(n).
  public int[] twoSumApproach3(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
  public static void main(String[] args) {
    TwoSumSolution ts = new TwoSumSolution();
    int nums[] = { 2, 7, 11, 15 };
    int target = 9;
    int[] result = ts.twoSumApproach1(nums, target);
    System.out.println(Arrays.toString(result));
    int[] result2 = ts.twoSumApproach2(nums, target);
    System.out.println(Arrays.toString(result2));
  }

}
