package com.prog.ctci;

public class Prog1_4 {
	public boolean areAnagrams(String s1, String s2){
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		int[] frequencyArray = new int[256];

		//Set all frequencies to 0
		for(int i=0 ; i<256 ; i++){
			frequencyArray[i] = 0;
		}

		//now go through c1 and each time you encounter a character, increase it's frequency in frequencyArray.
		for(int i=0 ; i<c1.length ; i++){
			int asciiValue = c1[i];
			frequencyArray[asciiValue]++;
		}

		//now go through c2 and each time you encounter a character, decrease it's frequency in frequencyArray.
		for(int i=0 ; i<c2.length ; i++)	{
			int asciiValue = c2[i];
			frequencyArray[asciiValue]--;
		}

		//go through frequencyArray. check for the values in the array. if they're all 0, then that means that 
		//the input strings are anagrams.
		for(int i=0 ; i<256 ; i++){
			if(frequencyArray[i] != 0 ){
				return false;
			}
		}
		return true;
	}
}
