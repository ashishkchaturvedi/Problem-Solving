package com.array;

public class RemoveElement {

	public static void main(String[] args) {
		
		int nums[] = {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println(removeElement(nums, val));

	}
	
    public static int removeElement(int[] nums, int val) {
    
    	if(nums.length == 0) return 0;
    	
    	int  j = 0;
    	
    	for(int i = 0; i < nums.length; i++){

    		if(nums[i] != val){
    			nums[j] = nums[i];
    			j++;
    		}
    	}
    	for(int i = 0; i < j; i++){
    		System.out.println(nums[i]);
    	}
    	return j;
    }

}
