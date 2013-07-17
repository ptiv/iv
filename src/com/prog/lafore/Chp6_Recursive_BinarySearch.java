package com.prog.lafore;

/**
 * Recursive Binary Search
 * 
 * @author ptemkar
 * @date 07/14/13
 */
public class Chp6_Recursive_BinarySearch {

	public int find(int[] arr, int searchKey){
		int lower = 0;
		int upper = arr.length - 1;
		int position = binarySearchRecursive(arr, searchKey, lower, upper);
		return position;
	}

	public int binarySearchRecursive(int[] arr, int searchKey, int lower, int upper){

		int midPoint = (upper + lower)/2; 
		if(searchKey == arr[midPoint]){
			return midPoint;
		}else if(lower > upper){
			return arr.length;
		}else if(searchKey < arr[midPoint]){
			upper = midPoint-1;
		}else{
			lower = midPoint + 1;
		}
		int position = binarySearchRecursive(arr, searchKey, lower, upper);
		return position;
	}

	/**
	 * lafore's solution
	 */
	//	public int binarySearchRecursive(int[] a, int searchKey, int lowerBound, int upperBound){
	//		int curIn;
	//
	//		curIn = (lowerBound + upperBound ) / 2;
	//		if(a[curIn]==searchKey)
	//			return curIn;              // found it
	//		else if(lowerBound > upperBound)
	//			return a.length;             // can't find it
	//		else                          // divide range
	//		{
	//			if(a[curIn] < searchKey)   // it's in upper half
	//				return binarySearchRecursive(a, searchKey, curIn+1, upperBound);
	//			else                       // it's in lower half
	//				return binarySearchRecursive(a, searchKey, lowerBound, curIn-1);
	//		}  
	//	}
}
