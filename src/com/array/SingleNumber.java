package com.array;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {-1, -1, -2};
		System.out.println(singleNumber(nums));

	}
	
    public static int singleNumber(int[] nums) {
    	int result = 0;
    	int n = nums.length;
    	for(int i = 0; i < n ; i ++){
    		result ^= nums[i];
    	}
    	return result;
    }

}
