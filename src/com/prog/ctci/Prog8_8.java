package com.prog.ctci;

/*
 *  Incorrect!  canBePlaced() does not check in the diagonal direction in the the right
 *  Also, once an element can be placed in a row, you have to go all the way up to the first node and 
 *  move it to the next column 
 */


/**
 * Write an algorithm to print all ways of arranging eight queens on a chess board so that 
 * none of them share the same row, column or diagonal.
 * 
 * *** note : I have found just one path . will work on the rest later
 * 
 * @author ptemkar
 * @date 07/22/13
 *
 */
public class Prog8_8{

	int[][] matrix = new int[8][8];
	int j=0;

	//placing the nth queen
	public void placeQueen(int n){
		if(n == -1){
			return;
		}

		placeQueen(n-1);

		//which column to place in
		for(int j=0 ; j<matrix.length ; j++){
			if(canBePlaced(n, j)){
				matrix[n][j] = 1;
				break;
			}		
		}
	}

	public boolean canBePlaced(int n, int j){
		boolean canPlace = true;

		//find a '1' in the same column in any row above the current row.
		for(int i = 0; i<n; i++){					
			if(matrix[i][j]  == 1){
				canPlace = false;
				break;
			}	

			//find a 1 in any diagonal column
			int difference = n-i;
			int checkColumn = j-difference;
			if(checkColumn >= 0){
				if(matrix[i][checkColumn] == 1){
					canPlace = false;
					break;
				}
			}	
		}

		return canPlace;
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