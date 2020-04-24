package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = {"eat", "tan", "tea", "ate", "nat","bat"};
		System.out.println(groupAnagrams(strs));

	}
	
	public static List<List<String>> groupAnagrams(String[] strs){
		Map<String, List<String>> m = new HashMap<String, List<String>>();
		for(String str : strs){
			char[] c = str.toCharArray();
			Arrays.sort(c);
			String sorted = new String(c);
			
			if(!m.containsKey(sorted)){
				List<String> list = new ArrayList<String>();
				list.add(str);
				m.put(sorted, list);
			}
			else{
				List<String> list = m.get(sorted);
				list.add(str);
				m.put(sorted, list);
			}
		}
		
		List<List<String>> output = new ArrayList<>();
		for(String s : m.keySet()){
			output.add(m.get(s));
		}
		return output;
	}

}
