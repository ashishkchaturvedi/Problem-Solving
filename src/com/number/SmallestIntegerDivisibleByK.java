package com.number;

public class SmallestIntegerDivisibleByK {

	public static void main(String[] args) {
		int K = 3;
		System.out.println(smallestRepunitDivByK(K));

	}
	
	public static int smallestRepunitDivByK(int K) {
		if(K % 2 == 0 || K % 5 == 0) return -1;
		int r = 0;
		for(int N = 1; N <= K; N++){
			r = (r * 10 + 1) % K;
			if(r == 0) return N;
		}
		return -1;
		
	}

}
