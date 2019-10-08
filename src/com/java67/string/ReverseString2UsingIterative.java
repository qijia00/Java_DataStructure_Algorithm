package com.java67.string;

public class ReverseString2UsingIterative {
	public static void main(String[] args){
		reverseString(null);
		reverseString("");
		reverseString("1234567890");
		reverseString("JiaQi");
		reverseString("abcedff");
		reverseString("z1z");
	}
	
	//this solution uses StringBuilder method append.
	public static void reverseString(String s){
		System.out.print("The first non repeated charater from String \"" + s + "\" is: ");
		if (s == null) {
			System.out.println("null strings are not allowed!");
			System.out.println();
		}else {
			StringBuilder sb = new StringBuilder();
			for(int i = s.length()-1; i >= 0; i--){
				sb = sb.append(s.charAt(i));
			}
			System.out.println(sb.toString()); //System.out.println(sb) works too.
			System.out.println();
		}
	}
}
