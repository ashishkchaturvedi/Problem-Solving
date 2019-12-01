package com.array;

public class MaximalSquareDynamic {
	
	public static int maximalSquare(char[][] matrix){
		if(matrix.length == 0) return 0;
		if(matrix[0].length == 0) return 0;
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		int maxSq = 0;
		int dp[][] = new int[rows+1][cols+1];
		
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= cols; j++){
				if(matrix[i-1][j-1] == '1'){
					dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]) + 1;
					maxSq = Math.max(dp[i][j], maxSq);
				}
			}
		}
		return maxSq * maxSq;
	}

	public static void main(String[] args) {
		
		char[][] matrix = {{'1','0','1','0','0'},
				{'1','0','1','1','1'},
				{'1','1','1','1','1'},
				{'1','0','0','1','0'},};

		System.out.println(maximalSquare(matrix));

	}

}
