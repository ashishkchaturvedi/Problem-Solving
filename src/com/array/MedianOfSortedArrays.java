package com.array;

public class MedianOfSortedArrays {

	public static void main(String[] args) {
		int nums1[] = {1, 3};
		int nums2[] = {2};
		System.out.println(findMedianSortedArrays(nums1, nums2));

	}
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
    	int[] m = new int[nums1.length + nums2.length];
    	int i1 = 0, i2 = 0;
        
    	while(i1+i2 <= Math.round((double)(m.length-1)/2)) {
    		if (i2 == nums2.length || i1 < nums1.length && nums1[i1] < nums2[i2]) {
    			m[i1+i2] = nums1[i1];
    			i1++;
    		}else {
    			m[i1+i2] = nums2[i2];
    			i2++;
    		}
    	}
    	return (double) (m[(int) Math.round((double)(m.length-1)/2)] + m[(m.length-1)/2]) /2;
    }

}
