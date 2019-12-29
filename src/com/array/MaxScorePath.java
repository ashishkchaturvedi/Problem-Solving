package com.array;

import java.util.ArrayList;
import java.util.List;

public class MaxScorePath {

	public static void main(String[] args) {
		
		List<String> board = new ArrayList<>();
		board.add("E23");
		board.add("2X2");
		board.add("12S");
		
		int[] res = pathsWithMaxScore(board);
		for(int i = 0; i < res.length; i++){
			System.out.println(res[i]);
		}

	}
	
	private static final int[][] DIRS = new int[][]{{0, -1}, {-1, 0}, {-1, -1}};
    public static int[] pathsWithMaxScore(List<String> board) {
        int m = board.size(), n = board.get(0).length();
        int[][] dpSum = new int[m][n];
        int[][] dpCnt = new int[m][n];
        dpCnt[m - 1][n - 1] = 1; // start at the bottom right square
        for (int r = m - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                if (dpCnt[r][c] == 0) continue; // can't reach to this square
                for (int[] dir : DIRS) {
                    int nr = r + dir[0], nc = c + dir[1];
                    if (nr >= 0 && nc >= 0 && board.get(nr).charAt(nc) != 'X') {
                        int nsum = dpSum[r][c];
                        if (board.get(nr).charAt(nc) != 'E')
                            nsum += board.get(nr).charAt(nc) - '0';
                        if (nsum > dpSum[nr][nc]) {
                            dpCnt[nr][nc] = dpCnt[r][c];
                            dpSum[nr][nc] = nsum;
                        } else if (nsum == dpSum[nr][nc]) {
                            dpCnt[nr][nc] = (dpCnt[nr][nc] + dpCnt[r][c]) % 1000000007;
                        }
                    }
                }
            }
        }
        return new int[]{dpSum[0][0], dpCnt[0][0]};
    }

}
