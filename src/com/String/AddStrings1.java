package com.String;

import java.util.HashMap;
import java.util.Map;

public class AddStrings1 {

	public static void main(String[] args) {
		String num1 = "1";
		String num2 = "9";
		System.out.println(addStrings(num1, num2));
	}
	
	public static String addStrings(String num1, String num2){
		StringBuilder sb = new StringBuilder();
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
		int n = num1.length(), m = num2.length();
		int l = n > m ? n : m;
		int sum = 0, carry = 0;
		while(l > 0){
			char c1 = (n > 0) ? num1.charAt(n-1) : '0';
			char c2 = (m > 0) ? num2.charAt(m-1) : '0';
			int val1 = map.get(c1);
			int val2 = map.get(c2);
			sum = val1 + val2 + carry;
			sb.append(sum % 10);
			carry = sum / 10;
			n--;
			m--;
			l--;
		}
		if(carry != 0) sb.append(carry);
		return sb.reverse().toString();
	}

}
