package com.learnings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SecondNonRepeating {
	public static void main(String[] args) {

		String str = "example";
		Character secondNonRepeating = '/';
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (Character c : str.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}

		Set<Character> keys = map.keySet();
		for (Character key : keys) {
			if (map.get(key) == 1) {
				secondNonRepeating = key;
				break;
			}
		}

		Set<Character> keys1 = map.keySet();
		for (Character key : keys1) {
			if (map.get(key) == 1) {
				if (key != secondNonRepeating) {
					secondNonRepeating = key;
					break;
				}

			}

		}
		System.out.println("Second Non Repeating Character " + secondNonRepeating);

	}
}
