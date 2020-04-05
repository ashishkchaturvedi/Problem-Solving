package com.array;

public class MergeArrays {

	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3, n =3;
		merge(nums1, m, nums2, n);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n){
		
		int l = m+n;
		
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
		
		if(m > 0){
			while(m > 0){
				nums1[l-1] = nums1[m-1];
				m--;
				l--;
			}
		}
		
		if(n > 0){
			while(n > 0){
				nums1[l-1] = nums2[n-1];
				n--;
				l--;
			}
		}
		
		for(int i : nums1){
			System.out.print(i+",");
		}
	}

}
