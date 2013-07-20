package com.prog.ctci;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Write a method that returns all subsets of a set.
 * 
 * refer to the algorithm from here : http://911programming.wordpress.com/2010/06/07/java-extracting-all-subsets-of-a-set-using-arraylist/
 * 
 * 
 * @author ptemkar
 * @date 07/19/13
 */
public class Prog8_3 {
	
	List<String> allSubsets = new ArrayList<String>();
	
	public List<String> print_all_subsets_recursive(char[] arr, int index){
		
		if(index == arr.length-1){
			allSubsets.add("");
			allSubsets.add(String.valueOf(arr[index]));
			return allSubsets;
		}
		
		unionOf(arr[index], print_all_subsets_recursive(arr, index+1));
		
		return allSubsets;
		
		
	}
	
	public void displaySubsets(){
		for(String subset : allSubsets){
			System.out.println(subset);
		}
	}
	
	public void unionOf(char newChar, List<String> allSubsets){
		List<String> newSubsets = new ArrayList<String>();
		
		for(String subset : allSubsets){
			newSubsets.add(subset + newChar);
		}
		
		for(String newSubset : newSubsets){
			allSubsets.add(newSubset);
		}
		
	}
	
}
