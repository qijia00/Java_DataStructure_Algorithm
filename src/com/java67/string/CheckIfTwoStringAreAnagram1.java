package com.java67.string;

//two String are called anagram, if they contains same characters but on different order 
//e.g. army and mary, stop and pots etc.
public class CheckIfTwoStringAreAnagram1 {
	public static void main(String[] args){
		anagramCheckResult(anagramCheck("12",""));
		anagramCheckResult(anagramCheck(null,""));
		anagramCheckResult(anagramCheck("123","3210"));
		anagramCheckResult(anagramCheck("JiaQi", "QIJIA"));
	}
	
	//this solution uses String method toLowerCase, length, toCharArray, indexof(char), substring, isEmpty.
	public static boolean anagramCheck(String s1, String s2){		
		System.out.println("If string 1: " + s1);
		System.out.println("and string 2: " + s2);
		System.out.print("are anagram: ");
		
		if (s1 == null | s2 == null | s1 =="" | s2 =="") {
			System.out.println("null and empty strings are NOT allowed!");
			return false;
		}else {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			if (s1.length() != s2.length()) {
				return false;
			}else {
				char[] s1array = s1.toCharArray();
				for (char c : s1array) {
					int index = s2.indexOf(c);
					if(index == -1){
						return false;
					}else if(index == 0) {
						s2 = s2.substring(index+1); // you actually don't need this condition, since the substring() method will return an empty String if beginIndex= endIndex.
					}else {
						s2 = s2.substring(0, index) + s2.substring(index+1);
					}
				}				
				return s2.isEmpty();
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
