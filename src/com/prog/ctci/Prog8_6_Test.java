package com.prog.ctci;

import org.junit.Test;


public class Prog8_6_Test{
	
	@Test
	public void test_paint_emptyMatrix(){
		
		int[][] matrix = new int[3][3];
		Prog8_6 prog8_6 = new Prog8_6(matrix);
		System.out.println("\n Before painting an empty 3x3 matrix");
		prog8_6.displayMatrix();
		
		prog8_6.paint(1,1, 2);
		
		System.out.println("After painting an empty matrix");
		prog8_6.displayMatrix();
		
	}
	
	@Test
	public void test_paint_withOneVerticalLine(){
		int[][] matrix = new int[8][8];
		Prog8_6 prog8_6 = new Prog8_6(matrix);
		for (int i=0; i<8; i++){
			matrix[3][i] = 1;
		}
		
		System.out.println("\n Before painting an empty 8x8 matrix with a horizontal line");
		prog8_6.displayMatrix();
		
		
		
		prog8_6.paint(5,5, 2);
		
		System.out.println("After painting an empty matrix");
		prog8_6.displayMatrix();
		
		
	}
	
	@Test
	public void test_paint_withAPartitioningLine(){
		int[][] matrix = new int[8][8];
		Prog8_6 prog8_6 = new Prog8_6(matrix);
		for (int i=0; i<5; i++){
			matrix[4][i] = 1;
		}
		for(int i=5; i<8 ; i++){
			matrix[i][i] = 1;
		}
		
		System.out.println("\n Before painting an empty 8x8 matrix with a horizontal line");
		prog8_6.displayMatrix();
		
		
		
		prog8_6.paint(2,7, 2);
		
		System.out.println("After painting an empty matrix");
		prog8_6.displayMatrix();
		
		
	}
	
	
}