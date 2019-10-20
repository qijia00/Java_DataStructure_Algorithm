package com.java67.array;

import java.util.Arrays;

public class CalculateAverageOfAllNumbersInArray {
	public static void main(String[] args) {
		int[] intArray = {106700, 108100, 117900, 121500, 122400};
		calculateAverage(intArray);
		int[] intArray2 = {4,5};
		calculateAverage(intArray2);
	}
	
	public static void calculateAverage(int[] numbers) {
		System.out.print("The avererage of array " + Arrays.toString(numbers) + " is: ");
		//if you declare sum as int variable then your average will not be always accurate 
		//because it will become an integer division and result of integer division 
		//will always be an integer and not a floating point value. 
		float sum = 0f;
		for (int number : numbers) {
			sum = sum + number;
		}
		System.out.print(sum / numbers.length);
		System.out.println();
	}		 
}
