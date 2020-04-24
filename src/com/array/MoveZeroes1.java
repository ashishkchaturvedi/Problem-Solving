package com.array;

import java.util.Arrays;

public class MoveZeroes1 {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);

	}
	
	public static void moveZeroes(int[] nums){
		if(nums.length == 0) return;
		int j = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != 0) nums[j++] = nums[i];
		}
		
		while(j < nums.length){
			nums[j++] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}

}
