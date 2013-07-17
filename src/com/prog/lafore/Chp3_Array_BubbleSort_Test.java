package com.prog.lafore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author ptemkar
 *
 */
public class Chp3_Array_BubbleSort_Test{
	

	@Test
	public void test_swap(){
		int[] input = {23, 45, 62, 34, 92, 14};
		 Chp3_Array_BubbleSort  chp3_Array_bubbleSort = new  Chp3_Array_BubbleSort(input);
		 chp3_Array_bubbleSort.swap(2, 3);
		 assertEquals(34, input[2]);
		 assertEquals(62, input[3]);
	}
	
	@Test
	public void test_bubbleSort(){
		int[] input = {77, 99, 44, 55, 22, 88, 11, 0, 66, 33};
		display(input);
		Chp3_Array_BubbleSort  chp3_Array_bubbleSort = new  Chp3_Array_BubbleSort(input);
		int[] output = chp3_Array_bubbleSort.bubbleSort();	
		display(output);
	}
	
	@Test
	public void test_bubbleSort_2elements(){
		int[] input = {45, 23};
		display(input);
		Chp3_Array_BubbleSort  chp3_Array_bubbleSort = new  Chp3_Array_BubbleSort(input);
		int[] output = chp3_Array_bubbleSort.bubbleSort();	
		display(output);
	}
	
	@Test
	public void test_bubbleSort_1element(){
		int[] input = {45};
		display(input);
		Chp3_Array_BubbleSort  chp3_Array_bubbleSort = new  Chp3_Array_BubbleSort(input);
		int[] output = chp3_Array_bubbleSort.bubbleSort();	
		display(output);
	}
	
	public void display(int[] arr){
		for(int i = 0 ; i<arr.length ; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	
}