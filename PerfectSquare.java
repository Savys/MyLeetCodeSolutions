package com.savitha.leetcode;

import java.util.Scanner;

public class PerfectSquare {
/*
 * A perfect square is a number that can be expressed as the product of two equal integers.

Eg: 9(3*3),16(4*4) ,25 (5*5)
8 is a not perfect square because you cannot express it as the product of two equal integers

Read more: https://www.mathwarehouse.com/arithmetic/numbers/what-is-a-perfect-square.php#ixzz610FwB3RH
 */
  public static void main(String[] args) {
  Scanner input =new Scanner(System.in);
  System.out.println("Enter an integer:");
  int number=input.nextInt();
  isPerfectSquare(number);

  }

  private static void isPerfectSquare(int number) {
    int s=(int)Math.sqrt(number);
    if(Math.pow(s, 2) ==number)
       System.out.println("Perfect square");
    else
      System.out.println("NO");
    
    
  }

}
