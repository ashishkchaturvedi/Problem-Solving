package com.String;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacter2 {

	public static void main(String[] args) {
		
		String s = "leetcode";
		System.out.println(firstUniqChar(s));

	}
	
	 public static int firstUniqChar(String s) {
		 Map<Character, Integer> map = new LinkedHashMap<>();
		 Set<Character> set = new HashSet<>();
		 int n = s.length();
		 
		 for(int i = 0; i < n; i++){
			 char c = s.charAt(i);
			 if(set.contains(c)){
				 if(map.get(c) != null){
					 map.remove(c);
				 }
			 }
			 else{
				 set.add(c);
				 map.put(c, i);
			 }
		 }
		 
		 return map.size() == 0 ? -1 : map.entrySet().iterator().next().getValue();
	 }

}
