package com.savitha.leetcode;

public class AddDigits {

  public void addDigits(int num) {

    boolean isSD= isSingleDigit(num);
    System.out.println("Result : "+isSD);
    if(!isSD)
    {
      int lastdig=num/10;
      
    }
    
  }

  private boolean isSingleDigit(int num) {
    //num=100;
    if(num>9)
      return false;
    else
      return true;
  }
  public static void main(String args[])
  {
    int input=0;
    AddDigits ad=new AddDigits();
    ad.addDigits(input);
  }
  
}