package com.number;

public class ReverseDigit {

	public static void main(String[] args) {
		
		int x = 1534236469;
		System.out.println(reverse(x));
	}
	
    public static int reverse(int x) {
        
    	int rev = 0, digit = 0;
    	
    	while(x != 0){
    		digit = x % 10;
    		int newRev = rev * 10 + digit;
    		if((newRev - digit) / 10 != rev){
    			return 0;
    		}
    		rev = newRev;
    		x = x/10;
    	}
    	return rev;
    }

}
