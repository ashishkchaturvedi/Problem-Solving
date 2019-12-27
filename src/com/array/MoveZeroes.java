package com.array;

public class MoveZeroes {

	public static void main(String[] args) {
		int nums[] = {0,0,1};
		moveZeroes(nums);

	}
	
    public static void moveZeroes(int[] nums) {
    	if(nums.length == 0) return;
    	
    	int j = 0;
    	for(int i = 0; i < nums.length; i++){
    		if(nums[i] != 0) nums[j++] = nums[i];
    	}
    	
    	while(j < nums.length) nums[j++] = 0;
    	
    	for(int i = 0; i < nums.length; i++){
    		System.out.println(nums[i]);
    	}
    }

}
