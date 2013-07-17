package com.prog.herbert;

import java.util.ArrayList;
import java.util.List;
	
/*
 * A program that finds all of the prime numbers between 2 and 100.
 */
class H_Chp2_Q10{
	
	boolean isAPrimeNumber(int n){
		if(n==1 || n==2) return true;
		for(int i=2; i<=n/2 ; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public List<Integer> getPrimeNumberList(int start, int end){
		List<Integer> primeNumberList = new ArrayList<Integer>();
		for(int i=start+1; i<end; i++ ){
			if(isAPrimeNumber(i)){
				primeNumberList.add(new Integer(i));
			}
		}
		return primeNumberList;
	}
	
	public void displayPrimeNumberList(List<Integer> primeNumberList){
		for(Integer primeNumber : primeNumberList){
			System.out.println(primeNumber);
		}
	}
	
}