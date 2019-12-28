package com.array;

public class ReplaceElements {

	public static void main(String[] args) {
		
		int[] arr = {17,18,5,4,6,1};
		
		int[] res = replaceElements(arr);
		for(int i = 0; i < res.length; i++){
			System.out.println(res[i]);
		}

	}
	
	public static int[] replaceElements(int[] arr) {
        if(arr.length == 0) {
            return arr;
        }
       
        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;
        
        for(int i=arr.length-2; i >= 0; i--) {
            int curr = arr[i];
            arr[i] = max;
            if(curr > max) {
                max = curr;
            }
        }
        
        return arr;
    }

}
