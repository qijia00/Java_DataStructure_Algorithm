package com.java67.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllStringPermutationsUsingRecursionImproved {
	public static void main(String[] args) {
		printPermutations(null);
		printPermutations("");
		printPermutations("a");
		printPermutations("ab");
		printPermutations("abc");
		printPermutations("jqkA");
	}
	
	//this solution uses ArrayList method add, addAll; and String method isEmpty, length, charAt, subString.
	private static List<String> generatePermutations(String empty, String s) {
		List<String> permutations = new ArrayList<>();
		if (s.isEmpty() ){ //In the case of recursion, the most important question is the base case, because that is responsible for stopping recursive call.
			permutations.add(empty);
		}else{
			for (int i=0; i<s.length(); i++) {
				//arrayList2.addAll(arrayList1) will append all the elements of arrayList1 to the end of arrayList2.
				//which means arrayList2 will have its own elements plus all the elements from arrayList1.
				permutations.addAll(generatePermutations(empty + s.charAt(i), s.substring(0, i) + s.substring(i+1)));
				//in recursion, the arrayList permutations is a local variable not a global variable.
				//in each recursion, permutations is returned with single string value from if branch, then we use addAll to collect them all.
			}
		}
		return permutations;
	}
	
	public static void printPermutations(String input) {
		System.out.print("The permutations of the String \"" + input + "\" are: ");
		if (input == null) {
			System.out.println("null strings are not allowed!");
			System.out.println();
		}else{
			System.out.println(Arrays.toString(generatePermutations("", input).toArray())); //how to print out all the elements of List generatePermutations("", input).
			System.out.println();
		}
	}
}
