package com.array;

import java.util.Arrays;

public class LastStoneWeight {

	public static void main(String[] args) {
		int[] stones = {2,7,4,1,8,1};
		System.out.println(lastStoneWeight(stones));

	}
	
	public static int lastStoneWeight(int[] stones){
		while(stones.length >= 2){
			int n = stones.length;
			Arrays.sort(stones);
			int x = stones[n-2];
			int y = stones[n-1];
			if(x == y) n -= 2;
			else{
				stones[n - 2] = y - x;
				n--;
			}
			int[] copyArray = new int[n];
			for(int i = 0; i < copyArray.length; i++){
				copyArray[i] = stones[i];
			}
			stones = copyArray;
		}
		if(stones.length == 1) return stones[0];
		return 0;
	}

}
