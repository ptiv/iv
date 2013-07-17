package com.prog.lafore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Chp3_Array_SelectionSort_Test{
	
	@Test
	public void test_findIndexOfMinimum(){
		int[] input = {22, 44, 11, 7, 55, 66, 48, 96, 88};
		Chp3_Array_SelectionSort chp3_Array_SelectionSort = new Chp3_Array_SelectionSort(input);
		assertEquals(3, chp3_Array_SelectionSort.findIndexOfMinimum(0, 8));
		assertEquals(6, chp3_Array_SelectionSort.findIndexOfMinimum(4, 8));
	}
	
	@Test
	public void test_selectionSort(){
		int[] input = {22, 44, 11, 7, 55, 66, 48, 96, 88};
		Chp3_Array_SelectionSort chp3_Array_SelectionSort = new Chp3_Array_SelectionSort(input);
		display(input);
		int[] output = chp3_Array_SelectionSort.selectionSort();
		display(output);
	}
	
	public void display(int[] arr){
		for(int i = 0 ; i<arr.length ; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	
}