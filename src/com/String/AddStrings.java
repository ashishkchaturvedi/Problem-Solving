package com.String;

import java.util.HashMap;
import java.util.Map;

public class AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "123455";
		String num2 = "56789";
		System.out.println(addStrings(num1, num2));
	}
	
	 public static String addStrings(String num1, String num2) {
	        StringBuilder str = new StringBuilder();
	        Map<Character, Integer> map = new HashMap<>();
	        map.put('0', 0);
	        map.put('1', 1);
	        map.put('2', 2);
	        map.put('3', 3);
	        map.put('4', 4);
	        map.put('5', 5);
	        map.put('6', 6);
	        map.put('7', 7);
	        map.put('8', 8);
	        map.put('9', 9);
	        int n = num1.length();
	        int m = num2.length();
	        int carry = 0;
	        while(n != 0 || m != 0){
	            char ch1 = '0';
	            char ch2 = '0';
	            if(n > 0){
	                ch1 = num1.charAt(n-1);
	                n--;    
	            }
	            if(m > 0){
	                ch2 = num2.charAt(m-1);
	                m--;                
	            }
	            int sum = map.get(ch1) + map.get(ch2) + carry;
	            carry = sum/10;
	            str.append(sum%10);
	        }
	        if(carry > 0) str.append(carry);
	        return str.reverse().toString();
	    }

}
