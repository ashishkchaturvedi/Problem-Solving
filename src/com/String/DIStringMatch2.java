package com.String;

public class DIStringMatch2 {

	public static void main(String[] args) {
		
		String S = "IDID";
		int[] res = diStringMatch(S);
		for(int i = 0; i < res.length; i++){
			System.out.println(res[i]);
		}

	}
	
	public static int[] diStringMatch(String S) {
        int N = S.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[N] = lo;
        return ans;
    }

}
