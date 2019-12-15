package com.tree;

public class MaxDepth {

	public static void main(String[] args) {
		
		TreeNode root  = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		System.out.println(maxDepth(root));

	}

    public static int maxDepth(TreeNode root) {
    	if(root == null){
    		return 0;
    	}
    	else{
    		int lHeight = maxDepth(root.left);
    		int rHeight = maxDepth(root.right);
    		
    		if(lHeight > rHeight){
    			return lHeight + 1;
    		}
    		else{
    			return rHeight + 1;
    		}
    	}
    }

}
