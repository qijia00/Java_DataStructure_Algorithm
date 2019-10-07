package com.java67.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharactersFromString {
	public static void main(String[] args) {
		printDuplicateCharacters("abcedfghijklmnopqrstuvwxyzjiaqi");
	}
		
	public static void printDuplicateCharacters(String string) {
		char[] stringToCharArray = string.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		for(char c : stringToCharArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}			
		}
		
		Set<Character> keys = map.keySet();
		System.out.println("Duplicated Characters From String: " + string);
		for(char k : keys) {
			if (map.get(k) > 1) {
				System.out.println(k + ": " + map.get(k));
			}
		}
	}

}
