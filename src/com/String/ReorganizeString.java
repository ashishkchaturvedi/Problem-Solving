package com.String;

import java.util.Arrays;

public class ReorganizeString {

	public static void main(String[] args) {
		
		String S = "aabbbcdefggggggg";
		System.out.println(reorganizeString(S));

	}
	
	 public static String reorganizeString(String S){
		 
		 int N = S.length();
		 int[] counts = new int[26];
		 for(char c : S.toCharArray()){
			 counts[c - 'a'] += 100;
		 }
		 
		 for(int i = 0; i < 26; ++i){
			 counts[i] += i;
		 }
		 
		 Arrays.sort(counts);
		 int t = 1;
		 char[] ans = new char[N];
		 for(int code : counts){
			 int ct = code / 100;
			 char ch = (char) ('a' + (code % 100));
			 
			 if(ct > (N + 1) / 2) return "";
			 for(int i = 0; i < ct; i++){
				 if(t >= N) t=0;
				 ans[t] = ch;
				 t += 2;
			 }
		 }
		 return String.valueOf(ans);
	 }

}
