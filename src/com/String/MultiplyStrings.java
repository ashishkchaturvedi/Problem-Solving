package com.String;

public class MultiplyStrings {

	public static void main(String[] args) {
		
		String num1 = "12";
		String num2 = "10";
		System.out.println(multiply(num1, num2));

	}
	
    public static String multiply(String num1, String num2) {
    	
    	int m = num1.length(), n = num2.length();
    	int[] cal = new int[m+n];
    	String res = new String();
    	
    	for(int i = m-1; i >=0; i--){
    		for(int j = n-1; j >= 0; j--){
    			int p1 = i + j, p2 = i + j + 1;
    			int curr = (num1.charAt(i) - '0') * (num2.charAt(j) - '0') + cal[p2];
    			cal[p2] = curr % 10;
    			System.out.println("cal[p2] is: "+cal[p2]);
    			cal[p1] += curr / 10;
    			System.out.println("cal[p1] is: " + cal[p1]);
     		}
    	}
    	for(int i : cal){
    		if(res.length() != 0 || i != 0){
    			System.out.println("I is:" + i);
    			res += i;
    		}
    	}
    	return res.length() == 0 ? "0" : res;
    }

}
