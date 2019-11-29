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
				if(stats[s]++ < 0) b++;
				if(stats[g]-- > 0) b++;
			}
		}
		return a+"A"+b+"B";
	}
	public static void main(String[] args) {
		System.out.println(getHint("1123", "0111"));

	}

}
