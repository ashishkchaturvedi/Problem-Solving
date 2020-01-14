package com.number;

import java.util.ArrayList;
import java.util.List;

public class UglyNumber {

	public static void main(String[] args) {
		int num = 30;
		System.out.println(isUgly(num));
	}
	
    public static boolean isUgly(int num) {
    	
    	if(num <= 0) return false;
    	List<Integer> list = new ArrayList<Integer>();
    	
    	while(num %2 == 0){
    		list.add(2);
    		num /= 2;
    	}
    	
    	for(int i = 3; i <= Math.sqrt(num); i += 2){
    		while(num % i == 0){
    			list.add(i);
    			num /= i;
    		}
    	}
    	
    	if(num > 2){
    		list.add(num);
    	}
    	for(int i : list){
    		if(i > 5){
    			return false;
    		}
    	}
    	return  true;
    	
    }

}
