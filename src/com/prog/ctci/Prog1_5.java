package com.prog.ctci;

public class Prog1_5 {
	
	/**
	 * my implementation
	 * str that is passed to this function is the adjusted array with additional empty places
	 * to accommodate the '%20' for every space.
	 * @param input
	 * @return
	 */
	public String replaceSpace(char[] str, int length){

		int numberOfSpaces = 0;
		for(int i=0 ; i<length ; i++ ){
			if(str[i] == ' '){
				numberOfSpaces++;
			}
		}

		int lengthAfterReplace = length + 2*numberOfSpaces;
		int tail = lengthAfterReplace - 1;

		for(int i = length-1 ; i >= 0 ; i--){
			if(str[i] != ' '){
				str[tail] = str[i];
				tail--;
			}else{
				str[tail] = '0';
				str[tail-1] = '2';
				str[tail-2] = '%';
				tail = tail -3;
			}
		}
		
		String output = new String(str);
		return output;
	}
	
	/**
	 * book solution
	 * @param str
	 * @param length
	 */
	public String ReplaceFun(char[] str, int length) {
		int spaceCount = 0, newLength, i = 0;
		for (i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		newLength = length + spaceCount * 2;
		str[newLength] = '\0';
		for (i = length - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}
		String output = new String(str);
		return output;
	}

}
