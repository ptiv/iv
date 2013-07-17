package com.prog.ctci;

import org.junit.Test;

/**
 * 
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
 * @author ptemkar
 *
 */
public class Prog1_6_Test {

	@Test
	public void test_rotateDoubleArray(){
		int[][] doubleArray = { 
								{1,2,3,4},
								{5,6,7,8},
								{9,0,1,2},
								{3,4,5,6}
							};
		display(doubleArray);
		Prog1_6 prog1_6 = new Prog1_6(doubleArray);
		prog1_6.rotate(doubleArray);
		System.out.println();
		display(doubleArray);
	}
	
	public void display(int[][] doubleArray){
		for(int i=0; i<4 ; i++){
			System.out.print("{");
			for(int j=0 ; j<4 ; j++){
				System.out.print(doubleArray[i][j]);
				if(j != 3){
					System.out.print(",");
				}
			}
			System.out.print("}\n");
		}
	}
}
