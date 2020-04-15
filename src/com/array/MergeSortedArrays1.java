package com.array;

import java.util.Arrays;

public class MergeSortedArrays1 {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3, n = 3;
		merge(nums1, m, nums2, n);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n){
		
		int l = m + n;
		
		while(m > 0 && n > 0){
			if(nums1[m-1] >= nums2[n-1]){
				nums1[l-1] = nums1[m-1];
				m--;
			}
			else{
				nums1[l-1] = nums2[n-1];
				n--;
			}
			l--;
		}
		while(m > 0){
			nums1[l-1] = nums1[m-1];
			m--;
			l--;
		}
		
		while(n > 0){
			nums1[l-1] = nums2[n-1];
			l--;
			n--;
		}
		System.out.println(Arrays.toString(nums1));
	}

}
