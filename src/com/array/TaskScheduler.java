package com.array;

import java.util.Arrays;

public class TaskScheduler {

	public static void main(String[] args) {
		
		char[] tasks = {'A','A','A','B','B','B'};
		int n = 2;
		System.out.println(leastInterval(tasks, n));

	}
	
	public static int leastInterval(char[] tasks, int n){
		int[] map = new int[26];
		for(char c : tasks){
			map[c - 'A']++;
		}
		Arrays.sort(map);
		int time = 0;
		
		while(map[25] > 0){
			int i = 0;
			while(i <= n){
				if(map[25] == 0) break;
				if(i < 26 && map[25 - i] > 0){
					map[25 - i]--;
				}
				time++;
				i++;
			}
			Arrays.sort(map);
		}
		return time;
	}

}
