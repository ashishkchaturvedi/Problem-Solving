package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public static void main(String[] args) {
		
		int[] nums = {1,1,1,2,2,3};
		int k = 2;
		System.out.println(topKFrequent(nums, k));
	}
	
    public static List<Integer> topKFrequent(int[] nums, int k) {
        
    	int n = nums.length;
    	Map<Integer, Integer> map = new HashMap<>();
    	List<Integer> result = new ArrayList<>();
    	
    	for(int i = 0; i < n; i++){
    		map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    	}
    	
    	PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
       );
    	
    	for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    		queue.offer(entry);
    		if(queue.size() > k){
    			queue.poll();
    		}
    	}
    	
    	while(!queue.isEmpty()){
    		result.add(0, queue.poll().getKey());
    	}
    	
    	return result;
    }

}
