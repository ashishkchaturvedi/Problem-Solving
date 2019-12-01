package com.String;

public class StringToInteger {
	
    public static  int myAtoi(String str) {
    	int n = str.length();
        int sign = 0;
        long result = 0;
        int count=0;
        for(int i=0; i<n; i++){
            char c = str.charAt(i);
            if(c==' '&&sign==0) continue;
            if(!Character.isDigit(c)){
                if(c=='-'&&sign==0){
                    sign=-1;
                    continue;
                }else if(c=='+'&&sign==0){
                    sign=1;
                    continue;
                }
                break;
            }else{
                if(sign!=0){
                    int j=c-48;
                    result=result*10+j;
                    if(result!=0)count++;
                }else{
                    sign=1;
                    result=c-48;
                }
            }
            if(count>10) break;
        }
        result*=sign;
        if(result>2147483647){
            return Integer.MAX_VALUE;
        }else if(result<-2147483648){
            return Integer.MIN_VALUE;
        }
        return (int)result;
    }

	public static void main(String[] args) {
		System.out.println(myAtoi("4193 with words"));
		
	}

}
