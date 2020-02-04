package com.tree;

public class BSTToGreaterTree {
	private static int sum = 0;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(2);
		root.right = new TreeNode(13);
		TreeNode res = convertBST(root);
		printInorder(res);

	}
	
	public static TreeNode convertBST(TreeNode root){
		if(root != null){
			convertBST(root.right);
			sum += root.key;
			root.key = sum;
			convertBST(root.left);
		}
		return root;
	}
	
	public static void printInorder(TreeNode root){
		if(root == null) return;
		printInorder(root.left);
		System.out.println(root.key);
		printInorder(root.right);
	}

}
