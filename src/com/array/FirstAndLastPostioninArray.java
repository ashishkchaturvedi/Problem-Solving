package com.array;

public class FirstAndLastPostioninArray {

	public static void main(String[] args) {
		int nums[] = {5,7,7,8,8,10}, target = 8;
		int[] res = searchRange(nums, target);
		for(int i = 0; i < res.length; i++){
			System.out.println(res[i]);
		}

	}
	
	public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                res[0] = i;
                break;
            }
        }
        if(res[0] == -1){
            return res;
        }
        
        for(int j = nums.length - 1; j >= 0; j--){
            if(nums[j] == target){
                res[1] = j;
                break;
            }
        }
        return res;
    }

}
