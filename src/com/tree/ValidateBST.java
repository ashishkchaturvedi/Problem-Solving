package com.tree;

public class ValidateBST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(20);
		root.right.right.left = new TreeNode(11);
		root.right.right.right = new TreeNode(22);
		System.out.println(isValidBST(root));

	}
	
	public static boolean isValidBST(TreeNode root){
		return helper(root, null, null);
	}

	private static boolean helper(TreeNode root, Integer lower, Integer upper) {
		
		if(root == null) return true;
		int val = root.key;
		
		if(lower != null && root.key <= lower) return false;
		if(upper != null && root.key >= upper) return false;
		
		if(!(helper(root.left, lower, val))) return false;
		if(!(helper(root.right, val, upper))) return false;
		return true;
	}

}
