package com.String;

public class FrequencySmallestCharacter {
	
	public static int[] numSmallerByFrequency(String[] queries, String[] words) {
		int freqQ = 0;
		int freqW = 0;
		int result[] = new int[queries.length];
		
		for(int i = 0; i < queries.length; i++){
			int count = 0;
			freqQ = findMinCount(queries[i]);
			for(int j = 0; j < words.length; j++){
				freqW = findMinCount(words[j]);
				if(freqQ < freqW) count++;
			}
			result[i] = count;
		}
		return result;
	}
	
	public static  int findMinCount(String s){
		int count = 0;
		char min = findMinChar(s);
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == min){
				count ++;
			}
		}
		return count;
	}
	
	public static  char findMinChar(String s){
		char min = 'z';
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) < min){
				min = s.charAt(i);
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		String queries[] = {"bbb", "cc"};
		String words[] = {"a","aa","aaa","aaaa"}; 
		int results[] = numSmallerByFrequency(queries, words);
		for(int result : results){
			System.out.println(result);
		}

	}

}
