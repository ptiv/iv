package com.prog.lafore;

/**
 * 
 * Find all the anagrams of  a word using recursion
 * @author ptemkar
 * @date 07/13/13
 */
public class Chp6_Anagrams {
	
	char[] arr;
	
	public Chp6_Anagrams(char[] arr){
		this.arr = arr;
	}
	
	public void printAnagrams(int length){
		
		System.out.println("recursionLevel : "  + length);
		
		if(length == 1){
			return;
		}
		int counter = length;
		
		while(counter > 0){
			
			System.out.println("'temp' before entering recursion. expect to print this after coming out from the recursive call : " + new String(arr));
			printAnagrams(length-1);			
			
			if(length == 2){
				System.out.println(new String(arr)+ "  ------   recurion level : " + length);
			}
				
			rotate(arr, arr.length-length);
			
			counter--;
		}
		
	}
	
	
	
//	public void printAnagrams(int length){
//				
//		
//		if(length == 1){
//			return;
//		}
//		int counter = length;
//		
//		while(counter > 0){
//			
//			printAnagrams(length-1);			
//			
//			if(length == 2){
//				System.out.println(new String(arr)+ "  ------   recurion level : " + length);
//			}
//				
//			rotate(arr, arr.length-length);
//			
//			counter--;
//		}		
//
//	}
	
	/**
	 * rotate the array 'arr' starting from index 'rotateFrom'
	 * 
	 * @param arr
	 * @param rotateFrom
	 * @return
	 */
	public char[] rotate(char[] arr, int rotateFrom){
		char temp = arr[rotateFrom];
		for(int i = rotateFrom ; i < arr.length-1 ; i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length - 1] = temp;
		return arr;
	}
}
