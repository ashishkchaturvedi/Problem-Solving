package com.array;

public class BuyAndSellStock {

	public static void main(String[] args) {
		
		int a[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(a));

	}
    public static int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int j = prices.length - 2;
        int i = prices.length - 1;
        while(j >= 0){
            if(prices[j] > prices[i]){
                j--;
                i=j+1;
            }
            else{
                if(maxProfit < prices[i] - prices[j]){ 
                    maxProfit = prices[i] - prices[j];  
                }
                j--;
            }
        }
        return maxProfit;
    }

}
