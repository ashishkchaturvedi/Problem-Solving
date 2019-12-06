package com.String;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {

	public static void main(String[] args) {
		String s1 = "catch";
		String s2 = "tchca";
		System.out.println(isPermutation(s1, s2));

	}
	
	public static boolean isPermutation(String s1, String s2){
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < s1.length(); i++){
			set.add(s1.charAt(i));
		}
		
		for(int i = 0; i < s2.length();i++){
			if(!set.contains(s2.charAt(i))){
				return false;
			}
		}
		
		return true;
	}

}
