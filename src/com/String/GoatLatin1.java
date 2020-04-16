package com.String;

public class GoatLatin1 {

	public static void main(String[] args) {
		String S = "I speak goat latin";
		System.out.println(toGoatLatin(S));

	}
	
	public static String toGoatLatin(String S) {
        StringBuilder modifiedSentence = new StringBuilder();
        String modifiedWord = "";
        String[] words = S.split(" ");
        for(int i = 0; i < words.length; i++){
            if(i > 0) modifiedSentence.append(" ");
            if(isVowelWord(words[i])){
                modifiedWord = generateVowelWord(words[i], i + 1);
            }
            else{
                modifiedWord = generateConsonantWord(words[i] , i + 1);
            }
            modifiedSentence.append(modifiedWord);
        }
        return modifiedSentence.toString();
    }
    
    private static boolean isVowelWord(String word){
        char[] ch = word.toCharArray();
        char c = Character.toLowerCase(ch[0]);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    
    private static String generateVowelWord(String word, int i){
        word = word + "ma";
        for(int k = 0; k < i; k++){
            word += "a";
        }
        return word;
    }
    
    private static String generateConsonantWord(String word, int i){
        word = word.substring(1, word.length()) + word.substring(0,1) + "ma";
        for(int k = 0; k < i; k++){
            word += "a";
        }
        return word;
    }

}
