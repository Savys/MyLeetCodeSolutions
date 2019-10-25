package com.savitha.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
//*
/*Best Reference is http://www.goodtecher.com/leetcode-13-roman-to-integer/
 XI-> Start from units place I is 1, X is 10 since units place is less than tens place add but
 IX-> Start from units place X is 10, I is 1 since units place is greater than tens place subtract
 Refer to RomanToInteger13LeetCode.java
 
 

*/
/*
 * Given a roman numeral, convert it to an integer.

 Input is guaranteed to be within the range from 1 to 3999.
 1- I
 5-V
 10-X
 50-L
 100-C
 500-D
 1000-M

 * */
public class RomantoNumbers {

  private static int romantoInt(String s) {
    HashMap<Character, Integer> newmap = new HashMap();
    int result = 0;
    newmap.put('I', 1);
    newmap.put('V', 5);
    newmap.put('X', 10);
    newmap.put('L', 50);
    newmap.put('C', 100);
    newmap.put('D', 500);
    newmap.put('M', 1000);
    int[] number;
    char[] cArray = s.toCharArray();

    for (int i = 0; i < cArray.length; i++) {
      Integer val = newmap.get(cArray[i]);
      // System.out.println(val);
      int fvalue = newmap.get(cArray[0]);
      if (cArray.length == 1) {
        result = result + newmap.get(cArray[i]);
      } else {
        int svalue = newmap.get(cArray[1]);
        if (fvalue > svalue) {
          result = result + newmap.get(cArray[i]);
        } else if (fvalue < svalue) {
          result = svalue - fvalue;
        }

      }
    }
    return result;

  }

  public static void main(String[] args) {

    int output = romantoInt("MCMXCVI");// 1996
    System.out.println(output);

  }

}
