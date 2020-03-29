package com.String;

public class ValidPalindrome1 {

	public static void main(String[] args) {
		String s = "race a car";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s){
		String str = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		String str1 = str.toLowerCase();
		System.out.println(str1);
		int i = 0, j = str1.length() - 1;
		while(i < j){
			if(str1.charAt(i) != str1.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
