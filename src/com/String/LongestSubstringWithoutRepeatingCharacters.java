package com.String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abacabcbb";
		System.out.println(lengthOfLongestSubstring(s));

	}
	
	public static int lengthOfLongestSubstring(String s){
		
		int i = 0, j = 0, max = 0;
		Set<Character> set = new HashSet<>();
		while(i < s.length()){
			char c = s.charAt(i);
			if(!set.contains(c)){
				set.add(c);
				i++;
				if(max < set.size()) max = set.size();
			}
			else{
				set.remove(s.charAt(j));
				j++;
			}
		}
		return max;
	}
}
