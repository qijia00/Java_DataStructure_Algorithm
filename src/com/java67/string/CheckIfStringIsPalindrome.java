package com.java67.string;

//A String is said to be a palindrome if the reverse of String is equal to itself 
//e.g. "aba" is a palindrome because the reverse of "aba" is also "aba".
public class CheckIfStringIsPalindrome {
	public static void main(String[] args){
		printPalindromeString(null);
		printPalindromeString(" ");
		printPalindromeString("aba");
		printPalindromeString("abba");
		printPalindromeString("abc");
		printPalindromeString("jiaqi");
	}
	
	//this solution uses String method length, charAt.
	public static boolean palindromeString(String s){
		int halfLength = 0;
		int fullLength = s.length();
		if (s.length()%2 == 1) {
			halfLength = (s.length() - 1)/2;
		}else {
			halfLength = s.length()/2;
		}
		
		for (int i = 0 ; i < halfLength; i++) {
			if (s.charAt(i) != s.charAt(fullLength-1-i)) {
				return false;
			};
		}
		
		return true;
	}
	
	public static void printPalindromeString(String s){
		System.out.println("Is String \"" + s + "\" palindrome?");
		if(s == null) {
			System.out.println("null strings are not allowed!");
			System.out.println(); 
		}else if (s.trim().equals("")) { //s.trim() == "" won't work
			System.out.println("empty strings are not allowed!");
			System.out.println();
		}else{
			System.out.println(palindromeString(s));
			System.out.println();
		}
	}
}
