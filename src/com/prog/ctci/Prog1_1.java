package com.prog.ctci;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author ptemkar
 *
 */
public class Prog1_1 {
	
	public static void main(String[] args){

		String input = "abdcc% ^12ggt";
		
		for(int i = 0; i<input.length(); i++ ){
			//http://docs.oracle.com/javase/6/docs/api/java/lang/String.html#substring(int, int)
			String preSubstring = input.substring(0,i);
			if(preSubstring.indexOf(input.charAt(i)) != -1){
				System.out.println("The character : " + input.charAt(i) + " is repeated.");
				break;
			}
		}
	}
	
	/* With an additional data structure
	public static void main(String[] args){

		String input = "abdfc% ^12ggt";
		Set<Character> characterSet = new HashSet<Character>();

		for(int i=0 ; i<input.length(); i++){
			char c = input.charAt(i);
			if(characterSet.contains(new Character (c))){
				System.out.println("The character - " + c + " is duplicate.");
				break;
			}
			characterSet.add(new Character(c));
		}
	}
	*/
}
