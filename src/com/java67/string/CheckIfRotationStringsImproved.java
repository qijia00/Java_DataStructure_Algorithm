package com.java67.string;

import java.util.ArrayList;
import java.util.List;

//Write a program to check if two given String s1 and s2 are rotations of another. 
//For example if s1 = "IndiaUSAEngland" and s2= "USAEnglandIndia" then your program should return true 
//but if s2="IndiaEnglandUSA" then it should return false.
//you can assume that Strings are rotated on the right side.
public class CheckIfRotationStringsImproved {
	public static void main(String[] args){
		printRotationStrings(null, "");
		printRotationStrings(" ", "");
		printRotationStrings("ab", "ba");
		printRotationStrings("IndiaUSAEngland", "USAEnglandIndia");
		printRotationStrings("IndiaUSAEngland", "IndiaEnglandUSA");
		printRotationStrings("programming", "ingprogramm");
	}
	
	//this solution uses String method length, substring, equals; and ArrayList method add, iteration.
	public static boolean rotationStrings(String left, String right){
		if (left.length() != right.length()) {
			return false;
		}
		
		String concatenated = left + left;
		if (concatenated.contains(right)) {
			return true;				
		}
		
		return false;
	}
	
	public static void printRotationStrings(String left, String right){
		System.out.println("If String \"" + left + "\" and String \"" + right + "\" are rotation of each other?");
		if (left == null | right == null) {
			System.out.println("null strings are not allowed!");
			System.out.println();
		}else {
			System.out.println(rotationStrings(left, right));
			System.out.println();
		}
	}
}
