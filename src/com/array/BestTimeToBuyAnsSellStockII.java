package com.array;

public class BestTimeToBuyAnsSellStockII {

	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}
	
	public static int maxProfit(int[] prices){
		int maxProfit = 0;
		int i = prices.length - 1;
		int j = prices.length - 2;
		
		while(j >= 0){
			if(prices[j] > prices[i]){
				j--;
				i=j+1;
			}
			else{
				maxProfit += prices[i] - prices[j];
				j--;
				i--;
			}
		}
		return maxProfit;
	}

}
