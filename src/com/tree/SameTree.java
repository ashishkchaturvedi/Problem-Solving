package com.tree;


public class SameTree {

	public static void main(String[] args) {
		
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);
		
		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(2);
		q.right = new TreeNode(3);
		
		System.out.println(isSameTree(p, q));

	}
	
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // p and q are both null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        if (p.key != q.key) return false;
        return isSameTree(p.right, q.right) &&
                isSameTree(p.left, q.left);
      }
}
