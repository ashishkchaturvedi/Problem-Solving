package com.array;

import java.util.Arrays;

public class KClosestPointstoOrigin {

	public static void main(String[] args) {
		int[][] points = {{3,3},{5,-1},{-2,4}};
		int K = 2;
		int[][] result = kClosest(points, K);
		System.out.println(Arrays.deepToString(result));
	}
	
	public static int[][] kClosest(int[][] points, int K){
		
		int N = points.length;
		int[] dists = new int[N];
		for(int i = 0; i < N; i++){
			dists[i] = dist(points[i]);
		}
		
		Arrays.sort(dists);
		int distK = dists[K-1];
		
		int t = 0;
		int[][] ans = new int[K][2];
		for(int i = 0; i < N; i++){
			if(dist(points[i]) <= distK){
				ans[t++] = points[i];
			}
		}
		return ans;
	}

	private static int dist(int[] point) {
		return point[0] * point[0] + point[1] * point[1];
	}

}
