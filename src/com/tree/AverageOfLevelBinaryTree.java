package com.tree;

import java.util.ArrayList;
import java.util.List;

public class AverageOfLevelBinaryTree {

	public static void main(String[] args) {
		
		
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(averageOfLevels(root));

	}
	
	public static List<Double> averageOfLevels(TreeNode root) {
		List < Integer > count = new ArrayList < > ();
        List < Double > res = new ArrayList < > ();
        average(root, 0, res, count);
        for (int i = 0; i < res.size(); i++)
            res.set(i, res.get(i) / count.get(i));
        return res;
    }

	private static void average(TreeNode root, int i, List<Double> res, List<Integer> count) {
		if (root == null)
            return;
        if (i < res.size()) {
            res.set(i, res.get(i) + root.key);
            count.set(i, count.get(i) + 1);
        } else {
            res.add(1.0 * root.key);
            count.add(1);
        }
        average(root.left, i + 1, res, count);
        average(root.right, i + 1, res, count);
		
	}


}
