package com.String;

public class LastWordLength {

	public static void main(String[] args) {
		
		String s = "a";
		
		System.out.println(lengthOfLastWord(s));

	}
	
	public static int lengthOfLastWord(String s) {
		int length = 0;
        for(int i=s.length()-1; i>=0; i--)
        {
            if(s.charAt(i) == ' ')
            {
                if(length > 0)
                {
                    break;
                }
            }
            else
            {
                length++;   
            }
        }
        
        return length;
 
		
    }

}
