package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int nums[] = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(nums));

	}
	
    public static List<List<Integer>> threeSum(int[] nums) {
    	
    	List<List<Integer>> res = new ArrayList<>();
    	int n = nums.length, l = 0, r = 0;
    	Arrays.sort(nums);
    	
    	for(int i = 0; i < n; i++){
    		if(nums[i] > 0 || i + 3 > n) return res;
    		if(i > 0 && nums[i] == nums[i-1]) continue;
    		
    		int target = -nums[i];
    		l = i + 1;
    		r = n - 1;
    		
    		while(l < r){
    			int actual = nums[l] + nums[r];
    			if(actual == target){
    				res.add(Arrays.asList(nums[i], nums[l], nums[r]));
    				while(l < r && nums[l] == nums[++l]);
    				while(l < r && nums[r] == nums[--r]);
    			}
    			else if(actual < target){
    				l++;
    			}else{
    				r--;
    			}
    		}
    	}
    	return res;
    }

}
