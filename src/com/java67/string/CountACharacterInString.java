package com.java67.string;

public class CountACharacterInString {
	public static void main(String[] args) {
		CountAGivenCharacterInString(null, 'i');
		CountAGivenCharacterInString("", 'i');
		CountAGivenCharacterInString("JiaQi", 'i');
		CountAGivenCharacterInString("CountVowelsAndConsonantsInString", 'i');
		CountAGivenCharacterInString("AbcdEfghIjklmnOpqrstUvwxyzAEIOUzzz!@#$%^&*()0987654321", 'i');
	}
	
	//this solution uses String method toLowerCase, toCharArray.
	public static void CountAGivenCharacterInString(String s, Character a) {
		System.out.print("The number of character \'" + a + "\' in the String \"" + s + "\" is: ");
		if (s == null) {
			System.out.println("null strings are not allowed!");
			System.out.println();
		}else {
			char[] sArray = s.toCharArray();
			int count = 0;
			for (char c : sArray) {
				if (c == a){
					count++;
				}
			}
			System.out.println(count);
			System.out.println();
		}
	}
}
