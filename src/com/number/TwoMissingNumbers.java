package com.number;

public class TwoMissingNumbers {
	
	public static int[] twoMissing(int a[]){
		int size = a.length + 2;
		long totalSum = size * (size + 1) / 2;
		long arrSum = 0;
		for(int i : a){
			arrSum += i; 
		}
		
		int pivot = (int) ((totalSum - arrSum) / 2);
		
		int totalLeftXor = 0;
		int totalRightXor = 0;
		int arrLeftXor = 0;
		int arrRightXor = 0;
		
		for(int i = 1; i <= pivot; i++) totalLeftXor ^= i;
		for(int i = pivot + 1; i <=size; i++) totalRightXor ^= i;
		for(int i : a){
			if(i <= pivot){
				arrLeftXor ^= i;
			}else{
				arrRightXor ^= i;
			}
		}
		
		return new int[] {totalLeftXor ^ arrLeftXor, totalRightXor ^ arrRightXor};
	}

	public static void main(String[] args) {
		
		int arr[] = {1,3,5,6};
		int[] ans = twoMissing(arr); 
		for(int i = 0; i < ans.length; i++){
			System.out.println(ans[i]);
		}
		

	}

}
