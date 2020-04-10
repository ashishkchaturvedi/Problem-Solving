package com.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramsInString {

	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
		System.out.println(findAnagrams(s, p));

	}
	
	public static List<Integer> findAnagrams(String s, String p){
		
		int ns = s.length(), np = p.length();
		Map<Character, Integer> sCount = new HashMap<Character, Integer>();
		Map<Character, Integer> pCount = new HashMap<>();
		List<Integer> result = new ArrayList<Integer>();
		
		for(char ch : p.toCharArray()){
			pCount.put(ch, pCount.getOrDefault(ch, 0) + 1);
		}
		
		for(int i = 0; i < ns; ++i){
			char ch = s.charAt(i);
			if(sCount.containsKey(ch)){
				sCount.put(ch, sCount.get(ch) + 1);
			}
			else{
				sCount.put(ch, 1);
			}
			
			if(i >= np){
				ch = s.charAt(i - np);
				if(sCount.get(ch) == 1){
					sCount.remove(ch);
				}
				else{
					sCount.put(ch, sCount.get(ch) - 1);
				}
			}
			
			if(pCount.equals(sCount)){
				result.add(i - np + 1);
			}
		}
		return result;
	}

}
