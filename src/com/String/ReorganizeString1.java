package com.String;

import java.util.Arrays;

public class ReorganizeString1 {

	public static void main(String[] args) {
		String S = "aab";
		System.out.println(reorganizeString(S));

	}
	
	public static String reorganizeString(String S){
		int N = S.length();
		int[] counts = new int[26];
		char[] ans = new char[N];
		for(char ch : S.toCharArray()){
			counts[ch - 'a'] += 100;
		}
		for(int i = 0; i < counts.length; i++){
			counts[i] +=  i;
		}
		
		Arrays.sort(counts);
		int t = 1;
		
		for(int code : counts){
			int ct = code / 100;
			char ch = (char)('a' + (code % 100));
			if(ct > (N + 1)/2) return "";
			for(int i = 0; i < ct; i++){
				if(t >= N) t = 0;
				ans[t] = ch;
				t += 2;
			}
		}
		return String.valueOf(ans);
	}

}
