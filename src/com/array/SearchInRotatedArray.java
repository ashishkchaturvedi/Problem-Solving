package com.array;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(search(nums, target));

	}
	
	public static int search(int[] nums, int target){
		if(nums.length == 0) return -1;
        int i = nums.length - 1;
        while(i > 0  && nums[i] > nums[i-1]){
            i--;
        }
        int start = 0;
        int end = 0;
        if(i == 0){
            end = nums.length -1 ;
        }
        else if(target >= nums[0] && target <= nums[i-1]){
            end = i-1;
        }
        else{
            start = i;
            end = nums.length - 1;
        }
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return - 1;
	}

}
