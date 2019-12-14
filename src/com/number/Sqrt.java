package com.number;

public class Sqrt {

	public static void main(String[] args) {
		int x = 99;
		System.out.println(mySqrt(x));
	}
	
 	public static int mySqrt(int x) {
        if(x==0) return 0;

        
        int i = 1;
        int num1 = 1;
        int num2 = 1;
        @SuppressWarnings("unused")
		long sq1 = 0;
        long sq2 = 0;
        
        while(sq2 < x) {
            sq1 = (long)i*i;
            num1 = i;
            i++;
            sq2 = (long)i*i;
            num2 = i;
        }
        
        
        if(num2*num2 == x){
            return num2;
        }
        else if(num1 * num1 == x){
            return num1;
        }else{
            return num1;
        }
 	}
}
