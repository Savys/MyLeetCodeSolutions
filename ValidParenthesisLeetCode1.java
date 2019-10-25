package com.savitha.leetcode;

import java.util.Stack;

public class ValidParenthesisLeetCode1 {
	static Stack<Character> st = new Stack<Character>();

	  public static void main(String args[]) {

	    //String input = "()[]{}";
	   // String input = "()";
	   String input = "([)]";
	   ValidParenthesisLeetCode1 vp = new ValidParenthesisLeetCode1();
	    boolean result = vp.isValid(input);
	    System.out.println(result);

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