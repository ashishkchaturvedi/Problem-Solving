package com.tree;

public class DiamaterOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left= new TreeNode(1);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(6);
		System.out.println(diameterOfBinaryTree(root));

	}
	
	static int ans;
	
	public static int diameterOfBinaryTree(TreeNode root){
		ans = 0;
		height(root);
		return ans;
	}

	private static int height(TreeNode root) {
		if(root == null) return 0;
		int l = height(root.left);
		int r = height(root.right);
		ans = Math.max(ans, l+r);
		if(l >= r) return l+1;
		return r+1;
		
	}

}
