package com.prog.lafore;

/**
 * 
 * Raising a number with loop and recursion
 * 
 * @author ptemkar
 * @date 07/12/13
 */
public class Chp6_RasingANumber {
	int raiseWithLoop(int number, int power){
		if(power == 0){
			return 1;
		}else if(power == 1){
			return number;
		}else{
			int result = number;
			for(int i=2 ; i<=power ; i++){
				result = number*result;
			}
			return result;
		}

	}
	
	int raiseWithRecursion(int number, int power){
		if(power == 0){
			return 1;
		}
		if(power == 1){
			return number;
		}else{
			return number*raiseWithRecursion(number, power - 1);
		}
	}
	
}
