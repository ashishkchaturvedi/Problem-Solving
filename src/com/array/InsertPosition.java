package com.array;

public class InsertPosition {

    public static int searchInsert(int[] nums, int target) {
    	
    	int n = nums.length;
    	int position = 0;
    	
    	if(nums.length == 0) return 0;
    	
    	if(nums[0] > target){
    		position = 0;
    		return position;
    	}
    	
    	for(int i = n-1; i >= 0; i--){
    		if(nums[i]==target){
    			position = i;
    			break;
    		}
    		else if(target > nums[i]){
    			position = i+1;
    			break;
    		}
    		else if(target < nums[i]){
    			position = i - 1;
    			//b//reak;
    		}
    	}
    	return position;
    }
    
	public static void main(String[] args) {
		int a[] = {1,3,5,6};
		int target = 0;
		System.out.println(searchInsert(a, target));
		
		
	}

}
