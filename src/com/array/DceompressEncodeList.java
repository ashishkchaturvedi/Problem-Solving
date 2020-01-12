package com.array;

public class DceompressEncodeList {

	public static void main(String[] args) {
		
		int[] nums = {42, 39};
		int[]  ans = decompressRLElist(nums);
		for(int i = 0; i < ans.length; i++){
			System.out.println(ans[i]);
			//System.out.println();
		}
	}
	
    public static int[] decompressRLElist(int[] nums) {
        int n = nums.length, i = 0, j = 0,pointer = -1, count = 0;
        for(int k = 0; k < n; k += 2) count += nums[k];
        int ans[] = new int[count];
        while(i < n-1){
        	j = i + 1;
        	//System.out.println(j);
        	int temp = nums[i];
        	while(temp > 0){
        		ans[++pointer] = nums[j];
        		temp--;
        	}
        	i += 2;
        }
       // System.out.println(ans.length);
        return ans;
    }

}
