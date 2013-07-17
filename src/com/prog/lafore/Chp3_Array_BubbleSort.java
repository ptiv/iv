package com.prog.lafore;

/**
 * @author ptemkar
 * Bubble Sort implementation
 */
 

public class Chp3_Array_BubbleSort {
	int[] input;
	
	public Chp3_Array_BubbleSort(int[] input){
		this.input = input;
	}
	
	public int[] bubbleSort(){
		int tail = input.length - 1;
		
		//loop-1
		while(tail > 0){
			//loop-2
			for(int index=0 ; index < tail ; index++){
				swap(index, index+1);
			}
			tail--;
		}
	
		return input;
	}
	
	public void swap(int index1, int index2){
		if(input[index1] > input[index2]){
			int temp;
			temp = input[index1];
			input[index1] = input[index2];
			input[index2] = temp;
		}
	}
	
}
