package com.String;

public class AddBinary2 {

	public static void main(String[] args) {
		String a = "1010";
		String b = "1101";
		System.out.println(addBinary(a, b));

	}
	
	public static String addBinary(String a, String b){
		return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b,2));
	}

}
