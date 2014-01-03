package com.prog.ctci;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for Prog9_5.
 *
 */
public class Prog9_5_Test {
	private String[] arr = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
	private Prog9_5 prog9_5;

	@Before
	public void setUp(){
		prog9_5 = new Prog9_5(arr);
	}
	
	@Test
	public void testBinarySearchWithEmptyStrings(){
		int pos1 = prog9_5.binarySearchWithEmptyStrings("ball", 0, arr.length-1, 1);
		assertEquals(4, pos1);
		
		int pos2 = prog9_5.binarySearchWithEmptyStrings("at", 0, arr.length-1, 1);
		assertEquals(0, pos2);
	}
	
	@After
	public void tearDown(){
		arr = null;
		prog9_5 = null;
	}
}
