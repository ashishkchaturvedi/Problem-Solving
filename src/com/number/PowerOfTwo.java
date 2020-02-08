package com.number;

public class PowerOfTwo {

	public static void main(String[] args) {
		int n = 16;
		System.out.println(isPowerOfTwo(n));

	}
	
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        while(n > 1){
            int rem = n % 2;
            n /= 2;
            if(rem != 0){
                return false;
            }
        }
        return true;
    }

}
