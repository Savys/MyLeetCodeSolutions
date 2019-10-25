package com.savitha.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LetterCombinationofPhoneNoLeetCode {

  public static void main(String[] args) {
    LetterCombinationofPhoneNoLeetCode letter = new LetterCombinationofPhoneNoLeetCode();
    Map<Character, String> hmap = new HashMap();
    List<String> result = new ArrayList<String>();
    hmap.put('2', "abc");
    hmap.put('3', "def");
    hmap.put('4', "ghi");
    hmap.put('5', "jkl");
    hmap.put('6', "mno");
    hmap.put('7', "pqrs");
    hmap.put('8', "tuv");
    hmap.put('9', "wxyz");
    result = letter.findLetterCombination("23", hmap);
    System.out.println(result);
    for(int k=0;k<result.size();k++)
    {
      String a= result.get(k);
      System.out.println(a);
    }

  }

  private List<String> findLetterCombination(String input, Map<Character, String> hmap) {
    char[] c = input.toCharArray();
    List<String> list = new ArrayList<String>();
    for (int i = 0; i < c.length; i++) {

      if (hmap.get(c[i]) != null) {
        String value = hmap.get(c[i]);
        list.add(value);
      }

    }
    return list;
  }

}