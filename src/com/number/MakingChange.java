package com.number;

public class MakingChange {

	public static void main(String[] args) {
		int[] coins = {25, 10, 5, 1};
		System.out.println(change(32, coins));
	}
	
	public static int change(int x, int[] coins){
		if (x == 0) return 0;
		
		int min = x;
		for(int coin : coins){
			if(x- coin >= 0){
				int c = change(x - coin, coins);
				if(min > c + 1) {
					min = c + 1;
				}
			}
		}
		return min;
	}

}
