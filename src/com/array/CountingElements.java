package com.array;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {

	public static void main(String[] args) {
		int[] arr = {1,3,2,3,5,0};
		System.out.println(countElements(arr));
		

	}
	
	public static int countElements(int[] arr){
		Set<Integer> set = new HashSet<>();
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			set.add(arr[i]);
		}
		for(int i = 0; i < arr.length; i++){
			if(set.contains(arr[i] + 1)) count++;
		}
		return count;
	}

}
