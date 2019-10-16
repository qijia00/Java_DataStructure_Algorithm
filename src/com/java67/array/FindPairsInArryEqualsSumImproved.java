package com.java67.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindPairsInArryEqualsSumImproved {
	public static void main(String[] args) {
		int[] array1 = {2, 6, 3, 9, 11};
		int[] array2 = {3, 4, 5, 2, 4, 9, -1};
		int[] array3 = {3, 3};
		pairsEqualsSum(array1, 9);
		pairsEqualsSum(array2, 8);
		pairsEqualsSum(array3, 6);
	}
	// reduce solution complexity from O(n^2) to O(N)
	public static void pairsEqualsSum(int[] numbers, int sum) {
		System.out.println("From array " + Arrays.toString(numbers) + ", in order to get sum of " + sum + ": ");
		Set<Integer> set = new HashSet<>();
		for (int number : numbers) {
			int target = sum - number;
			if (!set.contains(target)) {
				set.add(number);
			}else {
				System.out.println("you will need the pair of " + number + " and " + target);
			}
		}
		System.out.println("");
	}	
}