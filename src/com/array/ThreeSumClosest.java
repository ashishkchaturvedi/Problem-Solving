package com.array;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		
		int nums[] = {-3,-2,-5,3,-4};
		int target = -1;
		System.out.println(threeSumClosest(nums, target));
	}
	
    public static int threeSumClosest(int[] nums, int target) {
       if(nums.length==3) return nums[0]+nums[1]+nums[2];
       Arrays.sort(nums);
		int res = 0, diff = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (Math.abs(sum - target) < diff) {
					diff = Math.abs(sum - target);
					res = sum;
				}
               if(sum > target){
                   k--;
               }else{
                   j++;
               }
			}
		}
		return res;
    }

}
