package com.savitha.leetcode;

public class AppleStocksArrays {

	public static void main(String[] args) {
/*
 * StockPrices and returns the best profit I could have made from one purchase 
 * and one sale of one share of Apple stock yesterday.
 * */
		int[] stockPrices = new int[] {10, 7, 5, 8, 11, 19, 10};
		AppleStocksArrays find =new AppleStocksArrays();
 		int bestprofit1=find.getMaxProfit1(stockPrices);
 		int bestprofit2=find.getMaxProfit2(stockPrices);
      System.out.println("BestProfit1: "+bestprofit1);
      System.out.println("BestProfit2: "+bestprofit2);
	}
	/*getMaxProfit2 is better that getMaxProfit1 .
	 * Uses only 1 Loop
	 * Check for more edge cases
	 * */
	
	private int getMaxProfit2(int[] stockPrices) {
		int minPrice = stockPrices[0];
		int maxProfit = 0;
		for(int currentPrice:stockPrices) {
			minPrice = Math.min(minPrice, currentPrice);
			int potentialProfit = currentPrice - minPrice;
			maxProfit = Math.max(maxProfit, potentialProfit);
			
		}
		return maxProfit;
	}
	public int getMaxProfit1(int[] sPrices)
	{
		//This will take O(n^2) time since we have two nested loops
		int maxProfit=0;		
		for(int i=0;i<sPrices.length;i++)
	 {
		 for(int j=i+1;j<sPrices.length;j++)
		 {   
			 int profit=0;
			 if(sPrices[j]>sPrices[i]) {
				   profit =sPrices[j]-sPrices[i];
				   maxProfit=Math.max(profit, maxProfit);
			 }
			 
		 }
	 }
		return maxProfit;
	}
}
