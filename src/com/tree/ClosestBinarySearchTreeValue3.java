package com.tree;

import java.util.LinkedList;

public class ClosestBinarySearchTreeValue3 {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		double target = 3.714286;
		
		System.out.println(closestValue(root, target));

	}
	
	public static int closestValue(TreeNode root, double target){
		long pred = Long.MIN_VALUE;
		LinkedList<TreeNode> stack = new LinkedList<>();
		
		while(!stack.isEmpty() || root != null){
			while(root != null){
				stack.add(root);
				root = root.left;
			}
			
			root = stack.removeLast();
			
			if(pred <= target && root.key > target){
				return Math.abs(pred - target) < Math.abs(root.key - target) ? (int) pred : root.key;
			}
			pred = root.key;
			root = root.right;
		}
		
		return (int) pred;
	}
	
	

}
