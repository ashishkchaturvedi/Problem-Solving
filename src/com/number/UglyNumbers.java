package com.number;

public class UglyNumbers {
	
	public static int getNthUglyNumber(int n){
		int i = 1, count = 1;
		
		while(count < n){
			i++;
			if(isUgly(i) == 1){
				count++;
			}
		}
		return i;
	}
	
	public static int isUgly(int n){
		
		n = maxDivide(n,2);
		n = maxDivide(n,3);
		n = maxDivide(n,5);
		
		return n == 1 ? 1 : 0;
	}

	private static int maxDivide(int n, int i) {
		while(n % i == 0){
			n = n/i;
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println(getNthUglyNumber(150));
		

	}

}
