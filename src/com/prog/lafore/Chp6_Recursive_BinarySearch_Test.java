package com.prog.lafore;

import org.junit.Test;
import static org.junit.Assert.*;

public class Chp6_Recursive_BinarySearch_Test{

	Chp6_Recursive_BinarySearch chp6_Recursive_BinarySearch = new Chp6_Recursive_BinarySearch();
	
	@Test
	public void test1(){
		int[] arr = {3,5,8};
		int position = chp6_Recursive_BinarySearch.find(arr, 5);
		assertEquals(1, position);
	}
	
	@Test
	public void test2(){
		int[] arr = {3,5,8,14,99, 102, 156, 178, 304};
		//int[] arr = {3,14,99, 102, 156};
		int position = chp6_Recursive_BinarySearch.find(arr, 14);
		
		assertEquals(3, position);
		//assertEquals(1, position);
	}
	
		
}