package com.prog.lafore;

import org.junit.Test;
import static org.junit.Assert.*;

public class Chp7_QuickSort_Test {

	@Test
	public void test_partitionIt(){
		
		int[] arr = {149, 192, 47, 152, 159, 195, 61, 66, 17, 167, 118, 64, 27, 80, 30, 105};
		Chp7_QuickSort chp7_QuickSort = new Chp7_QuickSort(arr);
		
		int left = 0;
		int right = arr.length-1;
		
		System.out.println("Before partitioning --- ");
		chp7_QuickSort.displayArray();
		
		assertEquals(8, chp7_QuickSort.partitionIt(left, right, 99));
		
		System.out.println("After partitioning --- ");
		chp7_QuickSort.displayArray();
		
	}
	
	@Test
	public void test_recursiveQuickSort(){
		int[] arr = {149, 192, 47, 152, 159, 195, 61, 66, 17, 167, 118, 64, 27, 80, 30, 105};
		Chp7_QuickSort chp7_QuickSort = new Chp7_QuickSort(arr);
		
		int left = 0;
		int right = arr.length-1;
		
		System.out.println("Before sorting --- ");
		chp7_QuickSort.displayArray();
		
		chp7_QuickSort.recursiveQuickSort(left, right);
		
		System.out.println("After sorting --- ");
		chp7_QuickSort.displayArray();
		
		assertEquals(arr[0], 17);
		assertEquals(arr[3], 47);
		assertEquals(arr[11], 152);
		assertEquals(arr[15], 195);
	}
	
}
