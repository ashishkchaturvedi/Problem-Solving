package com.array;

public class MutatedArray {

	public static void main(String[] args) {
		
//		int[] arr = {4 ,9, 3};
		int arr[] = {2 ,3, 5};
		int target = 10;
//		int arr[] = {60864,25176,27249,21296,20204};
//		int target = 56803;
		
		System.out.println(findBestValue(arr, target));

	}
	
    public static int findBestValue(int[] arr, int target) {
        int average = target / arr.length;
        int sum = 0, count = 0;
        for (int num: arr) {
            if (num <= average) {
                sum += num;
                count += 1;
            }
        }
        if (target - sum == 0) return average;
        double val = (double)(target - sum) / (arr.length - count); 
        double large = Math.ceil(val);
        double small = Math.floor(val);
        if (Math.abs(small - val) == Math.abs(large - val)) return (int)small;
        
        return (int)Math.round(val);
    }

}
