package com.String;

public class CountAndSay {

	public static void main(String[] args) {
		
		System.out.println(countAndSay(4));

	}
	
	public static String countAndSay(int n) {
        if(n < 1)
           return "";
       String res = "1";
       
       while(n>1){
           
           StringBuilder cur = new StringBuilder();
           
           for(int i = 0 ; i < res.length() ; ++i){
               
               int count = 1;
               while((i+1) < res.length() && res.charAt(i) == res.charAt(i+1)){
                   count++;
                   ++i;
               }
               cur.append(count).append(res.charAt(i));
               System.out.println(cur);
           }
           res = cur.toString();
           
           
           --n;
       }
       return res;
   }

}
