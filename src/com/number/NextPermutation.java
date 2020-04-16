package com.number;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		int[] nums = {0, 1, 2, 5, 3, 3, 0};
		nextPermutation(nums);

	}
	
	public static void nextPermutation(int[] nums){
		int i = nums.length - 1;
		
		while(i >= 0 && nums[i-1] >= nums[i]){
			i--;
		}
		if(i <= 0){
			Arrays.sort(nums);
		}
		else{
			int j = nums.length - 1;
			while(nums[i-1] >= nums[j]){
				j--;
			}
			nums[i-1] = nums[i-1] + nums[j];
			nums[j] = nums[i-1] - nums[j];
			nums[i-1] = nums[i-1] - nums[j];
			
			j = nums.length - 1;
			while(i < j){
				nums[i] = nums[i] + nums[j];
				nums[j] = nums[i] - nums[j];
				nums[i] = nums[i] - nums[j];
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
