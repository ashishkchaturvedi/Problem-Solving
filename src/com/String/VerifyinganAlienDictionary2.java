package com.String;

public class VerifyinganAlienDictionary2 {

	public static void main(String[] args) {
		String[] words = {"hello","leetcode"};
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		System.out.println(isAlienSorted(words, order));
	}
	
	public static boolean isAlienSorted(String[] words, String order){
		char[] ch = new char[words.length];
		for(int i = 0; i < words.length; i++){
			char[] c = words[i].toCharArray();
			ch[i] = c[0];
		}
		int k = 0;
		int n = ch.length;
		
		for(int i = 0; i < order.length(); i++){
			if(order.charAt(i) == ch[k]){
				k++;
				if(k == n) return true;
			}
		}
		return false;
	}

}
