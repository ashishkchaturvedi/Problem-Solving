package com.array;

public class FirstLastPositionSortedArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int target  = 2;
		int ans[] = searchRange(nums, target);
		for(int i = 0; i < ans.length; i++){
			System.out.println(ans[i]);
		}
	}
	
	public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
            
        if(end == -1) return new int[]{-1,-1};
        if(nums[0] == target && nums[end] == target) return new int[]{0,end};
        
        if(nums[0] == target){
            if(nums.length > 1){
                if(nums[1] == target) return new int[]{0,1};
                else return new int[]{0,0};
            }
            else return new int[]{0,0};
        }
        
        if(nums[end] == target){
            if(nums[end-1] == target) return new int[]{end-1,end};
            else return new int[]{end,end};
        }
        
        System.out.println("I am here");
        while(start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println("mid is:"+mid);
            if(nums[mid] == target){
                System.out.println("I am here, mid is:" +mid);
                if(nums[mid-1] == target){
                    return new int[] {mid-1, mid};
                }
                else if(nums[mid+1] == target){
                    return new int[] {mid, mid+1};
                }
                else return new int[]{mid,mid};
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

}
