package com.prog.lafore;

/**
 * Implementation of Selection Sort
 * @date 06/18/13
 * @author ptemkar
 *
 */
public class Chp3_Array_SelectionSort{

	int[] input;
	
	public Chp3_Array_SelectionSort(int[] input){
		this.input = input;
	}
	
	public int[] selectionSort(){
		//loop-1
		for(int i = 0; i < input.length ; i++){
									//loop-2
			int indexOfMinimum = findIndexOfMinimum(i, input.length-1);
			swap(i, indexOfMinimum);
		}
		return input;
	}
	
	//In the subset (defined by 'start' and 'end' of the array find the index of the minimum value
	public int findIndexOfMinimum(int start, int end){
		int indexOfMinimum = start;
		for(int i = start+1; i <= end ; i++){
			if(input[indexOfMinimum] > input[i]){
				//swap
				indexOfMinimum = i;
			}
		}
		return indexOfMinimum;
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