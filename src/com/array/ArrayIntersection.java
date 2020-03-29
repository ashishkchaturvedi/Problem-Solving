package com.array;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] ans = intersection(nums1, nums2);
		System.out.print("[");
		for(int i : ans){
			System.out.print(i + ",");
		}
		System.out.print("]");

	}
	
	public static int[] intersection(int[] nums1, int[] nums2){
		Set<Integer> set = new HashSet<>();
		Set<Integer> result = new HashSet<>();
		
		for(int i = 0; i < nums1.length; i++){
			set.add(nums1[i]);
		}
		for(int i = 0; i < nums2.length; i++){
			if(set.contains(nums2[i])){
				result.add(nums2[i]);
			}
		}
		int k = 0;
		int[] array = new int[result.size()];
		for(Integer i : result){
			array[k++] = i;
		}
		
		return array;
	}

}
