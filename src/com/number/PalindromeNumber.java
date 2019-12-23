package com.number;

public class PalindromeNumber {

	public static void main(String[] args) {
		int x = -121;
		System.out.println(isPalindrome(x));
		
	}
	
    public static  boolean isPalindrome(int x) {
     
    	int org = x, digit = 0, rev = 0;
    	
    	if(x < 0) return false;
    	
    	while(x != 0){
    		digit = x % 10;
    		int newRev = (rev * 10 + digit);
    		if((newRev - digit) / 10 != rev){
    			rev = 0;
    			break;
    		}
    		rev = newRev;
    		x = x / 10;
    	}
    	if(org == rev){
    		return true;
    	}
    	return false;
    }

}
