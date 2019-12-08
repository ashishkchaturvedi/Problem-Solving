package com.array;

public class PaintHouse {
	
    public static int minCost(int[][] costs) {
        if(costs==null || costs.length==0) return 0;
        for(int i=1;i<costs.length;i++){
            costs[i][0] += Math.min(costs[i-1][1],costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0],costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][0],costs[i-1][1]);
        }
        int len = costs.length-1;
        return Math.min(costs[len][0],Math.min(costs[len][1],costs[len][2]));
    }

	public static void main(String[] args) {
		int[][] costs = {{3, 5, 3},
						{6, 17, 6},
						{7, 13, 18},
						{9, 10, 18}};
		System.out.println(minCost(costs));

	}

	
}
