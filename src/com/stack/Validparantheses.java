package com.stack;

import java.util.Stack;

public class Validparantheses {
	
	
	public static boolean isValid(String str){
		Stack<Character> s = new Stack<>();
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[' ){
				s.push(str.charAt(i));
			}

			else{
				if(s.isEmpty()){
					return false;
				}
				else{
					char c = s.peek();
					if(c == '(' && str.charAt(i) == ')'){
						s.pop();
					}
					else if(c == '{' && str.charAt(i) == '}'){
						s.pop();
					}
					else if(c == '[' && str.charAt(i) == ']'){
						s.pop();
					}
					else{
						return false;
					}
				}

			}
		}
		
		if(s.size() == 0){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		
		String str = "((";
		System.out.println(isValid(str)?"True":"False");

	}

}
