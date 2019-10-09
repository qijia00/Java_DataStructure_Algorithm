package com.java67.string;

public class FindAllStringPermutationsUsingRecursion {
	public static void main(String[] args) {
		printPermutations(null);
		printPermutations("");
		printPermutations("a");
		printPermutations("ab");
		printPermutations("abc");
		printPermutations("jqkA");
	}
	
	//public function to wrap private function so user do not need to input empty string "".
	public static void findPermutations(String input) {
		permutations("", input);
	}
	//construct result into String empty, once the original string becomes empty, returns.
	private static void permutations(String empty, String s) {
		if (s.isEmpty() ){ //In the case of recursion, the most important question is the base case, because that is responsible for stopping recursive call.
			System.out.print(empty + " ");
		}else{
			char[] sArray = s.toCharArray();
			for (char c : sArray) {
				permutations(empty + c, s.substring(0, s.indexOf(c)) + s.substring(s.indexOf(c)+1));
			}
		}
	}
	
	public static void printPermutations(String s) {
		System.out.print("The permutations of the String \"" + s + "\" are: ");
		if (s == null) {
			System.out.println("null strings are not allowed!");
			System.out.println();
		}else{
			findPermutations(s);
			System.out.println();
			System.out.println();
		}
	}
}
