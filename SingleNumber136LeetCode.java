package com.savitha.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber136LeetCode {

  /*
   * Given a non-empty array of integers, every element appears twice except for
   * one. Find that single one.
   */
  public static void main(String[] args) {
    int[] a = { 2, 2, 1 };
    SingleNumber136LeetCode single = new SingleNumber136LeetCode();
    Map<Integer, Integer> hmap = new HashMap<>();
    int value = 1;

    for (int y = 0; y < a.length; y++) {
      if (!hmap.containsKey(a[y])) {
        hmap.put(a[y], value);
      } else {
        value = hmap.get(a[y]);
        hmap.put(a[y], value + 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
      if (entry.getValue() == 1) {
        System.out.println("Single number in the arrayis :" + entry.getKey());
      }

    }

  }

}
