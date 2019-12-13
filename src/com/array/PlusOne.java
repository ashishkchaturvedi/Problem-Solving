package com.array;

public class PlusOne {

	public static void main(String[] args) {
		
		int digits[] = {9};
		int a[] = plusOne(digits);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}

	}
	
	public static int[] plusOne(int[] digits) {
		
		int digitsLength = digits.length;
	    
	    if(digits[digitsLength-1] < 9){
	        digits[digitsLength-1] = digits[digitsLength-1]+1;
	        return digits;
	    } 
	    
	    digits[digitsLength-1] = digits[digitsLength-1]+1;
	    
	    for(int i=digitsLength-2; i>=0;i--){
	        if(digits[i+1] % 10 == 0){
	            digits[i] =digits[i]+1;
	            digits[i+1] =0;
	        }else{
	            break;
	        }
	    }
	    
	    if(digits[0]% 10 == 0){
	        int[] newDigits =new int[digitsLength+1];
	        newDigits[0]=1;
	        return newDigits;
	    }
	    
	    return digits;
    }
}
