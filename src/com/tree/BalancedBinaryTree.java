package com.tree;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(14);
		
		System.out.println(isBalanced(root));

	}
	
    public static boolean isBalanced(TreeNode root) {
    	if(root == null) return true;
    	
    	if(Math.abs(height(root.left) - height(root.right)) > 1) {
    		return false;
    	}
    	else{
    		return isBalanced(root.left) && isBalanced(root.right);
    	}
    }

	private static int height(TreeNode root) {
        if(root == null){
    		return 0;
    	}
    	else{
    		int lHeight = height(root.left);
    		int rHeight = height(root.right);
    		
    		if(lHeight > rHeight){
    			return lHeight + 1;
    		}
    		else{
    			return rHeight + 1;
    		}
    	}

	}

}
