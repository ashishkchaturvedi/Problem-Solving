package com.String;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(minWindow(s, t));

	}
	
	public static String minWindow(String s, String t){
		if(s.length() == 0 || t.length() == 0) return "";
		Map<Character, Integer> dictT = new HashMap<Character, Integer>();
		for(int i = 0; i < t.length(); i++){
			char c = t.charAt(i);
			int count = dictT.getOrDefault(c, 0);
			dictT.put(c, count+1);
		}
		int required = dictT.size();
		int l = 0, r = 0;
		int[] ans = {-1,0,0};
		int formed = 0;
		Map<Character, Integer> windowsCount = new HashMap<>();
		
		while(r < s.length()){
			char c = s.charAt(r);
			int count = windowsCount.getOrDefault(c, 0);
			windowsCount.put(c, count+1);
			if(dictT.containsKey(c) && dictT.get(c).intValue() == windowsCount.get(c).intValue()){
				formed++;
			}
			while(l <= r && formed == required){
				c = s.charAt(l);
				if(ans[0] == -1 || r - l + 1 < ans[0]){
					ans[0] = r - l + 1;
					ans[1] = l;
					ans[2] = r;
				}
				windowsCount.put(c, windowsCount.get(c) - 1);
				if(dictT.containsKey(c) && dictT.get(c).intValue() > windowsCount.get(c).intValue()){
					formed--;
				}
				l++;
			}
			r++;
		}
		return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
	}

}
