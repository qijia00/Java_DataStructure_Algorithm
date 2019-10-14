package com.java67.array;

// find a missing number in a given integer array of 1 to 10
public class FindMissingNumberInArray {
	public static void main(String[] args) {
		int[] intArray  = {1,2,3,4,5,6,8,9,10};
		missingNumber(intArray);
	}
	//this solution only work for one missing number)
	public static void missingNumber(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println("The missing number is: " + ((1+10)*10/2-sum));
	}
}
