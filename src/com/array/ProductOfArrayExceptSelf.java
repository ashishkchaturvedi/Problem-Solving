package com.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] res = productExceptSelf(nums);
		System.out.println(Arrays.toString(res));

	}
	
	public static int[] productExceptSelf(int[] nums){
		int n = nums.length;
		int[] output = new int[n];
		
		for(int i = 0; i < n; i++){
			int j = 0;
			int prod = 1;
			while(j < n){
				if(j != i){
					prod *= nums[j];
				}
				j++;
			}
			output[i] = prod;
		}
		return output;
	}

}
