package com.array;

public class CanPlaceFlowers {
	
	public static boolean canPlaceFlowers(int flowerbed[], int n){
		

        int i = 0, count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            i++;
        }
        return count >= n;
	}
	

	public static void main(String[] args) {
		
		int[] a = {1,0,0,0,1};
		int n = 2;
		System.out.println(canPlaceFlowers(a, n));

	}

}
