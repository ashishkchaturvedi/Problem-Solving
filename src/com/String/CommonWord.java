package com.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] banned = {""};
		String str = "a.";
		String result = mostCommonWord(str, banned);
		System.out.println(result);

	}
	
	public static String mostCommonWord(String str, String[] banned){
		
		int max = 0;
		//str = str.replaceAll("\\p{Punct}","");
		String words[] = str.split("\\W+");
		//[ ,]+
		for(int i = 0; i < words.length; i++){
			//System.out.println(words[i]);
		}
		HashMap<String, Integer> m = new HashMap<>();
		for(int i = 0; i < words.length; i++){
			if(m.containsKey(words[i].toLowerCase())){
				m.put(words[i].toLowerCase(), m.get(words[i].toLowerCase()) + 1);
			}
			else {
				m.put(words[i].toLowerCase(), 1);
			}
		}
		
		Set<Map.Entry<String, Integer>> s = m.entrySet();
		for(Map.Entry<String, Integer> it : s){
			//System.out.println(it.getKey()+"===="+it.getValue());
			if(!Arrays.asList(banned).contains(it.getKey())){
				//System.out.println("Notbanned=============");
				//System.out.println(it.getKey());
				//System.out.println("=====================");
				if(it.getValue() > max){
					max = it.getValue();
				}
			}
		}
		String output = "";
		for(Map.Entry<String, Integer> it : s){
			if(it.getValue() == max && !Arrays.asList(banned).contains(it.getKey())){
				 output = it.getKey();
			}
		}
		return output;
	}

}
