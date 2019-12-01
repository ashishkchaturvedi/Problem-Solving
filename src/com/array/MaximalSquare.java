package com.array;

public class MaximalSquare {
	
    public static int maximalSquare(char[][] matrix) {
    	
    	if(matrix.length == 0) return 0;
    	if(matrix[0].length == 0) return 0;
    	
    	int rows = matrix.length;
    	int cols = matrix[0].length;
    	boolean flag = false;
    	int sqlen = 0;
    	int maxSqlen = 0;
    	
    	for(int i = 0; i < rows; i++){
    		for(int j = 0;j < cols; j++){
    			if(matrix[i][j] == '1'){
    				flag = true;
    				sqlen = 1;
    				
    				while(sqlen + i <rows && sqlen+j < cols && flag){
    					for(int k = j; k <= sqlen + j; k++){
    						if(matrix[i + sqlen][k] == '0'){
    							flag = false;
    							break;
    						}
    					}
    					
    					for(int k = i; k <= sqlen + i; k++){
    						if(matrix[k][j + sqlen] == '0'){
    							flag = false;
    							break;
    						}
    					}
    					
    					if(flag) sqlen++;
    				}
    				if(maxSqlen < sqlen){
    					maxSqlen = sqlen;
    				}
    			}
    		}
    	}
    	return maxSqlen * maxSqlen;
    }

	public static void main(String[] args) {
		char[][] matrix = {{'1','0','1','0','0'},
							{'1','0','1','1','1'},
							{'1','1','1','1','1'},
							{'1','0','0','1','0'},};
		
		System.out.println(maximalSquare(matrix));

	}

}
