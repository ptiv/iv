package com.prog.ctci;

import static org.junit.Assert.*;
import org.junit.Test;

/*
2	2
54	4
4	4
21	7
64	7
7	7
*/
public class Prog3_2_Test{

	Prog3_2 prog3_2 = new Prog3_2();
	
	@Test
	public void test_1Elem(){
		prog3_2.push(7);
		assertEquals(7, prog3_2.getMinimum());
	}
	
	@Test
	public void test_3Elems(){
		prog3_2.push(7);
		prog3_2.push(62);
		prog3_2.push(21);
		assertEquals(7, prog3_2.getMinimum());
	}
	
	@Test
	public void test_5Elems(){
		prog3_2.push(7);
		prog3_2.push(62);
		prog3_2.push(21);
		prog3_2.push(4);
		prog3_2.push(54);
		assertEquals(4, prog3_2.getMinimum());
	}
	
	@Test
	public void test_6Elems(){
		prog3_2.push(7);
		prog3_2.push(62);
		prog3_2.push(21);
		prog3_2.push(4);
		prog3_2.push(54);
		prog3_2.push(2);
		assertEquals(2, prog3_2.getMinimum());
	}
	
	@Test
	public void test_MinimumAfterPop(){
		prog3_2.push(7);
		prog3_2.push(62);
		prog3_2.push(21);
		prog3_2.push(4);
		prog3_2.push(54);
		prog3_2.push(2);
		
		assertEquals(2, prog3_2.getMinimum());
		
		prog3_2.getStack().pop();
		
		assertEquals(4, prog3_2.getMinimum());
	}
	
}

