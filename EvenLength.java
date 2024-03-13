package com.Test;


public class EvenLength {
	public static void main(String[] args) {
		int[] array = {6552, 45, 721, 3122};
		int result[] = new int[3];
		int j=0;
		for(int a: array) {
			String s = Integer.toString(a);
			if(s.length()%2==0) {
				result[j] = Integer.valueOf(s);
				j++;
			}
		}
		
		for(int i: result) {
			System.out.println(i);
		}
	}

}
