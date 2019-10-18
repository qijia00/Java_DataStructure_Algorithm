package com.java67.array;

import java.util.Arrays;

public class QuickSortIntegerArrayInPlace {
	public static void main(String[] args){
		int[] a = {1, 3, 5, 7, 9, 0, 8, 6, 4, 2};
		quickSortArray(a);
		int[] b = {11, 3, 5, 7, 9, 0, 8, 6, 4, 2, 1};
		quickSortArray(b);		
	}
	
	public static int[] quickSortArray(int[] numbers){
		if (numbers.length <= 1) {
			return numbers;
		}
		int arrayLength = numbers.length;
		int middle = arrayLength / 2; // say if the arrayLength is an odd number, e.g., 11, then middle is 5.
		int pivot = numbers[middle];
		int leftPosition = 0;
		int left = numbers[0]; 
		int rightPosition = arrayLength - 1;
		int right = numbers[arrayLength-1];
		for (int i = 0; i < middle; i++) {
			if (numbers[i] > pivot){
				leftPosition = i;
				left = numbers[leftPosition];
				break;
			}  
		}
		for (int j = arrayLength-1; j > middle; j--) {
			if (numbers[j] < pivot){
				rightPosition = j;
				right = numbers[rightPosition];
				break;
			}  
		}
		numbers[leftPosition] = right;
		numbers[rightPosition] = left;
		return numbers;
	}
	
	public static void pringQuickSortArray(int[] numbers){
		System.out.print("Origianl array is " + Arrays.toString(numbers));
		quickSortArray(numbers);
		System.out.println(", after sorting the new array is " + Arrays.toString(numbers));
	}
}
