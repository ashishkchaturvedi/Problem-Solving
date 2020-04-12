package com.array;

import java.util.Arrays;

public class ProductOfArrayExceptItself {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4};
		int[] result = productExceptSelf(nums);
		System.out.println(Arrays.toString(result));

	}
	
	public static int[] productExceptSelf(int[] nums){
		int n = nums.length;
		int[] result = new int[n];
		
		for(int i = 0; i < n; i++){
			int j = 0;
			int prod = 1;
			while(j < n){
				if(i != j){
					prod *= nums[j];
				}
				j++;
			}
			result[i] = prod;
		}
		return result;
	}

}
