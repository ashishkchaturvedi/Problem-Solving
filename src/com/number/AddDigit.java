package com.number;

public class AddDigit {

	public static void main(String[] args) {
		
		int num = 49;
		System.out.println(addDigits(num));

	}
	
	public static int addDigits(int num) {
		if(num == 0) return 0;
		
		if(num % 9 == 0) return 9;
		
		else return num % 9;
	}

}
