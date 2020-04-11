package com.number;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache1 {
	
	Map<Integer, Integer> map;
	int capacity;
	
	public LRUCache1(int capacity){
		this.capacity = capacity;
		this.map = new LinkedHashMap<>();
	}
	
	public int get(int key){
		if(map.containsKey(key)){
			int v = map.get(key);
			map.remove(key);
			map.put(key, v);
			return v;
		}
		else{
			return -1;
		}
	}
	
	public void put(int key, int value){
		if(map.containsKey(key)){
			map.remove(key);
		}
		else if(map.size() == capacity){
			map.remove(map.entrySet().iterator().next().getKey());
		}
		map.put(key, value);
	}

	public static void main(String[] args) {
		LRUCache1 lru = new LRUCache1(4);
		lru.put(1, 1);
		lru.put(2, 2);
		lru.put(8, 8);
		lru.put(9, 9);
		System.out.println(lru.get(1));
		lru.put(3, 3);
		System.out.println(lru.get(2));
		lru.put(4, 4);
		System.out.println(lru.get(1));
		System.out.println(lru.get(3));
		System.out.println(lru.get(4));

	}

}
