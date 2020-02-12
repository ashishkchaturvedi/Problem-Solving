package com.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepaeatedDNASequence {

	public static void main(String[] args) {
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		System.out.println(findRepeatedDnaSequences(s));

	}
	
	 public static List<String> findRepeatedDnaSequences(String s){
		 Set<String> seen = new HashSet<>(), repeated = new HashSet<>();
		 for(int i = 0; i < s.length() - 9; i++){
			 String seq = s.substring(i, i+10);
			 if(!seen.add(seq)){
				 repeated.add(seq);
			 }
		 }
		 return new ArrayList<String>(repeated);
	 }

}
