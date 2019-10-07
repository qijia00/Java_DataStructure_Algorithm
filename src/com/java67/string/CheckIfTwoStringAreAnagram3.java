package com.java67.string;

//two String are called anagram, if they contains same characters but on different order 
//e.g. army and mary, stop and pots etc.
public class CheckIfTwoStringAreAnagram3 {
	public static void main(String[] args){
		anagramCheckResult(anagramCheck("12",""));
		anagramCheckResult(anagramCheck(null,""));
		anagramCheckResult(anagramCheck("123","32"));
		anagramCheckResult(anagramCheck("JiaQi", "QxJIA"));
		anagramCheckResult(anagramCheck("stop", "POST"));
	}
	
	//this solution uses String method toLowerCase, length, toCharArray; StringBuilder method indexOf(string), deletCharAt, length.
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
				StringBuilder s2SB = new StringBuilder(s2);
				for (char c : s1array) {
					int index = s2SB.indexOf(""+c); //using ""+c to convert char c to string c
					if(index == -1){
						return false;
					}else {
						s2SB = s2SB.deleteCharAt(index);
					}
				}				
				return s2SB.length()==0?true:false;
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
