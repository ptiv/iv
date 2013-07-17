package com.prog.lafore;

import java.util.Stack;

/**
 * Towers Of Hanoi using recursion
 * 
 * @author ptemkar
 * @date 07/15/13
 */
public class Chp6_Recursive_TowersOfHanoi {
	Tower source = new Tower("source");
	Tower spare = new Tower("spare");
	Tower destination = new Tower("destination");
	
	public Chp6_Recursive_TowersOfHanoi(Stack<Integer> diskStack){
		source.diskStack = diskStack;
	}
	
	public void displayAllTowers(){
		source.displayTower();
		spare.displayTower();
		destination.displayTower();
		System.out.println("----------------------");
	}
	
	public void MoveDiskStack(int diskNumber, Tower source, Tower destination, Tower spare){
		if(diskNumber == 1){
			moveOneDiskFromSourceToDestination(source, destination);
		}else{
			MoveDiskStack(diskNumber-1, source, spare, destination);
			displayAllTowers();
			moveOneDiskFromSourceToDestination(source, destination);
			displayAllTowers();
			MoveDiskStack(diskNumber-1, spare, destination, source);
			displayAllTowers();
		}
	}
	
	public void moveOneDiskFromSourceToDestination(Tower source, Tower destination){
		int disk = source.diskStack.pop();
		destination.diskStack.push(disk);
	}
}

class Tower{
	Stack<Integer> diskStack = new Stack<Integer>();
	String towerName = new String();
	
	public Tower(String towerName){
		this.towerName = towerName;
	}
	
	public void displayTower(){
		System.out.print(towerName + ": ");
		for(int i=0 ; i < diskStack.size() ; i++){
			System.out.print(diskStack.get(i) + " ");
		}
		System.out.println();
	}
}
