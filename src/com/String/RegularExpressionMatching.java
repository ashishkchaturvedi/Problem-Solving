package com.String;

public class RegularExpressionMatching {

	public static void main(String[] args) {
		
		String text = "aab";
		String pattern = "c*a*b";
		System.out.println(isMatch(text, pattern));

	}
	
    public static boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();
        boolean first_match = (!text.isEmpty() &&
                               (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
        System.out.println(first_match);

        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
        	System.out.println(pattern.substring(2));
            return (isMatch(text, pattern.substring(2)) ||
                    (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }

}
