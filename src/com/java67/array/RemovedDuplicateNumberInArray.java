package com.java67.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovedDuplicateNumberInArray {
	public static void main(String[] args) {
		int[] intArray = {7,6,6,5,5,5,4,4,4,4,3,3,3,3,3,2,2,2,2,2,2,1,1,1,1,1,1,1,0};
		duplicateNumber(intArray);
	}
	
	public static void duplicateNumber(int[] numbers) {
		System.out.println("Removed all the duplicated numbers from the array of " + Arrays.toString(numbers) + ": ");
		Set<Integer> set = new LinkedHashSet<>(); //LinkedHashSet keeps the order on which elements are inserted into Set
		for (int number : numbers) {
			set.add(number); //if try to added duplicated numbers to set, set.add will return false, the duplicated number won't be added again.
		}
		System.out.println(set); //line 19 can replace line 20 to 25.
//		int[] newArray = new int[set.size()];
//		int i = 0;
//		for (int j : set) {
//			newArray[i++] = j;
//		}
//		System.out.println(Arrays.toString(newArray));
	}
}
