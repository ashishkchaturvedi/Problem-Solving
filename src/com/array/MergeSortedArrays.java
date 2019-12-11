package com.array;

public class MergeSortedArrays {

	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int n = 3;
		int m = 3;
		
		merge(nums1, m, nums2, n);
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = nums1.length - 1;
        
        while(m > 0 && n > 0){
        	if(nums1[m-1] < nums2[n-1]){

        		System.out.println("n is:" +n);
        		nums1[l] = nums2[n-1];
        		//System.out.println(nums1[l]);
        		l--;
        		n--;
        	}
        	else{

        		System.out.println("m is: "+m);
        		nums1[l] = nums1[m-1];
        		//System.out.println(nums1[l]);
        		l--;
        		m--;
        	}
        }
        
        for(int i = 0; i < nums1.length; i++){
        	System.out.println(nums1[i]);
        }
    }

}
