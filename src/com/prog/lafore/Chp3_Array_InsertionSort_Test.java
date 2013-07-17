package com.prog.lafore;


import org.junit.Test;

public class Chp3_Array_InsertionSort_Test{

	@Test
	public void test_insertionSort(){
		int[] input = {22, 44, 11, 7, 55, 66, 48, 96, 88};
		display(input);
		Chp3_Array_InsertionSort  chp3_Array_InsertionSort = new  Chp3_Array_InsertionSort(input);
		int[] output = chp3_Array_InsertionSort.insertionSort();
		display(output);
	}
	
	public void display(int[] arr){
		for(int i = 0 ; i<arr.length ; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	

}