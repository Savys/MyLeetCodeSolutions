    package com.savitha.leetcode;
    
    public class PalindromeNumberSolution {
      public boolean isPalindrome(int x) {
        boolean result = false;
        int no = reverse(x);
    
        if ((no == x) || (no == 0)) {
          // System.out.println("true");
          result = true;
        } else {
          // System.out.println("false");
          result = false;
        }
        return result;
      }
    
      public int reverse(int x) {
        long result = 0;
        boolean flag = false;
        int rem;
        if (x < 0) {
          x = 0 - x;
          flag = true;
        }
        while (x > 0) {
          rem = x % 10;
          x = x / 10;
          result = result * 10 + rem;
        }
        if (flag) {
          result = 0 - result;
        }
        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int) result;
    
      }
    
      public static void main(String[] args) {
        PalindromeNumberSolution ps = new PalindromeNumberSolution();
        boolean finalresult = ps.checkifPalind(2002);
        System.out.println(finalresult);
    
      }

      private boolean checkifPalind(int i) {
        // TODO Auto-generated method stub
        return false;
      }
    
    }
