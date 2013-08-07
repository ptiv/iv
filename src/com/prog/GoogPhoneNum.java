package com.prog;

import java.util.ArrayList;
import java.util.List;

/**
 * Given any array of numbers, generate all the possible n-digit numbers.
 * 
 *  
 * 
 */
public class GoogPhoneNum {
	
	int[] arr;
	List<String> numbers = new ArrayList<String>();
	
	public GoogPhoneNum(int[] arr){
		this.arr = arr;
	}
	
	/**
	 * implementation 1
	 * @param length
	 */
	public void generateNumbers1(int length){
		
		List<String> tempList = new ArrayList<String>();
		
		if(length == 0)
			return;
		
		generateNumbers1(length-1);
		
		for(int i=0 ; i< arr.length ; i++){
			
			if(numbers.isEmpty()){
				String result = "" + Integer.toString(arr[i]);
				tempList.add(result);
			}else{
				for(String number : numbers){
					String result = number + Integer.toString(arr[i]);
					tempList.add(result);
				}	
			}
					
		}
		
		numbers.clear();
		numbers.addAll(tempList);
		
	}
	
	/**
	 * implementation 2
	 */
	public List<String> generateNumbers2(int length){
		List<String> result = new ArrayList<String>();
		
		if(length == 1){
			for(int i : arr){
				result.add(Integer.toString(i));
			}
		}else{
			List<String> numList = generateNumbers2(length-1);
			
			for(String number : numList){
				for(int i=0 ; i< arr.length ; i++){
					String entry = Integer.toString(arr[i]) + number;
					result.add(entry);
				}
			}
		}
		
		return result;
	}
	
}
