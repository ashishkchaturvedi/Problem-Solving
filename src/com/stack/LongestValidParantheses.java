package com.stack;

import java.util.Stack;

public class LongestValidParantheses {
	
	public static void main(String args[]){
		String s = "{}[]({}[]{]";
		System.out.println(longestValidParentheses(s));
	}
	
    public static int longestValidParentheses(String s) {
     
    	if(s.length() == 0) return 0;
    	Stack<Character> stack = new Stack<>();
    	int count = 0;
    	
    	for(int i = 0; i < s.length(); i++){
    		if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
    			stack.push(s.charAt(i));
    		}
    		else if(stack.isEmpty()) continue;
    		
    		else if(stack.peek() == '(' && s.charAt(i) == ')'){
    			stack.pop();
    			count += 2;
    		}
    		else if(stack.peek() == '{' && s.charAt(i) == '}'){
    			stack.pop();
    			count += 2;
    		}
    		else if(stack.peek() == '[' && s.charAt(i) == ']'){
    			stack.pop();
    			count += 2;
    		}
    		else{
    			continue;
    		}
    	}
    	return count;
    }

}
