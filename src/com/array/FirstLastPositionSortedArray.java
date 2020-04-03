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
        int l = -1;
        int r = -1;
        if(end == -1) return new int[]{-1,-1};
        if(nums[0] == target && nums[end] == target) return new int[]{0,end};
        
        if(nums[0] == target){
            l = r = 0;
            if(nums.length > 1){
                if(nums[1] == target){
                    r = 1;
                    while(nums[r] == target){
                        r++;
                    }
                    r--;
                }
                return new int[]{l,r};
            }
            else return new int[]{l,r};
        }
        
        if(nums[end] == target){
            l = r = end;
            if(nums[end-1] == target) {
                l = end-1;
                while(nums[l] == target){
                    l--;
                }
                l++;
            }
            return new int[]{l,r};
        }
        
        System.out.println("I am here");
        while(start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println("mid is:"+mid);
            if(nums[mid] == target){
                l = r = mid;
                if(nums[mid-1] == target){
                    l = mid-1;
                    while(nums[l] == target){
                        l--;
                    }
                    l++;
                }
                if(nums[mid+1] == target){
                    r = mid+1;
                    while(nums[r] == target){
                        r++;
                    }
                    r--;
                }
                return new int[]{l,r};
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
