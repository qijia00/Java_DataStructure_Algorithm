package com.java67.string;

import java.util.Arrays;

public class CheckIfTwoStringAreAnagram2 {
	public static void main(String[] args){
		anagramCheckResult(anagramCheck("12",""));
		anagramCheckResult(anagramCheck(null,""));
		anagramCheckResult(anagramCheck("123","321"));
		anagramCheckResult(anagramCheck("JiaQi", "QImJIA"));
	}
	
	//this solution uses String method toLowerCase, length, toCharArray; and Arrays static method sort, equals.
	public static boolean anagramCheck(String s1, String s2){		
		System.out.println("If string 1: " + s1);
		System.out.println("and string 2: " + s2);
		System.out.print("are anagram: ");
		
		if(s1 == null | s2 == null) {
			System.out.println("null strings are not allowed!");
			return false; 
		}else if (s1.trim().isEmpty() | s2.trim().isEmpty()) { //s.trim() == "" won't work
			System.out.println("empty strings are not allowed!");
			return false;
		}else {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			if (s1.length() != s2.length()) {
				return false;
			}else {
				char[] s1array = s1.toCharArray();
				char[] s2array = s2.toCharArray();
				Arrays.sort(s1array);
				Arrays.sort(s2array);
				return Arrays.equals(s1array, s2array);
			}	
		}
	}
	
	public static void anagramCheckResult(boolean b){
		if (b) {
			System.out.println("yes.");	
			System.out.println();
		}else {
			System.out.println("no!");
			System.out.println();
		}		
	}
}
