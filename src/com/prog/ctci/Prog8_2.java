package com.prog.ctci;

import java.util.List;

/**
 * Imagine a robot sitting on the upper left hand corner of an NxN grid. 
 * The robot can only move in two directions: right and down. 
 * How many possible paths are there for the robot?
 * 
 * @author ptemkar
 * @date 07/21/13
 */
public class Prog8_2{

	//Means it's a (length x length) matrix
	int length;
	
	int pathCount = 0;
	
	public Prog8_2(int length){
		this.length = length;
	}
	
	//initially pass x = 0, y = 0
	public void traverseMatrix(List<String> path, int x, int y){
		
		String point = " x : " + x + " , y : " + y;
		path.add(point);
		int currentPathLength = path.size();
		
		//base case
		if(x == this.length-1 && y == this.length-1){
			
			//print path
			System.out.println("-------      Printing Path 		-----------");
			for(String pt : path){
				System.out.println(pt);
			}
			System.out.println("------------------");
			pathCount++;
			return;
		}
	
		//If it can move right, then move right
		if(x<this.length-1){
			traverseMatrix(path, x+1, y);
			int newPathLength = path.size();
			for(int i=currentPathLength; i<newPathLength ; i++){
				path.remove(i);
			}
			
		}
		
		//If it can move down, then move down
		if(y<this.length-1){
			traverseMatrix(path, x, y+1);
			int newPathLength = path.size();
			for(int i=currentPathLength; i<newPathLength ; i++){
				path.remove(i);
			}
		}
		
	}

}