package com.number;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
	Map<Integer, Integer> cache;
	int capacity;
	
	public LRUCache(int capacity){
		this.capacity = capacity;
		this.cache = new LinkedHashMap<Integer, Integer>();
	}
	
	public int get(int key){
		if(cache.containsKey(key)){
			int v = cache.get(key);
			cache.remove(key);
			cache.put(key, v);
			return v;
		}
		else{
			return -1;
		}
	}
	
	public void put(int key, int value){
		if(cache.containsKey(key)){
			cache.remove(key);
		}
		else if(cache.size() == capacity){
			System.out.println("Removing:"+cache.remove(cache.entrySet().iterator().next().getKey()));
		}
		cache.put(key, value);
	}

	public static void main(String[] args) {
		
		LRUCache lru = new LRUCache(4);
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
