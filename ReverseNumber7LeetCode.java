package com.savitha.leetcode;

public class ReverseNumber7LeetCode {

  public static void main(String[] args) {
    int x=123;
    ReverseNumber7LeetCode obj=new ReverseNumber7LeetCode();
    int output=obj.reverseNo(x);
    System.out.println("output:"+output);

  }

  private int reverseNo(int x) {
    int output=0;
    
    if(x<10)
    {
      output=output+x;
      
    }
    else {
      int rem=x/10;
      int  rev=x%10;
      output= output+rev;
      reverseNo(rem);
    }
    return output;
  }

}
