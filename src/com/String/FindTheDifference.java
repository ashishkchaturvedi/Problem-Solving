package com.String;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s, t));	

	}
	
	public static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);
            }
        }
        
        for(Map.Entry<Character, Integer> element : map.entrySet()){
            if((int)(element.getValue()) > 0){
                return (char)element.getKey();
            }
        }
        return '0';
    }

}
