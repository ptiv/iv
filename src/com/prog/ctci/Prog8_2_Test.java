package com.prog.ctci;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Prog8_2_Test {
	
	@Test
	public void test_traverseMatrix_2x2(){
		System.out.println("2x2 matrix : ");
		int length = 2;
		Prog8_2 prog8_2 = new Prog8_2(length);
		List<String> path = new ArrayList<String>();
		
		prog8_2.traverseMatrix(path, 0, 0);
		System.out.println("Path count for a 2x2 matrix : " + prog8_2.pathCount);
	}
	
	@Test
	public void test_traverseMatrix_3x3(){
		System.out.println("2x2 matrix : ");
		int length = 3;
		Prog8_2 prog8_2 = new Prog8_2(length);
		List<String> path = new ArrayList<String>();
		
		prog8_2.traverseMatrix(path, 0, 0);
		System.out.println("Path count for a 3x3 matrix : " + prog8_2.pathCount);
	}

}
