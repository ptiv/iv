package com.prog.lafore;

import java.util.ArrayList;
import java.util.List;

/**
 * Recursive implementation of the Knapsack problem. Pg 306, Lafore
 * 
 * Not very efficient though because the same weight combination could be evaluated multiple times
 * 
 * @author ptemkar
 * @date 07/19/13
 */
public class Chp6_Recursive_Knapsack {

	int[] input;

	Sack sack = new Sack();

	public Chp6_Recursive_Knapsack(int[] input, int capacity){
		this.input = input;
		this.sack.capacity = capacity;
	}

	public void RecursiveKnapsack(int inputIndex,  int remainingWeightToFill){

		if(sack.isSackFull()){
			System.out.println("The sack was full here!");
			sack.displaySackContents();
			return;
		}
		
		if(inputIndex == input.length){
			return;
		}
	
		
		for(int i = inputIndex; i<input.length; i++){

			int inputWeight = input[i];

			remainingWeightToFill = sack.capacity - (sack.sackWeight+inputWeight);

			if(remainingWeightToFill >= 0){
				sack.addToSack(inputWeight);
			}
			RecursiveKnapsack(i+1, remainingWeightToFill);
			if(this.sack.sackList.contains(new Integer(input[i]))){
				this.sack.removeFromSack(input[i]);
			}	
		
		}
		
	}

}

class Sack{
	List<Integer> sackList = new ArrayList<Integer>();
	int sackWeight;
	int capacity;

	public void addToSack(int weight){
		sackWeight = sackWeight + weight;
		sackList.add(new Integer(weight));
	}

	public void removeFromSack(int weight){
		sackWeight = sackWeight - weight;
		sackList.remove(new Integer(weight));
	}

	public boolean isSackFull(){
		boolean sackFull = false;
		if(getRemainingSackSpace() == 0){
			sackFull =  true;
		}
		return sackFull;
	}

	public int getRemainingSackSpace(){
		return capacity - sackWeight;
	}
	
	public void displaySackContents(){
		for(int weight : sackList){
			System.out.print(weight + " ");
		}
		System.out.println("-------------------------");
	}

}
