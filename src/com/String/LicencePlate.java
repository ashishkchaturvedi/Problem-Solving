package com.String;

public class LicencePlate {
	
	public static  String licenseKeyFormatting(String S, int K) {
		boolean firstDash = false;
		int i = 0;
		StringBuilder str = new StringBuilder();
		
		while(i < S.length()){
			//char ch = S.charAt(i);
			if(!firstDash){
				System.out.println(S.charAt(i));
				if(S.charAt(i) == '-'){
					firstDash = true;
				}
				str.append(S.charAt(i));
				i++;
			}
			else{
				int j = 0;
				while(j < K){
					//System.out.println(S.charAt(i+j));
					if(S.charAt(i+j) == '-'){
						i++;
					}
					else{
						System.out.println("In else block");
						System.out.println(S.charAt(i+j));
						str.append(S.charAt(i+j));
						j++;
					}
				}				
				i = i + j;
				str.append("-");
			}
		}
		String result = str.toString();
		return result.substring(0, result.length() - 1).toUpperCase();
    }

	public static void main(String[] args) {
		
		System.out.println(licenseKeyFormatting("5f3z-2e-9-w", 4));
	}

}
