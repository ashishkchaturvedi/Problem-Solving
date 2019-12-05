package com.tree;

import java.util.Stack;

class TreeNode{
	int key;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int k){
		this.key = k;
		this.left = null;
		this.right = null;
	}
}


public class LowestCommonAncestor {
	static TreeNode root;
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.equals(q)) return p;
        
        Stack<TreeNode> pathToP = pathTo(root, p);
        Stack<TreeNode> pathToQ = pathTo(root, q);
        
        if (pathToP == null || pathToQ == null) return null;
        
        TreeNode prev = null;
        while(!pathToP.isEmpty() && !pathToQ.isEmpty()){
        	TreeNode s = pathToP.pop();
        	TreeNode t = pathToQ.pop();
        	if(s.equals(t)) prev = s;
        	else break;
        }
        return prev;
    }
	

	public static Stack<TreeNode> pathTo(TreeNode tree, TreeNode n){
		if(tree == null) return null;
		if(tree.equals(n)){
			Stack<TreeNode> s = new Stack<>();
			s.push(tree);
			return s;
		}
		
		Stack<TreeNode> left = pathTo(tree.left, n);
		Stack<TreeNode> right = pathTo(tree.right, n);
		
		if(left != null){
			left.push(tree);
			return left;
		}
		
		if(right != null){
			right.push(tree);
			return right;
		}
		
		return null;		
	}
	public static void main(String[] args) {
		
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		TreeNode result = lowestCommonAncestor(root, root.right, root.left.left);
		System.out.println(result.key);
		
	}

}
