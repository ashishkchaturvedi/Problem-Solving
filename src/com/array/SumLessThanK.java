package com.array;

import java.util.Arrays;

public class SumLessThanK {

	public static void main(String[] args) {
		int a[] = {10,20,30};
		int k = 15;
		int output = twoSumLessThanK(a, k);
		System.out.println(output);

	}
	
	public static int twoSumLessThanK(int a[], int k){
		Arrays.sort(a);
		int i = 0;
		int j = a.length - 1;
		int max = Integer.MIN_VALUE;
		while(i < j){
			int sum = a[i] + a[j];
			if(sum < k){
				if(sum > max){
					max = sum;
				}
				i++;
			}
			else{
				j--;
			}
		}
		if(max > 0){
			return max;
		}
		else{
			return -1;
		}
		
	}

}
