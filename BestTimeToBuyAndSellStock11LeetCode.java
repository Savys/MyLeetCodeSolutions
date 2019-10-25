package com.savitha.leetcode;
/*
 * 122. Best Time to Buy and Sell Stock II
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 * */

public class BestTimeToBuyAndSellStock11LeetCode {

  public static void main(String[] args) {
    BestTimeToBuyAndSellStock11LeetCode stock=new BestTimeToBuyAndSellStock11LeetCode();
  //  int[] price= {7,1,5,3,6,4};
//  int[] price= {7,1,5,3,6,4};
   // int[] price= {7,6,4,3,1};
    int[] price= {3,8,8,55,38,1,7,42,54,53};
    int n=price.length;
    int result=stock.StockBuySell(price,n);
    System.out.println("Result:" +result);

  }
private int StockBuySell(int [] price,int n)
{
  int profit =0;
  for(int i=0;i<price.length-1;i++)
  {
    if(price[i+1]>price[i])
    {
      profit=profit+ price[i+1]-price[i];
    }
  }
  return profit;
  }
}
