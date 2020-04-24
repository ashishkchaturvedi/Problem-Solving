package com.array;

public class SubArraySumEqualsK1 {

	public static void main(String[] args) {
		int[] nums = {1,1,1};
		int k = 2;
		System.out.println(subarraySum(nums, k));

	}
	
	public static int subarraySum(int[] nums, int k){
		int count = 0;
		int[] sums = new int[nums.length + 1];
		sums[0] = 0;
		for(int i = 1; i < sums.length; i++){
			sums[i] = sums[i-1] + nums[i-1];
		}
		for(int start = 0; start < nums.length; start++){
			for(int end = start + 1; end <= nums.length; end++){
				if(sums[end] - sums[start] == k){
					count++;
				}
			}
		}
		return count;
	}

}
