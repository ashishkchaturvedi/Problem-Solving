package com.tree;

//class TreeNode{
//	int key;
//	TreeNode left;
//	TreeNode right;
//	
//	public TreeNode(int k){
//		this.key = k;
//		this.left = null;
//		this.right = null;
//	}
//}

public class DeepestLeavesSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.left.left = new TreeNode(4);
		root.left.left.left = new TreeNode(7);
		root.right.right = new TreeNode(6);
		root.right.right.right = new TreeNode(8);
		System.out.println(deepestLeavesSum(root));
	}
	
    public static int deepestLeavesSum(TreeNode root) {
        int h = height(root);
        return sumAtLevel(root, 1, h);
    }
    
    public static  int sumAtLevel(TreeNode root, int currHeight, int targetHeight){
    	if(currHeight == targetHeight && root != null) return root.key;
    	
    	else if(root == null) return 0;
    	
    	int sumL = sumAtLevel(root.left, currHeight + 1, targetHeight);
    	int sumR = sumAtLevel(root.right, currHeight + 1, targetHeight);
    	return sumL + sumR;
    }
    
    public static int height(TreeNode root){
    	if(root == null)return 0;
    	
    	int lHeight = height(root.left);
    	int rHeight = height(root.right);
    	
    	if(lHeight >= rHeight) {
    		return lHeight + 1;
    	}
    	else {
    		return rHeight + 1;
    	}
    }

}
