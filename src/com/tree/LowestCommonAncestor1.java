package com.tree;

import java.util.Stack;

public class LowestCommonAncestor1 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		TreeNode result = lowestCommonAncestor(root, root.right, root.left.left);
		System.out.println(result.key);

	}
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(p.equals(q)) return p;
		
		Stack<TreeNode> pathToP = pathTo(root, p);
		Stack<TreeNode> pathToQ = pathTo(root, q);
		
		if(pathToP == null || pathToQ == null) return null;
		
		TreeNode prev = null;
		
		while(!pathToP.isEmpty() && !pathToQ.isEmpty()){
			TreeNode s = pathToP.pop();
			TreeNode t = pathToQ.pop();
			
			if(s.equals(t)){
				prev = s;
			}
			else break;
		}
		return prev;
    }

	private static Stack<TreeNode> pathTo(TreeNode node, TreeNode n) {
		if(node == null) return null;
		if(node.equals(n)){
			Stack<TreeNode> s = new Stack<TreeNode>();
			s.push(n);
			return s;
		}
		
		Stack<TreeNode> left = pathTo(node.left, n);
		Stack<TreeNode> right = pathTo(node.right, n);
		
		if(left != null){
			left.push(node);
			return left;
		}
		
		if(right != null){
			right.push(node);
			return right;
		}
		return null;
	}

}
