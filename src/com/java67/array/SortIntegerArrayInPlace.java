package com.java67.array;

import java.util.Arrays;

public class SortIntegerArrayInPlace {
	public static void main(String[] args){
		int[] a = {1, 3, 5, 7, 9, 0, 8, 6, 4, 2};
		sortArray(a);		
	}
	
	public static void sortArray(int[] numbers){
		System.out.print("Origianl array is " + Arrays.toString(numbers));
		Arrays.sort(numbers); // return type is void
		System.out.println(", after sorting the new array is " + Arrays.toString(numbers));
	}
}
