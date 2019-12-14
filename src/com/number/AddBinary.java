package com.number;

public class AddBinary {

	public static void main(String[] args) {
		String a = "1010";
		String b = "1101";
		
		System.out.println(addBinary(a, b));

	}
	
    public static String addBinary(String a, String b) {
     
     int len = 0;
     if(a.length() > b.length()) {
         len = a.length();
     }
     else {
         len = b.length();
     }
     
     StringBuilder sb = new StringBuilder();
     boolean carry = false;
     
     for(int i=1; i<=len; i++) {
         char val1 = '0';
         char val2 = '0';
         if( !(i > a.length()) && a.charAt(a.length()-i) == '1')
             val1 = '1';
         if( !(i > b.length()) && b.charAt(b.length()-i) == '1')
             val2 = '1';
         if(val1 == '1' && val2 == '1') {
             if(carry) {
                 sb.append("1");
                 carry = true;
             }
             else {
                 sb.append("0");
                 carry = true;
             }
         }
         else if(val1 == '1' && val2 == '0') {
             if(carry) {
                 sb.append("0");
                 carry = true;
             }
             else {
                 sb.append("1");
                 carry = false;
             }
         }
         else if(val1 == '0' && val2 == '1') {
             if(carry) {
                 sb.append("0");
                 carry = true;
             }
             else {
                 sb.append("1");
                 carry = false;
             }
         }
         else if(carry) {
             sb.append("1");
             carry = false;
         }
         else {
             sb.append("0");
             carry = false;
         }
     }
     if(carry) {
         sb.append("1");
     }
     
     return sb.reverse().toString();
 }

}
