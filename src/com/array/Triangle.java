package com.array;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		List<Integer> list4 = new ArrayList<>();
		list1.add(2);
		list2.add(3);
		list2.add(4);
		list3.add(6);
		list3.add(5);
		list3.add(7);
		list4.add(4);
		list4.add(1);
		list4.add(6);
		list4.add(8);
		triangle.add(list1);
		triangle.add(list2);
		triangle.add(list3);
		triangle.add(list4);
		
		System.out.println(minimumTotal(triangle));

	}
	
    public static int minimumTotal(List<List<Integer>> triangle) {
    	
    	if(triangle.size() == 0) return 0;
    	int sum = 0;
    	
    	for(List<Integer> l : triangle){
    		if(l.size() == 1){
    			sum += l.get(0);
    		}
    		else{
    			int min = Integer.MAX_VALUE;
    			for(Integer i : l){
    				if(i < min){
    					min = i;
    				}
    			}
    			sum += min;
    		}
    	}
    	return sum;
    }

}
