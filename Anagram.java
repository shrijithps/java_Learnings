package com.example;

class anag{
	public boolean mymethod(String str1,String str2) {
		int i=0;
		if(str1.length()!=str2.length()) return false;
		while(i<str1.length()&& str1.charAt(i)==str2.charAt(i)) 
			i++;
		return i==str1.length();
	}
}
public class Anagram {
	public static void main(String[] args) {
		String str="abc";
		String str2="abc";
		anag obj = new anag();
		System.out.println(obj.mymethod(str, str2));
	}

}
