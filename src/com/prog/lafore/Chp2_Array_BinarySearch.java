package com.prog.lafore;

/**
 * Binary search on an array
 * Recursive is better see 'Chp6_Recursive_BinarySearch.java'
 * 
 * @author ptemkar
 *
 */
public class Chp2_Array_BinarySearch {
	
	public int findPositionUsingBinarySearch(int[] input, int searchKey){
		
		
		int lowerEnd = 0;
		int higherEnd = input.length-1;
		int pointer = higherEnd - lowerEnd;
		
		int numberOfSteps = 0;
		boolean cantFind = false;

		while(true){
			numberOfSteps++;
			if(input[pointer] == searchKey){
				break;
			}else if(lowerEnd >= higherEnd){
				cantFind = true;
				System.out.println(" Can't find the element");
				break;
			}else{
				if(searchKey < input[pointer]){
					higherEnd = pointer;
					pointer = (higherEnd - lowerEnd)/2;
				}else{
					lowerEnd = pointer;
					pointer = pointer + (higherEnd - lowerEnd)/2;
				}
			}
		}
		if(!cantFind){
			System.out.println("Found in : " + numberOfSteps + " steps.");
		}
		return pointer;
	}
	
}
