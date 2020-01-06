package com.tree;

public class MinimumDepth {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(minDepth(root));

	}
	
    public static int minDepth(TreeNode root) {
        
    	if(root == null) return 0;
    	
    	if(root.left == null && root.right == null) return 1;
    	
    	int min_depth = Integer.MAX_VALUE;
    	
    	if(root.left != null){
    		min_depth = Math.min(minDepth(root.left), min_depth);
    	}
    	if(root.right != null){
    		min_depth = Math.min(minDepth(root.right), min_depth);
    	}
    	return min_depth + 1;
    }


}
