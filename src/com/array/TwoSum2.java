package com.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] res = twoSum(nums, target);
		for(int i : res){
			System.out.println(i);
		}
	}
	
    public static int[] twoSum(int[] nums, int target) {
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for(int i = 0; i < nums.length; i++){
    		int result = target - nums[i];
    		if(map.containsKey(result)){
    			return new int[] {map.get(result), i};
    		}
    		else{
    			map.put(nums[i], i);
    		}
    	}
    	
    	throw new IllegalArgumentException("No solution");
    }

}
