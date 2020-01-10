package com.tree;

public class PathSum3 {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(-3);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(2);
		root.left.left.left = new TreeNode(3);
		root.left.left.right = new TreeNode(-2);
		root.right.right = new TreeNode(11);
		int sum = 8;
		System.out.println(pathSum(root, sum));

	}
	
    public static int pathSum(TreeNode root, int sum) {
    	if(root == null) return 0;
    	return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

	private static int pathSumFrom(TreeNode root, int sum) {
		if(root == null) return 0;
		return (root.key == sum ? 1 : 0) + pathSumFrom(root.left, sum - root.key) + pathSumFrom(root.right, sum - root.key);
	}

}
