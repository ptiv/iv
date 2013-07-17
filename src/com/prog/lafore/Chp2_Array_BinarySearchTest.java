package com.prog.lafore;

import static org.junit.Assert.*;

import org.junit.Test;

public class Chp2_Array_BinarySearchTest {
	
	Chp2_Array_BinarySearch chp2_Array_BinarySearch = new Chp2_Array_BinarySearch();
	int[] input;
	int position, searchKey;

	@Test
	public void testFindPositionUsingBinarySearch(){
		
		input = new int[]{1,3,7};
		searchKey = 1;
		position = chp2_Array_BinarySearch.findPositionUsingBinarySearch(input, searchKey);
		assertEquals(0, position);
		searchKey = 3;
		position = chp2_Array_BinarySearch.findPositionUsingBinarySearch(input, searchKey);
		assertEquals(1, position);
		searchKey = 7;
		position = chp2_Array_BinarySearch.findPositionUsingBinarySearch(input, searchKey);
		assertEquals(2, position);
		searchKey = 8;
		position = chp2_Array_BinarySearch.findPositionUsingBinarySearch(input, searchKey);
		
		input = new int[]{4, 27, 102, 457, 668, 9024, 10075, 426579, 996262};
		searchKey = 102;
		position = chp2_Array_BinarySearch.findPositionUsingBinarySearch(input, searchKey);
		assertEquals(2, position);
		searchKey = 10075;
		position = chp2_Array_BinarySearch.findPositionUsingBinarySearch(input, searchKey);
		assertEquals(6, position);
		
	}
}
