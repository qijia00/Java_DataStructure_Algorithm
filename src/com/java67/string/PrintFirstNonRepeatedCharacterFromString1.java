package com.java67.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintFirstNonRepeatedCharacterFromString1 {
	public static void main(String[] args) {
		printFirstNonRepeatedCharacter("");
		printFirstNonRepeatedCharacter(null);
		printFirstNonRepeatedCharacter("abc");
		printFirstNonRepeatedCharacter("PrintFirstNonRepeatedCharacter");
		printFirstNonRepeatedCharacter("9999999998888888877777776666665555544443332210");
		printFirstNonRepeatedCharacter("zzz");
	}
	
	//this solution uses String method toLowerCase, toCharArray, length, entrySet; LinkedHashMap method containsKey(key), get(key), put(key, value); 
	//and Map Entry method getValue, getKey.
	public static void printFirstNonRepeatedCharacter(String s) {
		System.out.print("The first non repeated charater from String \"" + s + "\" is: ");
		if (s == "" | s == null) {
			System.out.println("empty or null strings are not allowed!");
			System.out.println();
		}else {
			s = s.toLowerCase();
			char[] sArray = s.toCharArray();
			Map<Character, Integer> map = new LinkedHashMap<>(s.length()); //when define HashMap does NOT need to specify length
			for (char c : sArray) {		
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				}else {
					map.put(c, 1);
				}
			}
			boolean found = false;
			//LinkedHashMap maintains insertion order
			for (Map.Entry<Character, Integer> entry : map.entrySet()){
				if (entry.getValue() == 1) {
					System.out.println(entry.getKey());
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
