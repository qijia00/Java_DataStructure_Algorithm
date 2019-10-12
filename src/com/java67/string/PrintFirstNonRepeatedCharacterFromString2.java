package com.java67.string;

import java.util.HashMap;
import java.util.Map;

public class PrintFirstNonRepeatedCharacterFromString2 {
	public static void main(String[] args) {
		printFirstNonRepeatedCharacter("");
		printFirstNonRepeatedCharacter(null);
		printFirstNonRepeatedCharacter("abc");
		printFirstNonRepeatedCharacter("PrintFirstNonRepeatedCharacter");
		printFirstNonRepeatedCharacter("9999999998888888877777776666665555544443332210");
		printFirstNonRepeatedCharacter("zzz");
	}
	
	//this solution uses String method toLowerCase, toCharArray; HashMap method containsKey(key), get(key), put(key, value).
	public static void printFirstNonRepeatedCharacter(String s) {
		System.out.print("The first non repeated charater from String \"" + s + "\" is: ");
		if(s == null) {
			System.out.println("null strings are not allowed!");
			System.out.println(); 
		}else if (s.trim().equals("")) { //s.trim() == "" won't work
			System.out.println("empty strings are not allowed!");
			System.out.println();
		}else {
			s = s.toLowerCase();
			char[] sArray = s.toCharArray();
			Map<Character, Integer> map = new HashMap<>();
			for (char c : sArray) {
				map.put(c, map.containsKey(c)?map.get(c)+1:1);
			}
			boolean found = false;
			// since HashMap doesn't maintain order, going through charArray or string again
			for (char c : sArray) {
				if (map.get(c) == 1) {
					System.out.println(c);
					System.out.println();
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("no non repeated character was found!");
			}
		}
	}
}
