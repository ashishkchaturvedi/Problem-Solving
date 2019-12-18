package com.array;

public class WaterContainer {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));

	}
	
   public static int maxArea(int[] height) {
     int n = height.length;
     int max = Integer.MIN_VALUE;
     
     int i = 0;
     int j = n - 1;
     
     while(i < j){
    	 int diff = j - i;
    	 int capacity = diff * (Math.min(height[i], height[j]));
    	 //System.out.println(capacity);
    	 if(max < capacity){
    		 max = capacity;
    	 }
    	 
    	 if(height[i] >= height[j]){
    		 j--;
    	 }else{
    		 i++;
    	 }
     }
     
     return max;
   }
}
