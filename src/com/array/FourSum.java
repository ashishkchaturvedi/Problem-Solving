package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		int nums[] = {1, 0, -1, 0, -2, 2};
		int target = 0;
		List<List<Integer>> res = fourSum(nums, target);
		System.out.println(res);

	}
	
    public static List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> output = new ArrayList<>();
        HashSet<String> keys = new HashSet<>();
        if (nums == null || nums.length < 4) return output;
        Arrays.sort(nums);
        int l1 = 0, l2=0;
        int h1 = nums.length-1, h2=h1;
        for (; l1<h1-1; l1++){
            for (; h1 > l1+1; h1--){
                if (l1 < h1-1) l2 = l1+1;
                else break;
                if (h1 > l1+1) h2 = h1-1;
                else break;
                while (l2 < h2){
                    int sum = nums[l1] + nums[l2] + nums[h2] + nums[h1];
                    if (sum < target)
                        l2++;
                    else if (sum > target)
                        h2--;
                    else {
                        String key = ""+ nums[l1] + nums[l2] + nums[h2] + nums[h1];
                        if (!keys.contains(key)){
                            output.add(Arrays.asList(new Integer[]{nums[l1], nums[l2], nums[h2], nums[h1]}));
                            keys.add(key);
                        }
                        l2++;
                    }
                }
            }
            h1 = nums.length-1;
        }
        return  output;
    }

}
