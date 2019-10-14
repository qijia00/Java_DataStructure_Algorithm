package com.java67.array;

import java.util.BitSet;

//find multiple missing numbers in a given integer array of 1 to 10
public class FindMissingNumberInArrayImproved {
	public static void main(String[] args) {
		int[] intArray  = {1,2,5,6,8,9,10};
		missingNumbers(intArray);
	}
	//BitSet creates an array of bits represented by boolean values.
	//such as Bit0 is 1, Bit1 is 0, Bit 2 is 0, Bit3 is 1, etc.
	public static void missingNumbers(int[] numbers) {
		BitSet bs = new BitSet(); //BitSet's size is flexible
		for (int number : numbers) {
			bs.set(number);//bs1, bs2, bs5, bs6, bs8, bs9, bs10 are set to true, or 1.
		}
		for (int j = 1; j < 11; j++) {
			if (!bs.get(j)) { //get the boolean value or bs1, bs2, to bs10, if the value is false, or 0.
				System.out.println(j + " is missing!");
			}
		}
	}
}
