package com.prog.ctci;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a method to compute all permutations of a string.
 * 
 * @author ptemkar
 * @date 07/20/13
 */
public class Prog8_4 {

	char[] arr;
	List<String> anagrams = new ArrayList<String>();
	
	public Prog8_4(char[] arr){
		this.arr = arr;
	}
	
	public void anagrams(char[] arr, int n){
		if(n == arr.length-1){
			anagrams.add(Character.toString(arr[n]));
			return;
		}
		anagrams(arr, n+1);
		insertCharInAllStrings(arr[n]);
	}
	
	public void insertCharInAllStrings(char c){
		List<String> tempList = new ArrayList<String>();
		for(String str : anagrams){
			StringBuffer strBuf = new StringBuffer(str);
			List<String> modifedStringList = insertAtEveryPosition(strBuf, c);
			tempList.addAll(modifedStringList);
		}
		anagrams.clear();
		anagrams.addAll(tempList);
	}
	
	/**
	 * Takes a character and inserts it into every position in a string
	 * 
	 * @param strBuf
	 * @param c
	 * @return
	 */
	public List<String> insertAtEveryPosition(StringBuffer strBuf, char c){
		List<String> charInsertedList = new ArrayList<String>();
		for(int i=0; i <= strBuf.length() ; i++){
			StringBuffer tempStrBuf = new StringBuffer(strBuf);
			tempStrBuf.insert(i,c);
			String tempStr = tempStrBuf.toString();
			charInsertedList.add(tempStr);
		}
		return charInsertedList;
	}
	
}
