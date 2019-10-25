package com.savitha.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating3LeetCode {

  public static void main(String[] args) {
    // String s="abcabcbb";
    // String s="bbbbb";
    String s = "pwwkew";
    LongestSubstringWithoutRepeating3LeetCode obj = new LongestSubstringWithoutRepeating3LeetCode();
    Integer output = obj.LongestSubstring(s);
    System.out.println("MaxOverAll:" + output);

  }

  private Integer LongestSubstring(String s) {

    String MaxOverAll = "";
    String MaxTillNow = "";
    Set<Character> hset = new HashSet<Character>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (hset.contains(c)) {
        MaxTillNow = "";
        hset.clear();
      }
      MaxTillNow += c;
      hset.add(c);
      if (MaxTillNow.length() > MaxOverAll.length()) {
        MaxOverAll = MaxTillNow;
      }

    }

    return MaxOverAll.length();
  }

}
