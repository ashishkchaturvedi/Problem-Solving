package com.number;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber1 {

	public static void main(String[] args) {
		int n = 67;
		for(int i = 1; i <= 100; i++){
			System.out.println(i + " is happy: " + isHappy(i));
		}
		

	}
	
	public static  boolean isHappy(int n){
		Set<Integer> visited = new HashSet<>();
		while(n != 1 && !visited.contains(n)){
			visited.add(n);
			n = getNext(n);
		}
		return n==1;
	}

	private static int getNext(int n) {
		int totalSum = 0;
		while(n > 0){
			int d = n % 10;
			n /= 10;
			totalSum += d*d;
		}
		return totalSum;
	}

}
