package com.String;

public class ValidPalindrome5 {

	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));

	}
	
	public static boolean isPalindrome(String s){
		
		String str = s.replaceAll("[^a-zA-Z0-9]", "");
		String strLower = str.toLowerCase();
		int i = 0, j = strLower.length() - 1;
		
		while(i < j){
			if(strLower.charAt(i) != strLower.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
