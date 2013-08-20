package com.prog.ctci;

/**
 * 9.3 Given a sorted array of n integers that has been
 * rotated an unknown number of times, give an O(log n) algorithm that 
 * finds an element in the array. 
 * You may assume that the array was originally sorted in increasing order.
 * 
 * @author ptemkar
 * @date 08/19/13
 */
public class Prog9_3{
	int[] arr;

	public Prog9_3(int[] arr){
		this.arr = arr;
	}
	
	public int binarySearchOnRotatedArray(int searchKey, int start,int end, int searchLevel){
		
		int midPoint = (start+end)/2;
		int position;
		
		if(searchKey == arr[midPoint]){
			System.out.println("found " + searchKey + " at position " + midPoint + " in " + searchLevel + " searches");
			return midPoint;
		}
		if(start>end){
			return -1;
		}
		
		if(arr[midPoint] > arr[start]){
			if(arr[start] <= searchKey && searchKey < arr[midPoint]){
				position = binarySearchOnRotatedArray(searchKey, start, midPoint-1, searchLevel+1);
			}else{
				position = binarySearchOnRotatedArray(searchKey, midPoint+1, end, searchLevel+1);
			}
		}else{
			if(arr[midPoint] < searchKey && searchKey <= arr[end]){
				position = binarySearchOnRotatedArray(searchKey, midPoint+1, end, searchLevel+1);
			}else{
				position = binarySearchOnRotatedArray(searchKey, start, midPoint-1, searchLevel+1);
			}
		}
		
		return position;
		
	}
}