package com.java67.string;

import java.util.regex.Pattern;

//In predefined character class in Java regular expression: \d represents a digit (0-9), \D represents a non digit (anything other than 0 to 9).
public class CheckIfStringContainsOnlyDigits {
	public static void main(String[] args){
		isDigitsString(null);
		isDigitsString("");
		isDigitsString("1234567890");
		isDigitsString("JiaQi");
		isDigitsString("1?");
		isDigitsString("666666");
	}
	
	//this solution uses Pattern method matcher(string).matches().
	public static void isDigitsString(String s){
		System.out.print("The String \"" + s + "\": ");
		if (s == "" | s == null) {
			System.out.println("empty and null strings are not allowed!");
			System.out.println();
		}else {
			//Pattern pattern = Pattern.compile(".*\\D.*"); //contains a non-digit
			Pattern pattern = Pattern.compile(".*[^0-9].*"); //contains a non-digit //both line 22 and line 23 works
			if (pattern.matcher(s).matches()) {
				System.out.println("contains characters other than digits.");
				System.out.println();				
			}else {
				System.out.println("contains only digits.");
				System.out.println();
			}
		}
	}
}
