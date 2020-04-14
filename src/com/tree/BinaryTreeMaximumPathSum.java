package com.tree;

public class BinaryTreeMaximumPathSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(-10);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(maxPathSum(root));

	}
	
	static int max_sum = Integer.MIN_VALUE;
	
	public static int maxPathSum(TreeNode root){
		max_gain(root);
		return max_sum;
	}

	private static  int max_gain(TreeNode node ) {
		if(node == null) return 0;
		
		int left_gain = Math.max(max_gain(node.left), 0);
		int right_gain = Math.max(max_gain(node.right), 0);
		
		int price_newpath = node.key + left_gain + right_gain;
		max_sum = Math.max(max_sum, price_newpath);
		
		return node.key + Math.max(left_gain, right_gain);
	}

}
