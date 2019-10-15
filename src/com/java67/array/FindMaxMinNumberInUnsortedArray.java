package com.java67.array;

import java.util.Arrays;

public class FindMaxMinNumberInUnsortedArray {
	public static void main(String[] args){
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] array2 = {9, 2, 2, 3, 8, 8, 5, 6, 6, 7};
		int[] array3 = {-100, 500, -1000, 0, 1998};
		maxMinNumber(array1);
		maxMinNumber(array2);
		maxMinNumber(array3);
	}
	
	public static void maxMinNumber(int[] numbers){
		System.out.println("The largest and smallest numbers in the array " + Arrays.toString(numbers) + " are: ");
		int max = numbers[0];
		int min = numbers[0];
		for (int number : numbers){
			if (number > max) {
				max = number;
			}else if (number < min){
				min = number;
			}
		}
		System.out.println(max + " is the Largest number, and " + min + " is the smallest number.");
	}
}
