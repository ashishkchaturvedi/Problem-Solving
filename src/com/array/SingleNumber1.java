package com.array;

public class SingleNumber1 {

	public static void main(String[] args) {
		int nums[] = {2,2,1};
		System.out.println(singleNumber(nums));

	}
	
	 public static int singleNumber(int[] nums){
		 int n = nums.length;
		 int result = 0;
		 for(int i = 0; i < n; i++){
			 result ^= nums[i];
		 }
		 return result;
	 }

}
