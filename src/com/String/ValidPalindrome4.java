package com.String;

public class ValidPalindrome4 {

	public static void main(String[] args) {
		String s = "aabdeenddbaagbddeedbaa";
		System.out.println(validPalindrome(s));

	}
	
	public static boolean validPalindrome(String s){
		for(int i = 0; i < s.length() / 2; i++){
			if(s.charAt(i) != s.charAt(s.length() - i - 1)){
				int j = s.length() - i - 1;
				return isPalindrome(s, i , j - 1 ) || isPalindrome(s, i + 1, j);
			}
		}
		return true;
	}

	private static boolean isPalindrome(String s, int i, int j) {
		for(int k = i; k <= i + (j - i) / 2; k++){
			if(s.charAt(k) != s.charAt(j - k + i)) return false;
		}
		return true;
	}

}
