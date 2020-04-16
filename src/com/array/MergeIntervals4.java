package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals4 {

	public static void main(String[] args) {
		
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] ans = merge(intervals);
		System.out.println(Arrays.deepToString(ans));

	}
	
	public static class IntervalComparator implements Comparator<int[]>{
		@Override
		public int compare(int[] a, int[] b){
			return a[0] < b[0] ? -1 : a[0] == b[0] ? 0 : 1;
		}
	}
	
	public static int[][] merge(int[][] intervals){
		Collections.sort(Arrays.asList(intervals), new IntervalComparator());
		LinkedList<int[]> mergedList = new LinkedList<>();
		for(int[] interval : intervals){
			if(mergedList.isEmpty() || mergedList.getLast()[1] < interval[0]){
				mergedList.add(interval);
			}
			else{
				mergedList.getLast()[1] = Math.max(mergedList.getLast()[1], interval[1]);
			}
		}
		return mergedList.toArray(new int[mergedList.size()][]);
	}

}
