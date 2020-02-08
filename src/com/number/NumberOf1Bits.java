package com.number;

public class NumberOf1Bits {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(hammingWeight(n));

	}
	
    public static int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            if((n & 1) == 1){
                count ++;
            }
            n = n >>> 1;
        }
        return count;
    }

}
