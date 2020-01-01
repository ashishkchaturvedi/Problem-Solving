package com.String;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal -- Panama";
		System.out.println(isPalindrome(s));
	}
	
    public static  boolean isPalindrome(String s) {
    	if(s.length() == 0) return true;
    	
    	String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    	System.out.println(str);
    	StringBuilder sb = new StringBuilder();
    	for(int i = str.length() - 1; i >= 0; i--){
    		sb.append(str.charAt(i));
    	}
    	if(sb.toString().equals(str)){
    		return true;
    	}
    	System.out.println(sb.toString());
    	return false;
    }

}
