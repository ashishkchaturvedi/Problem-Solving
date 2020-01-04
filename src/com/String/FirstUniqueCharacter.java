package com.String;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(firstUniqChar(s));
	}
	
    public static int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int n = s.length();
        
        for(int i = 0; i < n; i++){
        	char c = s.charAt(i);
        	count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        for(int i = 0; i < n; i++){
        	if(count.get(s.charAt(i)) == 1){
        		return i;
        	}
        }
        return -1;
    }

}
