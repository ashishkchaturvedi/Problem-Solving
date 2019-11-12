package com.String;

public class LongestCommmonPrefix {

	public static void longestCommonPrefix(String[] strs){

		String str1 = "flower";
		String str2 = "flow";
		while(str2.indexOf(str1) != 0){
            str1 = str1.substring(0, str1.length() - 1);
            System.out.println(str1);
		}
		//System.out.println(str1);
		
		
	
	}	
	public static void main(String args[]){
		String[] strs = {"dog","racecar","car"};
		longestCommonPrefix(strs);
	}
	
}
