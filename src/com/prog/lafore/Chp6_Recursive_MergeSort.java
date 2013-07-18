package com.prog.lafore;

/**
 * 
 * Recursive implementation of Merge Sort
 * 
 * @author ptemkar
 * @date 07/18/13
 */
public class Chp6_Recursive_MergeSort {
	int[] arr = new int[10];
	
	public Chp6_Recursive_MergeSort(int[] arr){
		this.arr = arr;
	}
	
	/**
	 * will be called on the object of the class
	 */
	public void sort(){
		int lowerBound = 0;
		int upperBound = arr.length-1;
		recursiveMergeSort(lowerBound, upperBound);
	}
	
	/**
	 * main recursive function
	 * 
	 * @param lowerBound
	 * @param upperBound
	 */
	public void recursiveMergeSort(int lowerBound, int upperBound){
		if(lowerBound == upperBound){
			return;
		}
		int midPoint = (lowerBound + upperBound)/2;
		
		recursiveMergeSort(lowerBound, midPoint);
		recursiveMergeSort(midPoint+1, upperBound);
		
		mergeOperation(lowerBound, midPoint+1, upperBound);
	}

	/**
	 * Implementation of the Merge operation which will be called by the main recursive function.
	 * Note that the sub-arrays have to be sorted amongst themselves.
	 * 
	 * @param lowPtr
	 * @param highPtr
	 * @param upperBound
	 */
	public void mergeOperation(int lowPtr, int highPtr, int upperBound){

		int lowerBound = lowPtr;
		int[] workSpace = new int[10];
		int midPoint = highPtr-1;
		int j=0;

		while(lowPtr <= midPoint && highPtr <= upperBound){
			if(arr[lowPtr] < arr[highPtr]){
				workSpace[j++] = arr[lowPtr++];
			}else{
				workSpace[j++] = arr[highPtr++];
			}
		}

		//For the remaining ones in the lower array
		while(lowPtr <= midPoint){
			workSpace[j++] = arr[lowPtr++];
		}

		//For the remaining ones in the upper array
		while(highPtr <= upperBound){
			workSpace[j++] = arr[highPtr++];
		}

		//Transfer from the workSpace to the main array
		for(int i=0 ; i<j ; i++){
			arr[lowerBound++] = workSpace[i];
		}

	}
}
