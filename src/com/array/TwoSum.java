package com.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public static int[] findTarget(int[] arr, int target){
		for(int i = 0; i < arr.length; i++){
			int result = target - arr[i];
			if(map.containsKey(result)){
				return new int[] {map.get(result), i};
			}
			else{
				map.put(arr[i], i);
			}
		}
		throw new IllegalArgumentException("No Solution");
	}

	public static void main(String[] args) {
		int a[] = {2, 7, 11, 15};
		int[] output = findTarget(a, 9);
		for(int i : output){
			System.out.print(i+" ,");
		}

	}

}
