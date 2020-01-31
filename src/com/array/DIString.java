package com.array;

public class DIString {

	public static void main(String[] args) {
		String S = "DDI";
		int[] res = diStringMatch(S);
		for(int i = 0; i < res.length; i++){
			System.out.println(res[i]);
		}

	}
	
    public static int[] diStringMatch(String S) {
    	
    	int n = S.length();
    	int ans[] = new int[n + 1];
    	int countI = 0;
    	int countD = n;
    	for(int i = 0; i < n; i++){
    		if(S.charAt(i) == 'I'){
    			ans[i] = countI++;
    		}
    		else{
    			ans[i] = countD--;
    		}
    	}
    	ans[n] = countI++;
    	return ans;
    }

}
