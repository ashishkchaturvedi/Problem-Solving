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

	private static void average(TreeNode t, int i, List<Double> sum, List<Integer> count) {
		if (t == null)
            return;
        if (i < sum.size()) {
            sum.set(i, sum.get(i) + t.key);
            count.set(i, count.get(i) + 1);
        } else {
            sum.add(1.0 * t.key);
            count.add(1);
        }
        average(t.left, i + 1, sum, count);
        average(t.right, i + 1, sum, count);
		
	}


}
