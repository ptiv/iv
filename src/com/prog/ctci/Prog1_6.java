package com.prog.ctci;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 * 
 * [11][12][13][14]
 * [15][16][17][18]
 * [19][20][21][22]
 * [23][24][25][26]
 * Becomes:
 *
 * [23][19][15][11]
 * [24][20][16][12]
 * [25][21][17][13]
 * [26][22][18][14]
 *
 * @date 06/19/13
 * @author ptemkar
 *
 */

/*
a[0][0]	a[0][1] a[0][2] a[0][3]	
a[1][0] a[1][1] a[1][2] a[1][3]
a[2][0] a[2][1] a[2][2] a[2][3]
a[3][0] a[3][1] a[3][2] a[3][3]


a[3][0] a[2][0] a[1][0] a[0][0]
a[3][1] a[2][1] a[1][1] a[0][1]
a[3][2] a[2][2] a[1][2] a[0][2]
a[3][3] a[2][3] a[1][3] a[0][3]

inner-loop-1
temp = a[0][0];
a[0][0] = a[3][0];
a[3][0] = a[3][3];
a[3][3] = a[0][3];
a[0][3] = temp;

inner-loop-2
temp = a[0][1];
a[0][1] = a[2][0];
a[2][0] = a[3][2];
a[3][2] = a[1][3];
a[1][3] = temp;

inner-loop-3
temp = a[0][2];
a[0][2] = a[1][0];
a[1][0] = a[3][1];
a[3][1] = a[2][3];
a[2][3] = temp;

inner-loop-4
temp = a[0][3];
a[0][3] = a[0][0];
a[0][0] = a[3][0];
a[3][0] = a[3][3];
a[3][3] = temp;

*/
public class Prog1_6 {
	int[][] doubleArray = new int[4][4];
	
	public Prog1_6(int[][] doubleArray){
		this.doubleArray = doubleArray;
	}

	public int[][] rotate(int[][] a){
		int n = a.length; 
		int temp;
		
		for(int i=0 ; i<n/2 ; i++){
		//int i=0;	
			for(int j=i ; j<n-i-1 ; j++){
				temp = a[i][j]; //step 1
				a[i][j] = a[n-j-1][i]; //step 2
				a[n-j-1][i] = a[n-i-1][n-j-1]; //step 3
				a[n-i-1][n-j-1] = a[j][n-i-1]; //step 4
				a[j][n-i-1] = temp; //step 5
			}
			
		}
			
		return a;
	}
	
	
	
}
