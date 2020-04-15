package com.number;

public class FirstBadVersion2 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(firstBadVersion(n));

	}
	
	public static int firstBadVersion(int n) {
		int start = 0, end = n;
		while(start  < end){
			int mid = start + (end - start)/2;
			if(isBadVersion(mid)){
				end = mid;
			}
			else{
				start = mid + 1;
			}
		}
		return start;
	}

	private static boolean isBadVersion(int mid) {
		if(mid == 4) return true;
		return false;
	}

}
