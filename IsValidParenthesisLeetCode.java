package com.savitha.leetcode;

import java.util.Stack;

public class IsValidParenthesisLeetCode {
  static Stack<Character> st = new Stack<Character>();

  public static void main(String args[]) {

    String input = "()[]{}";
   // String input = "()";
  // String input = "([)]";
   IsValidParenthesisLeetCode vp = new IsValidParenthesisLeetCode();
    boolean result = vp.isValid(input);
    System.out.println("isValidParenthesis -->"+result);

  }

  private boolean isValid(String input) {
    int len = input.length();
    if (!(len % 2 == 0)) {
      return false;
    }
    char[] cInput = input.toCharArray();
    for (int i = 0; i < len; i++)
    {
      char x = input.charAt(i);
      if ((x == '(')) 
      {
        st.add(x);
      } 
      else if (x == ')') 
      {
        char y = st.pop();
        if (y == '(') 
        {
          return true;
        } 
        else 
        {
          return false;
        }
      }
      
      if ((x == '[')) 
      {
        st.add(x);
      } 
      else if (x == ']') 
      {
        char y = st.pop();
        if (y == '[') 
        {
          return true;
        } 
        else 
        {
          return false;
        }
      }
      
      if ((x == '{')) 
      {
        st.add(x);
      } 
      else if (x == '}') 
      {
        char y = st.pop();
        if (y == '{') 
        {
          return true;
        } 
        else 
        {
          return false;
        }
      }
    }
    return false;
  }
}