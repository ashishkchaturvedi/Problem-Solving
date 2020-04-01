package com.array;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = {4,5,6,7,8,0,1,2,3};
		int target = 4;
		System.out.println(search(nums, target));

	}
	
	 public static int search(int[] nums, int target){
		 
		 int n = nums.length;
		 if(n == 0) return -1;
		 int i = n - 1;
		 while(i >= 0 && nums[i] > nums[i-1]){
			 i--;
		 }
		 
		 int start = 0;
		 int end = 0;
		 if(i == 0){
			 start = 0;
			 end = n-1;
		 }
		 else if(target >= nums[0] && target <= nums[i-1]){
			 start = 0;
			 end = i-1;
		 }
		 else{
			 start = i;
			 end = n-1;
		 }
		 
		 while(start < end){
			 int mid = start + (end - start) / 2;
			 if(nums[mid] == target) return mid;
			 else if(nums[mid] < target){
				 start = mid + 1;
			 }
			 else {
				 end = mid - 1;
			 }
		 }
		 return -1;
	 }

}
