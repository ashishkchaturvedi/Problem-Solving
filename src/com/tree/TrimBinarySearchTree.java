package com.tree;

public class TrimBinarySearchTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(0);
		root.right = new TreeNode(4);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(1);
		int L = 1, R = 3;
		TreeNode res = trimBST(root, L, R);
		printInorder(res);
	}
	
	public static TreeNode trimBST(TreeNode root, int L, int R){
		if(root == null) return root;
		if(root.key > R) return trimBST(root.left, L, R);
		if(root.key < L) return trimBST(root.right, L, R);
		
		root.left = trimBST(root.left, L, R);
		root.right = trimBST(root.right, L, R);
		return root;
	}
	
	private static void printInorder(TreeNode root){
		if(root == null) return;
		printInorder(root.left);
		System.out.println(root.key);
		printInorder(root.right);
	}

}
