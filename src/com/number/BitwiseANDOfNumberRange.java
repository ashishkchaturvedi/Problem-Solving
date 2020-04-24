package com.number;

public class BitwiseANDOfNumberRange {

	public static void main(String[] args) {
		int m = 5;
		int n = 7;
		System.out.println(rangeBitwiseAnd(m, n));

	}
	
	public static int rangeBitwiseAnd(int m, int n){
		int shift = 0;
		while(m < n){
			m >>= 1;
			n >>= 1;
			++shift;
		}
		return m << shift;
	}

}
