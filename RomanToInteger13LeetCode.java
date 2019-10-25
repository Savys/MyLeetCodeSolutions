package com.savitha.leetcode;

import java.util.HashMap;
import java.util.Map;
/*
 *  XI-> Start from units place I is 1, X is 10 since units place is less than tens place add but
    IX-> Start from units place X is 10, I is 1 since units place is greater than tens place subtract
 */
public class RomanToInteger13LeetCode {

  public static void main(String[] args) {
    int output = romantoInt("MCMXCVI");// 1996
    System.out.println(output);

  }

  private static int romantoInt(String input ) {
    if(input==null || input.length()==0)
      return 0;
    Map<Character,Integer> hmap=new HashMap<>();
    hmap.put('I', 1);
    hmap.put('V', 5);
    hmap.put('X', 10);
    hmap.put('L', 50);
    hmap.put('C', 100);
    hmap.put('D', 500);
    hmap.put('M', 1000);
    int length=input.length();
    int result = hmap.get(input.charAt(length - 1));
    for(int i=length-2;i>=0;i--)
    {
      if(hmap.get(input.charAt(i)) >=hmap.get(input.charAt(i+1)))
      {
        result +=hmap.get(input.charAt(i));
      }
      else {
        result -=hmap.get(input.charAt(i));
      }
    }

    return result;
  }

}
