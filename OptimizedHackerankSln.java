package com.test;

public class OptimizedHackerankSln {
	public static void main(String[] args) {
		String testS = "Hel3o World";
		char count = 'a';
		String f = "";
		String r = "";
		for (int i = 0; i < testS.length(); i++) {
			if (testS.charAt(i) - '0' >= 1 && testS.charAt(i) - '0' <= 9) {
				count = testS.charAt(i);
			}
		}

		int index = testS.indexOf(count);
		char c = testS.charAt(index - 1);
		for (int i = 1; i < count - '0'; i++) {
			f += c;
		}
		r += testS.substring(0, index) + f + testS.substring(index + 1, testS.length());
		System.out.println(r);
	}
}