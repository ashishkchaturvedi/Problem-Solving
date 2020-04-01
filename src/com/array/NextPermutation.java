package com.array;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4,5};
		nextPermutation(nums);

	}
	
	public static void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        while (i > 0 && nums[i - 1] >= nums[i]){
            i--;
        }
        if(i <= 0){
            Arrays.sort(nums);
        }
        else{
           int j = nums.length - 1;
            while (nums[j] <= nums[i - 1]) {
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
        for(int k = 0; k < nums.length; k++){
        	System.out.println(nums[k]);
        }
    }

}
