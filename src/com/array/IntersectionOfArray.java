package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1}, nums2 = {2,2};
		int[] ans = intersection(nums1, nums2);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int[] intersection(int[] nums1, int[] nums2){
		Set<Integer> firstArray = new HashSet<>();
		Set<Integer> result = new HashSet<>();
		
		for(int i : nums1){
			firstArray.add(i);
		}
		
		for(int i : nums2){
			if(firstArray.contains(i)){
				result.add(i);
			}
		}
		int k =0;
		int[] ans = new int[result.size()];
		for(int i : result){
			ans[k++] = i;
		}
		return ans;
	}

}
