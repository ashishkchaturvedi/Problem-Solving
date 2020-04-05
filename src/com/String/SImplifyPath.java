package com.String;

import java.util.Stack;

public class SImplifyPath {

	public static void main(String[] args) {
		
		String path = "/a/b/c/.././././//d";
		System.out.println(simplifyPath(path));

	}
	
	public static String simplifyPath(String path){
		
		Stack<String> stack = new Stack<>();
		String components[] = path.split("/");
		StringBuilder result = new StringBuilder();
		
		for(String directory : components){
			if(directory.equals(".") || stack.isEmpty()) {
				continue;
			}
			
			else if(directory.equals("..")){
				if(!stack.isEmpty()){
					stack.pop();
				}
			}
			else{
				stack.push(directory);
			}
		}
		
		for(String dir : stack){
			result.append("/");
			result.append(dir);
		}
		
		return result.length() > 0 ? result.toString() : "/";
	}

}
