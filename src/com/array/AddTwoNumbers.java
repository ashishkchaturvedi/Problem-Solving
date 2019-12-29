package com.array;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int a = 4, b = 5;
		System.out.println(getSum(a, b));

	}
	
	public static int getSum(int a, int b){
		while(b != 0){
			
			int carry = a & b;
			
			a = a ^ b;
			
			b = carry << 1;
		}
		
		return a;
	}

}
