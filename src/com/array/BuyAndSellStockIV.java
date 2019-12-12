package com.array;

public class BuyAndSellStockIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int maxProfit(int k, int[] prices) {
        if(k == 0 || prices == null || prices.length < 2) {return 0;}
        
        int increaseCount = 0, maxProfit = 0;
        boolean incraseFlag = false;
        for(int i = 1; i < prices.length; i++) {
            int tmp = prices[i] - prices[i - 1];
            if(tmp > 0) {
                increaseCount += incraseFlag? 0 : 1;
                incraseFlag = true;
                maxProfit += tmp;
            } else {incraseFlag = false;}
        }
        
        if(k >= increaseCount) {return maxProfit;}
        
        int[] costs = new int[k + 1];
        int[] profits = new int[k + 1];
        
        for(int i = 0; i <= k; i++) {costs[i] = Integer.MAX_VALUE;}
        
        for(int price : prices) {
            for(int i = 1; i <= k; i++) {
                costs[i] = Math.min(costs[i], price - profits[i - 1]);
                profits[i] = Math.max(profits[i], price - costs[i]);
            }
        }
        
        return profits[k];
    }

}
