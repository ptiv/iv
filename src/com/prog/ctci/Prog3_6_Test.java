package com.prog.ctci;

import org.junit.Test;

public class Prog3_6_Test{
	
	Prog3_6 prog3_6 = new Prog3_6();
	
	@Test
	public void test_insert1element(){
		prog3_6.pushAscending(4);
		prog3_6.displayInOrderOfInsertion();
	}
	
	@Test
	public void test_insert2Elements(){
		prog3_6.pushAscending(4);
		prog3_6.pushAscending(2);
		prog3_6.displayInOrderOfInsertion();
	}
	
	@Test
	public void test_insert4Elements(){
		prog3_6.pushAscending(4);
		prog3_6.pushAscending(2);
		prog3_6.pushAscending(5);
		prog3_6.pushAscending(1);
		prog3_6.displayInOrderOfInsertion();
	}
	
}