package com.String;

import java.util.HashMap;
import java.util.Map;

public class ValidPalindrome3 {

	public static void main(String[] args) {
		String s = "abs";
		System.out.println(validPalindrome(s));
	}
	
    public static boolean validPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        System.out.println(map.entrySet());
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int i = entry.getValue();
            System.out.println("I am here");
            if(i == 1){
                count ++;
            }
            if(count >= 3) return false;
        }
        return true;
    }
}
