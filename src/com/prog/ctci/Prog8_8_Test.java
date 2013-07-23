package com.prog.ctci;

import org.junit.Test;

public class Prog8_8_Test {
	
	@Test
	public void test_placeQueen(){
		Prog8_8 prog8_8 = new Prog8_8();
		prog8_8.placeQueen(7);
		prog8_8.displayMatrix();
	}
}
