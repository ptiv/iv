package com.prog.ctci;

public class Prog1_3 {
	
	/**
	 * my solution
	 * @param inputString
	 * @return
	 */
	public char[] removeDuplicates(String inputString) {
		char[] str = inputString.toCharArray();
		if(str == null)
			return null;
		if(str.length == 1)
			return str;
		for(int i=1 ; i<str.length ; i++ ){
			//If you reach characters which are 0 (empty), that means you've reached the end, just break the loop
			if(str[i] == 0){
				break;
			}
			for(int j=0 ; j<i ; j++){
				if(str[i] == str[j]){
					//System.out.println(str[i] + " is a duplicate at position - " + i);
					//move all the characters to the right of i one position left and put 0 in the last position in the array
					for(int k=i ; k<str.length-1 ; k++){
						str[k] = str[k+1];
					}
					str[str.length-1] = 0;
					//because you moved all the characters one position left, subtract 1 from i so that the new character at i will also be checked for duplicates.
					i = i-1;
					break;
				}
			}
		}
		
		return str;
	}  
	
	/**
	 * My solution with an additional array
	 * @param inputString
	 * @return
	 */
	public char[] removeDuplicatesWithAdditionalArray(String inputString) {
		char[] inputArray = inputString.toCharArray();
		char[] returnArray = new char[256];
		int returnArrayTail = 0;

		if(inputArray == null)
			return null;
		if(inputArray.length == 1)
			return inputArray;

		boolean[] asciiArray = new boolean[256];
		
		for(int i=0 ; i<inputArray.length ; i++ ){
			int asciiNumber = inputArray[i];
			if(asciiArray[asciiNumber] == true){
				//System.out.println(" The character : " + inputArray[i] + " at position : " + i + " is duplicate.");			
			}else{
				asciiArray[asciiNumber] = true;
				returnArray[returnArrayTail] = inputArray[i];
				returnArrayTail ++;
			}
		}
		
		return returnArray;
	}
	
	/**
	 * solution 2 from the book
	 * @param str
	 */
	public char[] removeDuplicatesEff(String inputString) {
		char[] str = inputString.toCharArray();
		if (str == null) return str;
		int len = str.length;
		if (len < 2) return str;

		boolean[] hit = new boolean[256];
		for (int i = 0; i < 256; ++i) {
			hit[i] = false;
		}
		hit[str[0]] = true;

		int tail = 1;
		for (int i = 1; i < len; ++i) {
			if (!hit[str[i]]) {
				str[tail] = str[i];
				++tail;
				hit[str[i]] = true;
			}
		}
		str[tail] = 0;
		
		return str;
	}
	
}