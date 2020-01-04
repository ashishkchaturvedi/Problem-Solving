package com.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByFrequency {

	public static void main(String[] args) {
		
		String s = "tree";
		System.out.println(frequencySort(s));

	}
	
    public static String frequencySort(String s) {
    	if(s == null) return  null;
    	
    	Map<Character, Integer> map = new HashMap<>();
    	int n = s.length();
    	int max = 0;
    	for(int i = 0; i < n; i++){
    		char c = s.charAt(i);
    		map.put(c, map.getOrDefault(c, 0) + 1);
    		max = Math.max(max, map.get(c));
    	}
    	
    	List<Character>[] array = buildArray(map, max);
    	
    	return buildString(array);
    }

	private static String buildString(List<Character>[] array) {
		StringBuilder sb = new StringBuilder();
		for(int i = array.length - 1; i > 0; i--){
			List<Character> list = array[i];
			if(list != null){
				for(Character c :  list){
					for(int j = 0; j < i; j++){
						sb.append(c);
					}
				}
			}
		}
		return sb.toString();
	}

	@SuppressWarnings("unchecked")
	private static List<Character>[] buildArray(Map<Character, Integer> map, int max) {
		List<Character>[] array = new List[max+1];
		
		for(Character c : map.keySet()){
			int count = map.get(c);
			if(array[count] == null){
				array[count] = new ArrayList<>();
			}
			array[count].add(c);
		}
		return array;
	}
	
	

}
