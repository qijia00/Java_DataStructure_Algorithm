package com.java67.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumberInArray {
	public static void main(String[] args) {
		int[] intArray = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7};
		duplicateNumber(intArray);
	}
	
	public static void duplicateNumber(int[] numbers) {
		System.out.println("In the array of " + Arrays.toString(numbers) + ": ");
		Map<Integer, Integer> map = new HashMap<>();
		for (int number : numbers) {
			map.put(number, map.containsKey(number) ? map.get(number) + 1 : 1);
		}
		//System.out.println(map);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " was repeated : " + entry.getValue() + " times.");
			}
		}
	}
}
