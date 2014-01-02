package com.prog.ctci;

/*

[ÒatÓ, ÒÓ, ÒÓ, ÒÓ, ÒballÓ, ÒÓ, ÒÓ, ÒcarÓ, ÒÓ, ÒÓ, ÒdadÓ, ÒÓ, ÒÓ]

n=13

start=0, end=12 
1)midPoint =  0+12/2 = 6
set a temporary index 'pointer' to 1. look to your left [midPoint-pointer] till you find a 
non-empty array-element
to determine in which direction to continue Binary Search


*/
/**
 * Given a sorted array of strings which is interspersed with empty strings, 
 * write a meth- od to find the location of a given string.
 * 
 * Example: find ÒballÓ in [ÒatÓ, ÒÓ, ÒÓ, ÒÓ, ÒballÓ, ÒÓ, ÒÓ, ÒcarÓ, ÒÓ, ÒÓ, ÒdadÓ, ÒÓ, ÒÓ] will return 4 
 * Example: find ÒballcarÓ in [ÒatÓ, ÒÓ, ÒÓ, ÒÓ, ÒÓ, ÒballÓ, ÒcarÓ, ÒÓ, ÒÓ, ÒdadÓ, ÒÓ, ÒÓ] will return -1
 * 
 * @author ptemkar
 */
public class Prog9_5{

	String[] arr;
	
	public Prog9_5(String[] arr){
		this.arr = arr;
	}
	
	public int binarySearchWithEmptyStrings(String searchKey, int start, int end, int numberOfSteps){
		
		int midPoint = (start+end)/2;
		
		if(start > end){
			return -1;
		}else if((arr[midPoint]).equals(searchKey)){
			System.out.println("Found after " + numberOfSteps + " steps");
			return midPoint;
		}else{
			int leftPtr = midPoint - 1;
			
			//keep moving left till you find a non-empty String
			while((arr[leftPtr]).equals("")){
				leftPtr--;
			}
			
			//If you have not gone beyond the left-most end of the array
			if(leftPtr != -1){
				
				if( (arr[leftPtr]).compareTo(searchKey) < 0 ){
					return binarySearchWithEmptyStrings(searchKey, midPoint+1, end, numberOfSteps+1);
				}else{
					return binarySearchWithEmptyStrings(searchKey, start, leftPtr-1, numberOfSteps+1);
				}
				
			}else{
				//if you have reached the left-most end, search in the right half of the array
				return binarySearchWithEmptyStrings(searchKey, midPoint+1, end, numberOfSteps+1);
			}
			
		}
		
	}
	
}