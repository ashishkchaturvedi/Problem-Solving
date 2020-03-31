package com.String;

public class VerifyingAnAlienDictionary {

	public static void main(String[] args) {
		
		String[] words = {"apple","app"};
		String order = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(isAlienSorted(words, order));

	}
	
    public static boolean isAlienSorted(String[] words, String order) {
        char ch[] = new char[words.length];
        for(int i = 0; i < words.length; i++){
            char c[] = words[i].toCharArray();
            ch[i] = c[0];
        }
        
        int n = ch.length;        
        int k = 0;
        for(int i = 0; i < order.length(); i++){
            if(order.charAt(i) == ch[k]){
                k++;
                if(k == (n)) return true; 
            }
        }
        return false;
    }

}
