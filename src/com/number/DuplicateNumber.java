package com.number;

import java.util.Arrays;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] nums = {3,1,3,4,2};
		System.out.println(findDuplicate(nums));
	}
	
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
    	for(int i = 0; i < nums.length - 1; i++){
        	if(nums[i] == nums[i + 1]){
        		res = nums[i];
        	}
        }
    	return res;
    }

}
