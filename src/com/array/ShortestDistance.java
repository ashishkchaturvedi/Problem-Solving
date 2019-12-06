package com.array;

public class ShortestDistance {

	public static void main(String[] args) {
		String[] words = {"a","b","c","d","d"};
		String word1 = "a";
		String word2 = "d";
		
		System.out.println(shortestDistance(words, word1, word2));
	}
	
	public static int shortestDistance(String[] words, String word1, String word2) {
		int n = words.length;
		int count1 = -1;
		int count2 = -1;
		int min = words.length;
		for(int i = 0; i < n; i++){
			if(words[i].equals(word1)){
				count1 = i;
			}
			else if(words[i].equals(word2)){
				count2 = i;
			}
			
			if(count1 != -1 && count2 != -1){
                min = Math.min(min, Math.abs(count1-count2));
			}
		}
		
		return min;
    }
}
