package com.prog;

import java.util.ArrayList;
import java.util.List;
/**
 * Imagine a robot sitting on the upper left hand corner of an NxN grid. 
 * The robot can only move in two directions: right and down. 
 * How many possible paths are there for the robot?
 * @author sameshah
 *
 */
public class PathFromOneCellToAnother {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		printPaths(0,0,3,3,new ArrayList<String>());

	}
	
	public static void printPaths(int i, int j, int k, int l, List<String> path) {
		if(i==k && j==l) {
			pathIndex++;
			System.out.println("Path:-----------"+ pathIndex);
			for(int m=0;m<path.size();m++) {
				System.out.println(path.get(m));
			}
			return;
		}
		List<String> path1 = new ArrayList<String>();
		List<String> path2 = new ArrayList<String>();
		if(i<k) {
			path1.addAll(path);
			path1.add("Cell"+i+""+j+" to " + "Cell"+(i+1)+""+j);
			printPaths(i+1, j, k, l,path1);
		}
		if(j<l) {
			path2.addAll(path);
			path2.add("Cell"+i+""+j+" to " + "Cell"+i+""+(j+1));
			printPaths(i,j+1,k,l,path2);
		}
		
		
		
	}
	
	public static int pathIndex = 0;

}
