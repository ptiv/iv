package com.prog;

import java.util.HashMap;

public class SumArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 16;
		//int[] testArray = {2,1,9,15,8,3,12,7,11};
		int[] testArray = {2,1,9,8,8,3,12,7,11};
		//Store the actual number and the position
		//Map lookup although not guaranteed O(1) typically way less than O(n)
		HashMap<Integer, Integer> testMap = new HashMap<Integer, Integer>();

		for(int i=0; i<testArray.length; i++){
			int toFind = sum - testArray[i];
			if(testMap.get(toFind) != null){
				System.out.print("The two numbers are : " + testArray[i] + " at index " + i + " and " + toFind + " at index " + testMap.get(toFind));
				break;
			}
			testMap.put(testArray[i], i);
		}
	}

}
