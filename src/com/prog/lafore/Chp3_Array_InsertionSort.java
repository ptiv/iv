package com.prog.lafore;

/**
 * Implementation of Insertion Sort
 * @date 06/19/13
 * @author ptemkar
 *
 */
public class Chp3_Array_InsertionSort{

	int[] input;

	public Chp3_Array_InsertionSort(int[] input){
		this.input = input;
	}
	
	public int[] insertionSort(){
		
		//loop-1
		for(int i=1 ; i<input.length ; i++){
			int temp = input[i];
			
			//loop-2 for shifting elements to the right
			for(int j=i-1; j>=0; j--){
				if(temp < input[j]){
					//shift it one position to the right
					input[j+1] = input[j];
					input[j] = temp;
				}else{
					input[j+1] = temp;
					break;
				}
			}
				
		}
		return input;
		
	};
	
	
	
}