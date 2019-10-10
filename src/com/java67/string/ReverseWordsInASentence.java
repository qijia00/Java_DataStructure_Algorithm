package com.java67.string;

//for example if given input is "Java is Great" then your program should return "Great is Java". 
public class ReverseWordsInASentence {
	public static void main(String[] args){
		reverseWords(null);
		reverseWords(" ");
		reverseWords("Jia Qi is practicing Java");
	}
	
	//this solution uses String method trim, split with regex of whitespace character, and StringBuilder method append, toString, trim.
	public static void reverseWords(String s){
		System.out.print("Original String \"" + s + "\" is reversed to: ");
		if (s == null) {
			System.out.println("null strings are not allowed!");
			System.out.println();
		}else if (s.trim() == "") {
			System.out.println(s);
			System.out.println();			
		}else {
			String[] splittedString = s.trim().split("\\s");
			StringBuilder reversed = new StringBuilder();
			for (int i = splittedString.length-1; i >= 0;  i--){
				reversed.append(splittedString[i]).append(" ");					
			}
			System.out.println(reversed.toString().trim());
			System.out.println();
		}

	}
}
