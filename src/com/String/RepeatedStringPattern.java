package com.String;

public class RepeatedStringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";
		System.out.println(repeatedSubstringPattern(s));
	}
	
	
	public static  boolean repeatedSubstringPattern(String s) {

	    int len=s.length();
	    for(int i=len/2; i>=1; i--) {
	        
	        if(len%i==0) {
	            
	            int r=len/i;
	            
	            StringBuilder d=new StringBuilder();
	            String h=s.substring(0,i);
	            System.out.println(h);
	            for(int j=0;j<r;j++) {
	                d.append(h);
	            }   
	            if(d.toString().equals(s))  return true;   
	        }
	    }
	    return false;
	}

}
