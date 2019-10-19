package com.java67.array;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class ReverseArrayInPlace {
	public static void main(String[] args){
		int[] iArray = {1, 2, 3, 4, 5, 6, 7};
		String[] stringArray = {"a", "b", "c", "d"};
		
		System.out.print("Origianl array is " + Arrays.toString(iArray));
		ArrayUtils.reverse(iArray); // return type is void
		System.out.println(", after sorting the new array is " + Arrays.toString(iArray));
		
		System.out.print("Origianl array is " + Arrays.toString(stringArray));
		ArrayUtils.reverse(stringArray); // return type is void
		System.out.println(", after sorting the new array is " + Arrays.toString(stringArray));
	}
}
