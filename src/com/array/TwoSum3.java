package com.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum3 {

	public static void main(String[] args) {

		int nums[] = {2,7,11,15};
		int target = 9;
		int[] res = twoSum(nums, target);
		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

	}
	
	public static int[] twoSum(int[] nums, int target)  {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				return new int[] {map.get(target - nums[i]), i};
			}
			else {
				map.put(nums[i], i);
			}
		}
		throw new IllegalArgumentException("No Solution");
	}

}
