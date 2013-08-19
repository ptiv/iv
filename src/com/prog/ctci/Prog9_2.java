package com.prog.ctci;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Write a method to sort an array of strings so that all the anagrams are next to each other.
 * 
 * @author ptemkar
 * @date 08/17/13
 */
public class Prog9_2 {
	
	String[] strArr =  new String[6];
	
	public Prog9_2(String[] strArr){
		this.strArr = strArr;
	}
	
	//just to test
	public void sort(){
		Arrays.sort(this.strArr);
	}
	
	
	public void anagramSort(){
		Arrays.sort(this.strArr, new CustomComparator());
	}
	
	class CustomComparator implements Comparator<String>{

		public String sortCharsAlphabeticallyWithinString(String str){
			String result = new String();
			char[] chrArr = str.toCharArray();
			Arrays.sort(chrArr);
			
			result = new String(chrArr);
			
			return result;
		}
		
		@Override
		public int compare(String arg0, String arg1) {
			String sortedArg0 = sortCharsAlphabeticallyWithinString(arg0);
			String sortedArg1 = sortCharsAlphabeticallyWithinString(arg1);
			
			return sortedArg0.compareTo(sortedArg1);
		}
		
	}

	
}

