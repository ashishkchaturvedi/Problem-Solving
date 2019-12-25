package com.array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int nums[] = {1,1,2,3,3,3,3,4,5,6,6,7,7,8,8,8,9,9,9};
		System.out.println(removeDuplicates(nums));

	}
	
    public static int removeDuplicates(int[] nums) {
    	if(nums.length == 0) return 0;
    	
    	int count = 1;
    	int j = 1;
    	for(int i = 0; i < nums.length - 1; i++){
    		if(nums[i] != nums[i+1]){
    			count++;
    			nums[j] = nums[i + 1];
    			j++;
    		}
    	}
    	
    	for(int i = 0; i < count; i++){
    		System.out.println(nums[i]);
    	}
    	return count;
    }

}
