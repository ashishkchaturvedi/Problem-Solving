package com.String;

public class Validpalindrome7 {

	public static void main(String[] args) {
		
		String s = "abca";
		System.out.println(validPalindrome(s));
	}
	
	public static boolean validPalindrome(String s){
		int n = s.length() - 1;
		for(int i = 0; i < n/2; i++){
			if(s.charAt(i) != s.charAt(n-i)){
				int j = n-i;
				return isPalindromeRange(s, i+1, j) || isPalindromeRange(s, i, j-1);
			}
		}
		return true;
	}

	private static boolean isPalindromeRange(String s, int i, int j) {
		for(int k = i; k <= i + (j-i)/2; k++){
			if(s.charAt(k) != s.charAt(j-k + i)) return false;
		}
		
		return true;
	}

}
