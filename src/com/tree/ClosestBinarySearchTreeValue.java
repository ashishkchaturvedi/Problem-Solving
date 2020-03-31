package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ClosestBinarySearchTreeValue {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		double target = 3.714286;
		System.out.println(closestValue(root, target));

	}
	
	public static int closestValue(TreeNode root, double target) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int num = 0;
        double min = Double.MAX_VALUE;
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
            double s = (double)node.key;
            if(Math.abs(s - target) < min) {
                min = Math.abs(s - target);
                num = (int)s;
            }
        }
        return num;
    }

}
