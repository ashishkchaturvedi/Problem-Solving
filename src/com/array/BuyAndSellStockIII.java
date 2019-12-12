package com.array;

public class BuyAndSellStockIII {

	public static void main(String[] args) {
		int a[] = {3,3,5,0,0,3,1,4};
		System.out.println(maxProfit(a));

	}
	
	public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int n = prices.length;
		
		/* we compute the max possible single transaction value b/w 0th and the 'i'th day moving from left to right 'ltor'*/
        int[] ltor = new int[n];
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            ltor[i] = Math.max(prices[i] - min, ltor[i - 1]);
            if (prices[i] <= min)
                min = prices[i];
        }
        
		/* we compute the max possible single transaction value b/w 'i'th and the last day  moving from right to left 'rtol'*/
        int[] rtol = new int[n];
        int max = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rtol[i] = Math.max(max - prices[i], rtol[i + 1]);
            if (prices[i] >= max)
                max = prices[i];
        }
        
		/* Now we just need to find the max possible sum for 0th till 'i'th transaction and the 'i + 1'th till 'n'th transaction */
        int ans = 0;
        for (int i = 1; i <= n - 2; i++) {
            int sum = ltor[i] + rtol[i+1];
            if (ans < sum)
                ans = sum;
        }
        
        /* Since a single transaction could be more than sum of 2 transaction, we could look at either the last element of ltoi or
        first element of rtol to make sure that is not more than 2 transaction. Those are essentially the max possible value we
        can get from a single transaction */
        return Math.max(ans, rtol[0]);
    }

}
