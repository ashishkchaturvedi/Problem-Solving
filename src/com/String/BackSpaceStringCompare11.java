package com.String;

import java.util.Stack;

public class BackSpaceStringCompare11 {

	public static void main(String[] args) {
		String S = "#a#b";
		String T = "a##b";
		System.out.println(backspaceCompare(S, T));
	}
	
	public static boolean backspaceCompare(String S, String T){
		Stack<Character> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();
		
		for(char c : S.toCharArray()){
			if(c != '#'){
				s1.push(c);
			}
			else{
				if(!s1.isEmpty()){
					s1.pop();
				}
			}
		}
		
		for(char c : T.toCharArray()){
			if(c != '#'){
				s2.push(c);
			}
			else{
				if(!s2.isEmpty()){
					s2.pop();
				}
			}
		}
		
		return s1.toString().equals(s2.toString());
	}
}