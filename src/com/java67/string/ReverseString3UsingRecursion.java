package com.java67.string;

//don’t use recursive solution in production code as it may result in StackOverFlowError if String to be reversed is very long String
//or if you have any bug in your reverse function
public class ReverseString3UsingRecursion {
	public static void main(String[] args){
		printReversedString(null);
		printReversedString("");
		printReversedString("1234567890");
		printReversedString("JiaQi");
		printReversedString("abcedff");
		printReversedString("z1z");
	}
	
	//this solution uses string method length, charAt(index), substring(inclusive starting index, exclusive ending index), and substring(inclusive starting index).
	public static String reverseString(String s){
		if (s.length() <= 1) {
			return s;
		}
		return reverseString(s.substring(1)) + s.charAt(0);
		//return s.charAt(s.length()-1) + reverseString(s.substring(0,s.length()-1)); //either line 19 or line 20 works.
	}
	
	public static void printReversedString(String s){
		System.out.print("Original String \"" + s + "\" is reversed to: ");
		if (s == null) {
			System.out.println("null strings are not allowed!");
			System.out.println();
		}else {
			s = reverseString(s);
			System.out.println(s);
			System.out.println();
		}
	}
}
