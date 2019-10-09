package com.java67.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintFirstNonRepeatedCharacterFromString3 {
	public static void main(String[] args) {
		printFirstNonRepeatedCharacter("");
		printFirstNonRepeatedCharacter(null);
		printFirstNonRepeatedCharacter("abc");
		printFirstNonRepeatedCharacter("PrintFirstNonRepeatedCharacter");
		printFirstNonRepeatedCharacter("9999999998888888877777776666665555544443332210");
		printFirstNonRepeatedCharacter("zzz");
	}
	
	//this solution uses String method toLowerCase, toCharArray; HashSet method add; and ArrayList method remove, add, size, get(index).
	public static void printFirstNonRepeatedCharacter(String s) {
		System.out.print("The first non repeated charater from String \"" + s + "\" is: ");
		if (s == "" | s == null) {
			System.out.println("empty or null strings are not allowed!");
			System.out.println();
		}else {
			s = s.toLowerCase();
			char[] sArray = s.toCharArray();
			Set<Character> repeating = new HashSet<>();
			List<Character> nonRepeating = new ArrayList<>();
			for (char c : sArray) {
				if (nonRepeating.contains(c)){
					nonRepeating.remove(""+c);
					repeating.add(c);
				}else if (repeating.contains(c)){
					continue;
				}else {
					nonRepeating.add(c);
				}
			}
			if (nonRepeating.size() > 0){
				System.out.println(nonRepeating.get(0));
				System.out.println();
			}else {
				System.out.println("no non repeated character was found!");
			}
		}
	}
}
