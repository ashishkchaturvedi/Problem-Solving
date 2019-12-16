package com.tree;

public class ArrayToBST {
	
	static int[] nums;

	public static void main(String[] args) {
		int[] n = {-10, -3, 0, 5, 9};
		
		TreeNode res = sortedArrayToBST(n);
		
		printInorder(res);

	}
	
    private static void printInorder(TreeNode res) {
		if(res == null) return;
		printInorder(res.left);
		System.out.println(res.key);
		printInorder(res.right);
		
	}

	public static TreeNode sortedArrayToBST(int[] nums) {
    	ArrayToBST.nums = nums;
        return helper(0, nums.length - 1);
    }
    
    private static TreeNode helper(int left, int right){
    	if(left > right) return null;
    	
    	int p = (left + right) / 2;
    	
    	TreeNode root = new TreeNode(nums[p]);
    	root.left = helper(left, p-1);
    	root.right = helper(p+1, right);
    	
    	return root;
    }

}
