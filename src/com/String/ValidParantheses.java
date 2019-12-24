package com.String;

import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		
		String str = "([)]";
		System.out.println(isValid(str));

	}
	
    public static boolean isValid(String str) {
    	
        if(str.length() == 0) return true;
        
        Stack<Character> para = new Stack<>();
        
        for(int i = 0; i < str.length(); i++){
        	if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
        		para.push(str.charAt(i));
        	}
        	else if(para.isEmpty()){
        		return false;
        	}
        	else{
        		if(para.peek() == '(' && str.charAt(i) == ')'){
        			para.pop();
        		}
        		else if(para.peek() == '{' && str.charAt(i) == '}'){
        			para.pop();
        		}
        		else if(para.peek() == '[' && str.charAt(i) == ']'){
        			para.pop();
        		}
        		else{
        			return false;
        		}
        	}
        }
        if(para.isEmpty()) return true;
        else return false;
    }

}
