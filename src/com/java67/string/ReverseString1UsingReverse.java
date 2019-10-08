package com.java67.string;

public class ReverseString1UsingReverse {
	public static void main(String[] args){
		reverseString(null);
		reverseString("");
		reverseString("1234567890");
		reverseString("JiaQi");
		reverseString("abcedff");
		reverseString("z1z");
	}
	
	//this solution uses StringBuilder method reverse.
	public static void reverseString(String s){
		System.out.print("Original String \"" + s + "\" is reversed to: ");
		if (s == null) {
			System.out.println("null strings are not allowed!");
			System.out.println();
		}else {
			StringBuilder sb = new StringBuilder(s);
			System.out.println(sb.reverse());
			System.out.println();
		}
	}
}
