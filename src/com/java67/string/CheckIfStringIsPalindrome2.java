package com.java67.string;

public class CheckIfStringIsPalindrome2 {
	public static void main(String[] args){
		printPalindromeString(null);
		printPalindromeString(" ");
		printPalindromeString("aba");
		printPalindromeString("abba");
		printPalindromeString("abc");
		printPalindromeString("jiaqi");
	}
	
	//this solution uses String method length, substring, equals.
	public static String reverseString(String s){
		if (s.length() <= 1) {
			return s;
		}
		
		return s.substring(s.length()-1) + reverseString(s.substring(0, s.length()-1));
	}

	public static boolean palindromeString(String s){
		if (reverseString(s).equals(s)) {
			return true;
		}
		return false;
	}
	
	public static void printPalindromeString(String s){
		System.out.println("Is String \"" + s + "\" palindrome?");
		System.out.println(); 
		if(s == null) {
			System.out.println("null strings are not allowed!");
			System.out.println(); 
		}else if (s.trim().isEmpty()) { //s.trim() == "" won't work
			System.out.println("empty strings are not allowed!");
			System.out.println();
		}else{
			System.out.println(palindromeString(s));
			System.out.println();
		}
	}
}
