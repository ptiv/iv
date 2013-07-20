package com.prog.ctci;

/**
 * 
 * Write a method that returns all subsets of a set.
 * 
 * @author ptemkar
 * @date 07/19/13
 */
public class Prog8_3 {
	public void print_all_subsets_recursive(char[] arr, int index){
		for(int i=index; i<arr.length; i++){
			
			print_all_subsets_recursive(arr, i+1);
			
			System.out.print(arr[i] + " ");
			if(i == arr.length-1){
				System.out.println();
			}
		}
		
		
	}
}
