package com.number;

import java.util.Arrays;

public class SumOfMinimumDigits {

	public static void main(String[] args) {
		int A[] = {99,77,33,66,55};
		System.out.println(sumOfDigits(A));

	}
	
    public static int sumOfDigits(int[] A) {
        Arrays.sort(A);
        
        int num = A[0];
        if(num <= 9){
        	if(num % 2 != 0){
        		return 0;
        	}
        	else{
        		return 1;
        	}
        }
        
        else{
        	int sum = getSum(num);
        	if(sum % 2 != 0){
        		return 0;
        	}
        	else{
        		return 1;
        	}
        }
    }

	private static int getSum(int num) {
		int sum = 0;
		while(num > 0){
			int d = num % 10;
			num /= 10;
			sum += d;
		}
		return sum;
	}

}
