package com.String;

public class IsomorphicString {
	
	public static boolean isIsomorphic(String s, String t){
		if(s.length() != t.length()) return false;
		int map1[] = new int[256];
		int map2[] = new int[256];
		for(int i = 0; i < s.length(); i++){
			char s1 = s.charAt(i);
			System.out.println(s1);
			char t1 = t.charAt(i);
			System.out.println(t1);
			System.out.println("map1[s1]:"+ map1[s1]);
			System.out.println("map2[t1]:"+ map2[t1]);
			
			if(map1[s1] != map2[t1]) return false;
			

			map1[s1] = map2[t1] = i+1;
			System.out.println("map1[s1]:"+ map1[s1]);
			System.out.println("map2[t1]:"+ map2[t1]);
			
			
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add")?"True" : "False");

	}

}
