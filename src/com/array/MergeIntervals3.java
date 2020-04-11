package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals3 {

	public static void main(String[] args) {
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] result = merge(intervals);
		System.out.println(Arrays.deepToString(result));

	}
	
	public static class IntervalComparator implements Comparator<int[]>{
		
		@Override
		public int compare(int[] a, int[] b){
			return a[0] < b[0] ? -1 : a[0] == b[0] ? 0 : 1;
		}
	}
	
	public static int[][] merge(int[][] intervals){
		
		Collections.sort(Arrays.asList(intervals), new IntervalComparator());
		LinkedList<int[]> list = new LinkedList<>();
		for(int[] interval : intervals){
			if(list.isEmpty() || list.getLast()[1] < interval[0]){
				list.add(interval);
			}
			else{
				list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
			}
		}
		return list.toArray(new int[list.size()][]);
	}

}
