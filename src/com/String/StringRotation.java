package com.String;

public class StringRotation {

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(isRotation(s1, s2));
	}
	
	public static boolean isRotation(String s1, String s2){
		String s3 = s1 + s1;
		if(s3.contains(s2)){
			return true;
		}
		return false;
	}

}
