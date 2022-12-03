package com.example;

class Ugly {
	
	public boolean mymethod(int num) {
		while (num%2==0)
		 num/=2;
		while (num%3==0)
			 num/=3;
		while (num%5==0)
			 num/=5;
		return num==1;
		
	}
}

public class UglyNumber {
	public static void main(String[] args) {
		int num=13;
		Ugly obj = new Ugly();
		System.out.println(obj.mymethod(num));
	}
	}
