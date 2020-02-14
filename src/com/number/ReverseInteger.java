package com.number;

public class ReverseInteger {

	public static void main(String[] args) {
		int x = 1534236469;
		System.out.println(reverse(x));
		int y = -32145;
		System.out.println(reverse(y));

	}
	
	public static int reverse(int x){
		int rev = 0;
		while(x != 0){
			int digit = x % 10;
			int newRev = rev * 10 + digit;
			if((newRev - digit) / 10 != rev){
				return 0;
			}
			rev = newRev;
			x /= 10;
		}
		return rev;
	}
}
