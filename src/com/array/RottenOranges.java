package com.array;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

	private static final int FRESH = 1;
	private static final int ROTTEN = 2;
	private static final int[][] DIRECTIONS = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
	
	public static void main(String[] args) {
		int a[][] = {{2,1,1},
					 {0,1,1},
					 {1,0,1}};
		int output = rottenOranges(a);
		System.out.println(output);

	}
	
	public static int rottenOranges(int a[][]){
		Queue<int[]> queue = new LinkedList<>();
		if(a == null || a.length == 0 || a[0] == null || a[0].length == 0){
			return -1;
		}
		int minutes = 0, m = a.length, n = a[0].length, freshCount = 0;
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(a[i][j] == ROTTEN){
					queue.offer(new int[] {i, j});
				}
				else if(a[i][j] == FRESH){
					freshCount++;
				}
			}
		}
		
		if(freshCount == 0){
			return 0;
		}
		
		while(!queue.isEmpty()){
			int size = queue.size();
			while(size-- > 0){
				int u[] = queue.poll();
				int i = u[0], j = u[1];
				
				for(int[] dir : DIRECTIONS){
					int x = dir[0] + i, y = dir[1] + j;
					if(x < 0 || y < 0 || x >= m || y >= n || a[x][y] != FRESH){
						continue;
					}
					queue.offer(new int[]{x,y});
					a[x][y] = ROTTEN;
					freshCount--;
				}
			}
			minutes++;
		}
		return freshCount == 0 ? minutes -  1  : -1;
	}
}