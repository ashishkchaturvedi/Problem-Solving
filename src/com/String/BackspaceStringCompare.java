package com.String;

import java.util.Stack;

public class BackspaceStringCompare {
	
	public static boolean backspaceCompare(String S, String T) {
		StringBuilder sb1 = new StringBuilder("");
		StringBuilder sb2 = new StringBuilder("");
		Stack<Character> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();
		
		for(int i = 0; i <= S.length() - 1; i++){
			if(S.charAt(i) != '#'){
				s1.push(S.charAt(i));
			}
			else{
				if(!s1.isEmpty()){
					s1.pop();
				}
			}
		}
		
		while(!s1.isEmpty()){
			sb1.append(s1.pop());
		}
		
		String str1 = sb1.reverse().toString();
		System.out.println(str1);
		
		for(int i = 0; i <= T.length() - 1; i++){
			if(T.charAt(i) != '#'){
				s2.push(T.charAt(i));
			}
			else{
				if(!s2.isEmpty()){
					s2.pop();
				}
			}
		}
		
		while(!s2.isEmpty()){
			sb2.append(s2.pop());
		}
		String str2 = sb2.reverse().toString();
		System.out.println(str2);
		
		return str1.equals(str2);
    }

	public static void main(String[] args) {
		
		System.out.println(backspaceCompare("a#c", "b")?"True":"False");

	}

}
