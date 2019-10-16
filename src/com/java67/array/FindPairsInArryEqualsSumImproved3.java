package com.java67.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPairsInArryEqualsSumImproved3 {
	public static void main(String[] args) {
		int[] array1 = {2, 6, 3, 9, 11};
		int[] array2 = {3, 4, 5, 2, 4, 9, -1};
		int[] array3 = {3, 3, 1};
		int[] array4 = {3, 3};
		pairsEqualsSum(array1, 9);
		pairsEqualsSum(array2, 8);
		pairsEqualsSum(array3, 6);
		pairsEqualsSum(array4, 6);
	}
	// all 3 previous solutions are not suitable for large arrays, 
	// either due to complexity of O(N^2) or due to require additional space.
	// below is an in-place solution with complexity of O(NlogN).
	public static void pairsEqualsSum(int[] numbers, int sum) {
		System.out.println("From array " + Arrays.toString(numbers) + ", in order to get sum of " + sum + ": ");
		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int actualSum = numbers[left] + numbers[right]; 
			if (actualSum == sum) {
				System.out.println("you will need the pair of " + numbers[left++] + " and " + numbers[right--]);
			}else if (actualSum < sum) {
				left++;
			}else {
				right--;
			}
		}
		System.out.println("");
	}
}
