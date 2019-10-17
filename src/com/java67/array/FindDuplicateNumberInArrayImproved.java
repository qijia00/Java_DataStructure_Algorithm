package com.java67.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FindDuplicateNumberInArrayImproved {
	public static void main(String[] args) {
		int[] intArray = {1,2,2,3,4,4,5,6,7,6,8,6};
		duplicateNumber(intArray);
	}
	//this solution is a trade-off between time and space, 
	//it uses two storage to cut down one iteration: complexity is reduced to O(n) + O(1)
	public static void duplicateNumber(int[] numbers) {
		System.out.println("In the array of " + Arrays.toString(numbers) + ", the following numbers are duplicated: ");
		List<Integer> nonRepeated = new ArrayList<>();
		Set<Integer> repeated = new HashSet<>();
		for (int number : numbers) {
			if (nonRepeated.contains(number)) {
				nonRepeated.remove((Integer) number);
				repeated.add(number);
			}else {
				nonRepeated.add(number);
			}
		}
		System.out.println(repeated);
	}
}
