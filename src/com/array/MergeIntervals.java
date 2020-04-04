package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {

	private static class IntervalComparator implements Comparator<int[]>{
		
		@Override
		public int compare(int[] a, int[] b){
			return a[0] < b[0] ? -1 : a[0] == b[0] ? 0 : 1;
		}
	}
    public static int[][] merge(int[][] intervals) {
        
    	Collections.sort(Arrays.asList(intervals), new IntervalComparator());
    	
    	LinkedList<int[]> merged = new LinkedList<>();
    	
    	for(int[] interval : intervals){
    		if(merged.isEmpty() || merged.getLast()[1] < interval[0]) {
    			merged.add(interval);
    		}
    		else{
    			merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
    		}
    	}
    	return merged.toArray(new int[merged.size()][]);
    }
	
	public static void main(String[] args) {
		
		int[][] intervals = {{1,9},{2,5},{19,20},{10,11},{12,20},{0,3},{0,1},{0,2}};
		int[][] res = merge(intervals);
		System.out.print("[");
		for(int i = 0; i < res.length; i++){
			System.out.print("(");
			for(int j = 0; j < res[0].length; j++){
				System.out.print(res[i][j] +",");
			}
			System.out.print(")");
		}
		System.out.print("]");
	}

}
