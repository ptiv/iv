package com.prog.lafore;

import org.junit.Test;
import static org.junit.Assert.*;

public class Chp6_Recursive_MergeSort_Test{
	
	
	@Test
	public void test_mergeOperation_overEntireArray(){
		int[] arr = {4, 15, 26, 37, 48, 5, 7, 39, 56, 63};
		Chp6_Recursive_MergeSort chp6_Recursive_MergeSort = new Chp6_Recursive_MergeSort(arr);
		int lowPtr = 0;
		int highPtr = 5;
		int upperBound = 9;
		chp6_Recursive_MergeSort.mergeOperation(lowPtr, highPtr, upperBound);
		assertEquals(4 , arr[0]);
		assertEquals(5 , arr[1]);
		assertEquals(7 , arr[2]);
		assertEquals(15 , arr[3]);
		assertEquals(26, arr[4]);
		assertEquals(37 , arr[5]);
		assertEquals(39 , arr[6]);
		assertEquals(48 , arr[7]);
		assertEquals(56 , arr[8]);
		assertEquals(63 , arr[9]);
	}
	
	@Test
	public void test_mergeOperation_overPartOfArray(){
		int[] arr = {4, 15, 26, 37, 48, 5, 7, 39, 56, 63};
		Chp6_Recursive_MergeSort chp6_Recursive_MergeSort = new Chp6_Recursive_MergeSort(arr);
		int lowPtr = 2;
		int highPtr = 5;
		int upperBound = 8;
		chp6_Recursive_MergeSort.mergeOperation(lowPtr, highPtr, upperBound);
		assertEquals(5 , arr[2]);
		assertEquals(7 , arr[3]);
		assertEquals(26, arr[4]);
		assertEquals(37 , arr[5]);
		assertEquals(39 , arr[6]);
		assertEquals(48 , arr[7]);
		assertEquals(56 , arr[8]);
	}
	
	/**
	 * test the main function
	 */
	@Test
	public void test_sort(){
		int[] arr = {26, 39, 4, 63, 48, 5, 7, 15, 56, 37};
		Chp6_Recursive_MergeSort chp6_Recursive_MergeSort = new Chp6_Recursive_MergeSort(arr);
		chp6_Recursive_MergeSort.sort();
		assertEquals(4 , arr[0]);
		assertEquals(5 , arr[1]);
		assertEquals(7 , arr[2]);
		assertEquals(15 , arr[3]);
		assertEquals(26 , arr[4]);
		assertEquals(37 , arr[5]);
		assertEquals(39 , arr[6]);
		assertEquals(48 , arr[7]);
		assertEquals(56 , arr[8]);
		assertEquals(63 , arr[9]);
	}
	
}