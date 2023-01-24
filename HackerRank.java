package com.test;

class A {
	public String test(String s) {
		char[] c = s.toCharArray();
		String r = "";
		int count = -1;
		for (int i = 0; i < c.length-1; i++) {
			if ((c[i] - '0' >= 1) && (c[i] - '0' <= 9)) {
				count++;
			} else if ((Character.isLowerCase(c[i]) && Character.isUpperCase(c[i + 1]))
					|| (Character.isLowerCase(c[i]) && Character.isDigit(c[i + 1]))) {
				r += c[i];
			} else if (c[i] == '0') {
				r += c[count];
				count--;
				
			} else if (Character.isAlphabetic(c[i]) && Character.isUpperCase(c[i]) && Character.isAlphabetic(c[i + 1])
					&& Character.isLowerCase(c[i + 1])) {
				r += c[i + 1];
				r += c[i];
			} 

		}
		return r+c[c.length-1];
	}
}

public class HackerRank {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.test("51Pa*0Lp*0e"));
	}
}
