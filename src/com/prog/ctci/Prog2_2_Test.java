package com.prog.ctci;

import org.junit.Test;
import static org.junit.Assert.*;

public class Prog2_2_Test{

	@Test
	public void test_WithSingleElement(){
		Prog2_2 prog2_2 = new Prog2_2();
		prog2_2.insertFirst(7);
		Link link = prog2_2.findNthElementFromEnd(1);
		assertEquals(7, link.data);
	}
	
	@Test
	public void test_WithMultipleElementFindFirstFromEnd(){
		Prog2_2 prog2_2 = new Prog2_2();
		prog2_2.insertFirst(7);
		prog2_2.insertFirst(8);
		prog2_2.insertFirst(9);
		Link link = prog2_2.findNthElementFromEnd(1);
		assertEquals(7, link.data);
	}
	
	@Test
	public void test_WithMultipleElementFindLastFromEnd(){
		Prog2_2 prog2_2 = new Prog2_2();
		prog2_2.insertFirst(7);
		prog2_2.insertFirst(8);
		prog2_2.insertFirst(9);
		Link link = prog2_2.findNthElementFromEnd(3);
		assertEquals(9, link.data);
	}
	
	@Test
	public void test_WithMultipleElementFindSomewhereMiddle(){
		Prog2_2 prog2_2 = new Prog2_2();
		prog2_2.insertFirst(7);
		prog2_2.insertFirst(8);
		prog2_2.insertFirst(14);
		prog2_2.insertFirst(89);
		prog2_2.insertFirst(1);
		prog2_2.insertFirst(67);
		prog2_2.insertFirst(4);
		Link link = prog2_2.findNthElementFromEnd(6);
		assertEquals(67, link.data);
	}
	
}