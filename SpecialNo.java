package com.example;

public class SpecialNo {
	public static void main(String[] args) {
		int num=29,sum=0,mul=1;
		
		for(char c:Integer.toString(num).toCharArray()) {
			int a = c-'0';
			mul*=a;
			sum+=a;
		}
		System.out.println((sum+mul)==num);
	}

}
