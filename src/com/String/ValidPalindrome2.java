package com.String;

public class ValidPalindrome2 {

	public static void main(String[] args) {
		
		String s = "deeeeee";
		System.out.println(validPalindrome(s));

	}
	
	public static boolean validPalindrome(String s){
		
		for(int i = 0; i < s.length() / 2; i++){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
				int j = s.length() -1 - i;
				return isPalindromeRange(s, i + 1, j) || isPalindromeRange(s, i-1, j);
			}
		}
		return true;
	}
	
	private static boolean isPalindromeRange(String s, int i, int j){
		for(int k = i; k <= i + (j - i) / 2; k++){
			if(s.charAt(k) != s.charAt(j - k + i)) return false;
		}
		return true;
	}

}
