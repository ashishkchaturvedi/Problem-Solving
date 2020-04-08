package com.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BinaryTreeRightSideView {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		root.right.right.left = new TreeNode(8);
		root.left.left.right = new TreeNode(7);
		root.left.left.right.right = new TreeNode(9);
		root.left.left.right.right.right = new TreeNode(10);
		System.out.println(rightSideView(root));

	}
	
	public static List<Integer> rightSideView(TreeNode root){
		Map<Integer, Integer> rightmostValueAtDepth = new HashMap<>();
		int max_depth = -1;
		
		Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
		Queue<Integer> depthQueue = new LinkedList<Integer>();
		nodeQueue.add(root);
		depthQueue.add(0);
		
		while(!nodeQueue.isEmpty()){
			
			TreeNode node = nodeQueue.remove();
			int depth = depthQueue.remove();
			
			if(node != null){
				max_depth = Math.max(max_depth, depth);
				rightmostValueAtDepth.put(depth, node.key);
				
				nodeQueue.add(node.left);
				nodeQueue.add(node.right);
				depthQueue.add(depth + 1);
				depthQueue.add(depth + 1);
			}
		}
		
		List<Integer> rightView = new ArrayList<Integer>();
		for(int depth = 0; depth <= max_depth; depth++){
			rightView.add(rightmostValueAtDepth.get(depth));
		}
		return rightView;
	}

}
