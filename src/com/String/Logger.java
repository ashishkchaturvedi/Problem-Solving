package com.String;

import java.util.HashMap;
import java.util.Map;

public class Logger {
	Map<String, Integer> map;
	
	Logger(){
		map = new HashMap<>();
	}

	
    public boolean shouldPrintMessage(int timestamp, String message) {
    	

        if(!map.containsKey(message)){
        	map.put(message, timestamp);
        }else{
        	int accessTime = map.get(message);
        	if((timestamp - accessTime) < 10){
        		return false;
        	}else{
        		map.put(message, timestamp);
        	}
        }
        return true;
    }

	public static void main(String[] args) {
		Logger l = new Logger();
		System.out.println((l.shouldPrintMessage(1,"foo")) ? "True" : "false");
		System.out.println((l.shouldPrintMessage(2,"bar")) ? "True" : "false");
		System.out.println((l.shouldPrintMessage(3,"foo")) ? "True" : "false");
		System.out.println((l.shouldPrintMessage(8,"bar")) ? "True" : "false");
		System.out.println((l.shouldPrintMessage(10,"foo")) ? "True" : "false");
		System.out.println((l.shouldPrintMessage(11,"foo")) ? "True" : "false");

	}

}
