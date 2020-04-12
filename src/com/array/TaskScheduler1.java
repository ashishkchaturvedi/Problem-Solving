package com.array;

import java.util.Arrays;

public class TaskScheduler1 {

	public static void main(String[] args) {
		char tasks[] = {'A','A','A','B','B','B'};
		int n = 2;
		System.out.println(leastInterval(tasks, n));

	}
	
	 public static int leastInterval(char[] tasks, int n){
		 int map[] = new int[26];
		 int time = 0;
		 for(char ch : tasks){
			 map[ch - 'A']++;
		 }
		 Arrays.sort(map);
		 
		 while(map[25] > 0){
			 int i = 0;
			 while(i <= n){
				 if(map[25] == 0) break;
				 if(i < 26 && map[25-i] > 0){
					 map[25-i]--;
				 }
				 time++;
				 i++;
			 }
			 Arrays.sort(map);
		 }
		 return time;
	 }

}
