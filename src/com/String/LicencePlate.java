package com.String;

public class LicencePlate {
	
	public static  String licenseKeyFormatting(String S, int K) {
		int count=0;
		StringBuilder sb = new StringBuilder("");
		char[] arrs = S.toCharArray();
		for(int i=arrs.length-1;i>=0;i--){
			if(arrs[i]!='-'){
				if(count==K){
					count=0;
					sb.append('-');
				}	
				if(arrs[i]>='a' && arrs[i]<='z'){
					arrs[i] -= 32;
				}
				count++;
				sb.append(arrs[i]);
			}
		}
		return sb.reverse().toString();
    }

	public static void main(String[] args) {
		
		System.out.println(licenseKeyFormatting("---", 3));
	}

}
