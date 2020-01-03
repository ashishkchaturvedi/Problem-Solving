package com.String;

public class DetectCapital {

	public static void main(String[] args) {
		
		String word = "USA";
		System.out.println(detectCapitalUse(word));

	}
	
	public static boolean detectCapitalUse(String word) {
		// if string empty, null or single character, then return true
		if( word==null || word.length()< 2) return true;

		    // check case of first and second character
		    boolean isFirstCapital = Character.isUpperCase(word.charAt(0));
		    boolean isSecondCapital = Character.isUpperCase(word.charAt(1));
		    
		    // if first not capital and second is capital, then return false
		    if(!isFirstCapital&&isSecondCapital) return false;
		    
		    // remainig characters of the word should be lower
		    //  1. first and second characters are lower or first is capital and second character
		    //     is lower
		    boolean lower = !isFirstCapital&&!isSecondCapital || isFirstCapital&&!isSecondCapital;
		    System.out.println("lower is:" +lower);
		    
		    // remaining characters should not lower if first and second characters are capital
		    if( isFirstCapital && isSecondCapital) lower = false;
		    
		    for(int i = 2 ; i < word.length();i++){
		        if( Character.isLowerCase(word.charAt(i))!=lower) return false;
		    }
		    return true;
		}

}
