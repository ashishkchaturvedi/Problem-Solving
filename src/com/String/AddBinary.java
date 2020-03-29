package com.String;

public class AddBinary {

	public static void main(String[] args) {
		String a = "1";
		String b = "111";
		System.out.println(addBinary(a, b));
	}
	
    public static String addBinary(String a, String b) {
        boolean carry = false;
        StringBuilder res = new StringBuilder();
        int n = a.length();
        int m = b.length();
        int l = n > m ? n : m;
        
        for(int i = 1; i <= l; i++){
        	char val1 = '0';
        	char val2 = '0';
        	
        	if(!(i > n) && a.charAt(n-i) == '1') val1 = '1';
        	if(!(i > m) && b.charAt(m-i) == '1') val2 = '1';
        	
        	if(val1 == '1' && val2 == '1'){
        		if(carry){
        			res.append('1');
        			carry = true;
        		}else{
        			res.append('0');
        			carry = true;
        		}
        	}
        	else if(val1 == '1' && val2 == '0'){
        		if(carry){
        			res.append('0');
        			carry = true;
        		}else{
        			res.append('1');
        		}
        	}
        	else if(val1 == '0' && val2 == '1'){
        		if(carry){
        			res.append('0');
        			carry = true;
        		}else{
        			res.append('1');
        		}
        	}
        	else{
        		if(carry){
        			res.append('1');
        			carry = false;
        		}
        		else res.append('0');
        	}
        }
        if(carry) res.append('1');
        return res.reverse().toString();
    }
}
