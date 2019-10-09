package com.java67.string;

import java.util.HashMap;
import java.util.Map;

public class CountVowelsAndConsonantsInString {
	public static void main(String[] args) {
		countVowelsAndConsonants(null);
		countVowelsAndConsonants("");
		countVowelsAndConsonants("JiaQi");
		countVowelsAndConsonants("CountVowelsAndConsonantsInString");
		countVowelsAndConsonants("AbcdEfghIjklmnOpqrstUvwxyzAEIOUzzz!@#$%^&*()0987654321");
	}
	
	//this solution uses case switch; and String method toLowerCase, toCharArray.
	public static void countVowelsAndConsonants(String s) {
		System.out.print("The number of vowels in the String \"" + s + "\" is: ");
		if (s == null) {
			System.out.println("null strings are not allowed!");
			System.out.println();
		}else {
			s = s.toLowerCase();
			char[] sArray = s.toCharArray();
			// first count number of vowels and then subtract those characters from length of String, but this will NOT work 
			// if your String contains non-alphabetic characters, such as special character like @, _, | or numbers like 1,2,3 etc.
			int vowelsCount = 0;
			int consnantsCount = 0;
			for (char c : sArray) {
				switch(c){
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						vowelsCount++;
						break;
					case 'b':
					case 'c':
					case 'd':
					case 'f':
					case 'g':
					case 'h':
					case 'j':
					case 'k':
					case 'l':
					case 'm':
					case 'n':
					case 'p':
					case 'q':
					case 'r':
					case 's':
					case 't':
					case 'v':
					case 'w':
					case 'x':
					case 'y':
					case 'z':
						consnantsCount++;
						break;
					default:
						continue;
				}
			}
			System.out.println(vowelsCount);
			System.out.print("The number of constants in the String \"" + s + "\" is: ");
			System.out.println(consnantsCount);
			System.out.println();
		}
	}
}
