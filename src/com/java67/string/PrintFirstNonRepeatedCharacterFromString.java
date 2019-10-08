package com.java67.string;

import java.util.HashMap;
import java.util.Map;

public class PrintFirstNonRepeatedCharacterFromString {
	public static void main(String[] args) {
		printFirstNonRepeatedCharacter("");
		printFirstNonRepeatedCharacter(null);
		printFirstNonRepeatedCharacter("abc");
		printFirstNonRepeatedCharacter("PrintFirstNonRepeatedCharacter");
		printFirstNonRepeatedCharacter("9999999998888888877777776666665555544443332210");
		printFirstNonRepeatedCharacter("zzz");
	}
	
	public static void printFirstNonRepeatedCharacter(String s) {
		System.out.print("The first non repeated charater from String \"" + s + "\" is: ");
		if (s == "" | s == null) {
			System.out.println("empty or null strings are not allowed!");
			System.out.println();
		}else {
			s = s.toLowerCase();
			char[] sArray = s.toCharArray();
			Map<Character, Integer> map = new HashMap<>();
			for (char c : sArray) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				}else {
					map.put(c, 1);
				}
			}
			boolean found = false;
			for (char c : sArray) {
				if (map.get(c) == 1) {
					System.out.println(c);
					System.out.println();
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("no non repeated charater was found!");
			}
		}
	}
}
