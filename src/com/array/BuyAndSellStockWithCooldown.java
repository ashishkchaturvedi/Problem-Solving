package com.array;

public class BuyAndSellStockWithCooldown {

	public static void main(String[] args) {
		
		int[] prices = {1,2,3,0,2};
		System.out.println(maxProfit(prices));

	}
	
    public static int maxProfit(int[] prices) {
        int day = prices.length+1;
        int rest[] = new int[day];
        int hold[] = new int[day];
        int sold[] = new int[day];
        
        rest[0] = 0;
        sold[0] = 0;
        hold[0] = Integer.MIN_VALUE;
        
        for(int i=1;i<day;i++){
            sold[i] = hold[i-1]+prices[i-1];
            System.out.println("sold is:" + sold[i]);
            rest[i] = Math.max(rest[i-1],sold[i-1]);
            System.out.println("rest is" + rest[i]);
            hold[i] = Math.max(hold[i-1],rest[i-1]-prices[i-1]);
            System.out.println("hold is:" + hold[i]);
        }
        
		//hold[day-1] must be smaller than rest[day-1]
        return Math.max(rest[day-1],sold[day-1]);
    }

}
