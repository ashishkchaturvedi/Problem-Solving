package com.number;

public class FirstbadVersion1 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(firstBadVersion(n));

	}
	
	public static boolean isBadVersion(int n){
		if(n == 4) return true;
		return false;
	}
	
	public static int firstBadVersion(int n){
		
		int start = 1, end = n;
		while(start < end){
			int mid = start + (end - start) / 2;
			if(isBadVersion(mid)){
				end = mid;
			}
			else{
				start = mid + 1;
			}
			
		}
		return start;
	}

}
