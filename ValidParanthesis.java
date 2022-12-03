package com.example;

import java.util.Stack;

class Valid {
	public boolean mymethod(String str) {
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c == '[' || c == '{' || c == '(') {
				stack.push(c);
			} else if (!stack.empty() && c == ']' && stack.peek() == '[') {
				stack.pop();
			} else if (!stack.empty() && c == ')' && stack.peek() == '(') {
				stack.pop();
			} else if (!stack.empty() && c == '}' && stack.peek() == '{') {
				stack.pop();
			}

		}
		return stack.isEmpty();
	}
}

public class ValidParanthesis {
	public static void main(String[] args) {
		String str = "[(])";
		Valid obj = new Valid();
		System.out.println(obj.mymethod(str));
	}

}
