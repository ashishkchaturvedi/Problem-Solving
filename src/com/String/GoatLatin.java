package com.String;

public class GoatLatin {

	public static void main(String[] args) {
		
		String S = "The quick brown fox jumped over the lazy dog";
		System.out.println(toGoatLatin(S));

	}
	
    public static String toGoatLatin(String S) {
    	
    	String[] str = S.split(" ");
    	
    	for(int i = 0; i < str.length; i++){
    		char ch = Character.toLowerCase(str[i].charAt(0));
    		String aAppend = "";
    		for(int j = 0; j <= i; j++){
    			aAppend += "a";
    		}
    		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
    			str[i] = str[i] + "ma" + aAppend;
    		}
    		else{
    			str[i] = swap(str[i]);
    			str[i] = str[i] + "ma" + aAppend;
    		}
    	}
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < str.length; i++){
    		if(i == str.length - 1){
    			sb.append(str[i]);
    		}
    		else{
    			sb.append(str[i] + " ");
    		}	
    	}
    	return sb.toString();
    }
    
    private static String swap(String s){
    	char ch[] = s.toCharArray();
    	char temp = ch[0];
    	for(int i = 0; i < ch.length - 1; i++){
    		ch[i] = ch[i + 1];
    	}
    	ch[ch.length - 1] = temp;
    	return new String(ch);
    }

}
