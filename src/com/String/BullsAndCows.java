package com.String;

public class BullsAndCows {

	public static String getHint(String secret, String guess){
		int stats[] = new int[10];
		int a = 0, b = 0;
		for(int i = 0; i < secret.length(); i++){
			int s = secret.charAt(i) - '0';
			int g = guess.charAt(i) - '0';
			if(s == g){
				a++;
			}
			else{
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("Start reading for s:"+s+" and g:"+g );
				System.out.println(stats[s]);
				if(stats[s]++ < 0) b++;
				System.out.println(stats[s]);
				System.out.println("b after secret is: "+b);
				System.out.println("==============================================");
				System.out.println(stats[g]);
				if(stats[g]-- > 0) b++;
				System.out.println(stats[g]);
				System.out.println("b after guess is: "+b);
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
				
			}
		}
		return a+"A"+b+"B";
	}
	public static void main(String[] args) {
		System.out.println(getHint("1807", "7810"));

	}

}
