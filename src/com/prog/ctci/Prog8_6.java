package com.prog.ctci;

/**
 * Implement the “paint fill” function that one might see on many image editing pro- grams. 
 * That is, given a screen (represented by a 2 dimensional array of Colors), 
 * a point, and a new color, fill in the surrounding area until you hit a border of that color.’
 * 
 * 
 * @author ptemkar
 * @date 07/22/13
 */
public class Prog8_6{

	int[][] matrix = new int[3][3];

	public Prog8_6(int[][] matrix){
		this.matrix = matrix;
	}

	/**
	 * The input matrix will have 0 in void spaces and 1 to indicate a solid line
	 * You can fill a color in 0. The colorNumber is input. 
	 * It could be any number aside from 0 and 1
	 * 
	 * @param i
	 * @param j
	 * @param colorNumber
	 */
	public void paint(int i, int j, int colorNumber){

		//base case. check if you have reached the boundary or the other color nice or a node that has the existing color
		if(i < 0 || j < 0 || i >= matrix.length || j >= matrix.length || matrix[i][j] == 1 || matrix[i][j] == colorNumber){
			return;
		}

		matrix[i][j] = colorNumber;

		paint(i-1, j, colorNumber);

		paint(i+1, j, colorNumber);

		paint(i, j+1, colorNumber);

		paint(i, j-1, colorNumber);


	}

	public void displayMatrix(){
		for(int i=0 ; i<matrix.length ; i++){
			for(int j=0 ; j<matrix.length ; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}