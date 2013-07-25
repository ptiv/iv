package com.prog.lafore;

/**
 * Implementation of QuickSort (recursion)
 * 
 * 
 * @author ptemkar
 * @date 07/23/13
 */
public class Chp7_QuickSort {
	int[] arr;
	
	public Chp7_QuickSort(int[] arr){
		this.arr = arr;
	}
	
	public void recursiveQuickSort(int left, int right){
		
		//base case
		if(right - left <= 0){
			return;
		}
		else{
			int pivot = arr[right];
			int partition = partitionIt(left, right, pivot);
			recursiveQuickSort(left, partition-1);
			recursiveQuickSort(partition+1, right);
		}
	}
	
	public int partitionIt(int left, int right, int pivot){
		int leftPtr = left-1;
		int rightPtr = right;
		
		while(true){
		
			while(leftPtr < right && arr[++leftPtr] < pivot)
				;
			
			while(rightPtr > left && arr[--rightPtr] > pivot)
				;
			
			if(leftPtr >= rightPtr)
				break;
			else
				swap(leftPtr, rightPtr);
			
		}
		//right is the pivot. 
		swap(leftPtr, right);
		return leftPtr;	
			
	}
	
	private void swap(int leftPtr, int rightPtr){
		int temp = arr[leftPtr];
		arr[leftPtr] = arr[rightPtr];
		arr[rightPtr] = temp;
	}
	
	public void displayArray(){
		for(int element : arr){
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
