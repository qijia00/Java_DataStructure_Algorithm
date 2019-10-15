package com.java67.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovedDuplicateNumberInArrayImproved {
	public static void main(String[] args) {
		//if use int[], then Arrays.asList will create List<int[]> instead of List<Integer>
		//if you really want to convert int[] to Collection<Integer>, then you need to do a for loop
		//as indicated in RemovedDuplicateNumberInArray.java line 16 to 18.
		Integer[] intArray = {8,7,6,6,5,4,3,2,2,2,1,0};
		duplicateNumber(intArray);
	}
	
	public static void duplicateNumber(Integer[] numbers) {
		System.out.println("Removed all the duplicated numbers from the array of " + Arrays.toString(numbers) + ": ");
		//pass a collection to create another collection
		//so convert array to ArrayList first, then convert ArrayList to LInkedHashSet
		//LinkedHashSet keeps the order on which elements are inserted into Set
		//and Set does not allow duplicated elements
		Set<Integer> set = new LinkedHashSet<>(Arrays.asList(numbers)); 
		System.out.println(set);		
	}
}
