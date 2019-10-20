package com.java67.array;

import java.util.Arrays;
import java.util.BitSet;

public class FindMultipleMissingNumberInArrayWithDuplicates {
	public static void main(String[] args) {
		int[] intArray = {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
		findMissingNumbers(intArray);
		int[] intArray2 = {109, 116, 108, 103, 118, 120, 104, 106, 105, 109};
		findMissingNumbers(intArray2);
	}
	// since the bit values can be accessed by non-negative integers as an index.
	// this solution won't work if the intArray contains negative integers.
	public static void findMissingNumbers(int[] numbers) {
		System.out.println("The missing numbers from array " + Arrays.toString(numbers) + " are: ");
		Arrays.sort(numbers);
		BitSet bs = new BitSet();
		for (int number : numbers) {
			bs.set(number); // e.g., bs1, bs3 are set to true, bs2 is set to false.
		}
		for (int i = numbers[0]; i < bs.length(); i++) {
			if (!bs.get(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}
}
