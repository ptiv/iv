package com.prog.ctci;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog9_3_Test {
	
	@Test
	public void test1(){
		int[] arr = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
		Prog9_3 prog9_3 = new Prog9_3(arr);
		int position = prog9_3.binarySearchOnRotatedArray(5, 0, arr.length-1, 1);
		assertEquals(8, position);
		
		int position1 = prog9_3.binarySearchOnRotatedArray(20, 0, arr.length-1, 1);
		assertEquals(3, position1);
		
		int position2 = prog9_3.binarySearchOnRotatedArray(10, 0, arr.length-1, 1);
		assertEquals(10, position2);
		
		int position3 = prog9_3.binarySearchOnRotatedArray(1, 0, arr.length-1, 1);
		assertEquals(5, position3);
		
	}
	
}
