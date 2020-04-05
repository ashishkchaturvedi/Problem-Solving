package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ClosestBinarySearchTreeValue2 {

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
		
		Queue<TreeNode> nodes = new LinkedList<>();
		double min = Double.MAX_VALUE;
		int res = 0;
		nodes.add(root);
		
		while(!nodes.isEmpty()){
			TreeNode node = nodes.remove();
			double val = (double) node.key;
			double diff = Math.abs(target - val);
			if(diff < min){
				min = diff;
				res = node.key;
			}
			
			if(node.left != null) nodes.add(node.left);
			if(node.right != null) nodes.add(node.right);
		}
		return res;
	}

}
