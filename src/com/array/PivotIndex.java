package com.array;


public class PivotIndex {

	public static void main(String[] args) {
		
		int nums[] = {1, 7, 3, 6, 5, 6};
		System.out.println(pivotIndex(nums));
	}
	
    public static int pivotIndex(int[] nums) {
    	
    	int sum = 0, leftSum = 0;
    	
    	for(int x : nums){
    		sum += x;
    	}
    	
    	for(int i = 0; i < nums.length; i++){
    		if(leftSum == sum - leftSum - nums[i]) return i;
    		leftSum += nums[i];
    	}
    	return -1;
    }

}
