package com.String;

import java.util.Stack;

public class SimplifyPath2 {

	public static void main(String[] args) {
		
		String path = "/a/b/c/.././././//d";
		System.out.println(simplifyPath(path));
	}
	
	public static String simplifyPath(String path) {
		
		String components[] = path.split("/");
		Stack<String> directory = new Stack<>();
		StringBuilder result = new StringBuilder();
		
		for(String component : components){
			if(component.equals("..")){
				if(!directory.isEmpty()){
					directory.pop();
				}
			}
			else if(component.equals(".") || component.isEmpty()){
				continue;
			}
			else{
				directory.push(component);
			}
		}
			
		for(String dir  : directory){
			result.append("/");
			result.append(dir);
		}
		return result.length() > 0 ? result.toString() : "/";
	}
}
