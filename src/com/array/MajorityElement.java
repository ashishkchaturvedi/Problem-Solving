package com.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));

	}
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int mark = n / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i : map.keySet()){
        	if(map.get(i) > mark){
        		return i;
        	}
        }
        return -1;
    }

}
