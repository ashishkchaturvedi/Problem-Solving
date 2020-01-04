package com.String;

public class FirstUniqueCharacter3 {

	public static void main(String[] args) {
		
		String s = "leetcode";
		System.out.println(firstUniqChar(s));

	}
	
	public static int firstUniqChar(String s){
		char[] c = s.toCharArray();
		
		for(int i = 0; i < c.length; i++){
			if(s.indexOf(c[i]) == s.lastIndexOf(c[i])){
				return i;
			}
		}
		return -1;
	}

}
