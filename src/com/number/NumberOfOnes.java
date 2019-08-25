package com.number;

public class NumberOfOnes {
	
	public static int numberOfOnes(int num){
		
		int sum = 0;
		while(num > 0){
			sum += num & 1;
			num >>= 1;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int num = 15;
		System.out.println(numberOfOnes(num));

	}

}
