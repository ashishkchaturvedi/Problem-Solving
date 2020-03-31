package com.String;

public class ToGoatLatin {

	public static void main(String[] args) {
		String S = "The quick brown fox jumped over the lazy dog";
		System.out.println(toGoatLatin(S));

	}
	
	public static String toGoatLatin(String S) {
        String str[] = S.split(" ");
        StringBuilder modifiedSentence = new StringBuilder();
        String modifiedString = "";
        for(int i = 0; i < str.length; i++){
            if(i > 0){
                modifiedSentence.append(" ");
            }
            if(startsWithVowel(str[i])){
                modifiedString = appendVowelWords(str[i], i + 1);
            }
            else{
                modifiedString = appendConsonantWords(str[i], i+ 1);
            }
            modifiedSentence.append(modifiedString);
        }
        return modifiedSentence.toString();
    }
    
    private static boolean startsWithVowel(String s){
        char c[] = s.toCharArray();
        char ch = Character.toLowerCase(c[0]);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
    
    private static String appendVowelWords(String vowel, int i){
        String finalString = vowel + "ma";
        for(int j = 0; j < i; j++){
            finalString = finalString + "a";
        }
        return finalString;
    }
    
    private static String appendConsonantWords(String consonant, int i){
        String finalString = consonant.substring(1,consonant.length()) + consonant.substring(0,1) + "ma";
        for(int j = 0; j < i; j++){
            finalString = finalString + "a";
        }
        return finalString;
    }

}
