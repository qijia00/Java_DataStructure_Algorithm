package com.java67.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindMultipleMissingNumberInArrayWithDuplicatesImproved {
	public static void main(String[] args) {
		Integer[] intArray = {-3, 1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
		findMissingNumbers(intArray);
		Integer[] intArray2 = {109, 116, 108, 103, 118, 120, 104, 106, 105, 109};
		findMissingNumbers(intArray2);
	}

	public static void findMissingNumbers(Integer[] numbers) {
		System.out.println("The missing numbers from array " + Arrays.toString(numbers) + " are: ");
		Arrays.sort(numbers);
		Set<Integer> set = new LinkedHashSet<>(Arrays.asList(numbers));
		int min = numbers[0];
		int max = numbers[numbers.length - 1];
		for (int i = min; i <= max; i++) {
			if (!set.contains(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}
}
