package com.java67.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//if input integer array is {2, 6, 3, 9, 11} and given sum is 9, output should be {6,3}..
public class FindPairsInArryEqualsSum {
	public static void main(String[] args) {
		Integer[] array1 = {2, 6, 3, 9, 11};
		Integer[] array2 = {3, 4, 4, 5, 2, 9, -1};
		pairsEqualsSum(array1, 9);
		pairsEqualsSum(array2, 8);
	}
	
	public static void pairsEqualsSum(Integer[] numbers, int sum) {
		System.out.println("From array " + Arrays.toString(numbers) + ", in order to get sum of " + sum + ": ");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j]  == sum) {
					System.out.println("you will need the pair of " + numbers[i] + " and " + numbers[j]);
				}
			}			
		}
		System.out.println("");
	}	
}

