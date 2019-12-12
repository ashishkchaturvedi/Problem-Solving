package com.String;

public class ImlementstrSTR {

	public static void main(String[] args) {
		
		String haystack = "aaaaa";
		String needle = "bba";
		
		System.out.println(strStr(haystack, needle));

	}
	
    public static int strStr(String haystack, String needle) {
        
    	return haystack.indexOf(needle);
    }

}
