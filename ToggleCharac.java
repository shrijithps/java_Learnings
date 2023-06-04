package com.mavenPractice;

public class ToggleCharac {
	public static void main(String[] args) {
		String sample = "ApPLe";
		String str = "";
		
		char[] charArray = sample.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			 if(Integer.valueOf(charArray[i]) >= 97) {
				 str += (char)(charArray[i] - 32);
			 }
			 else {
				 str += (char)(charArray[i] + 32);
			 }
		}
		System.out.println(str);
	}

}
