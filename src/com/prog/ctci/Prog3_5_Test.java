package com.prog.ctci;

import org.junit.Test;
import static org.junit.Assert.*;

public class Prog3_5_Test{
	
	Prog3_5 prog3_5 = new Prog3_5();
	
	@Test
	public void test_1element(){
		prog3_5.insert(7);
		assertEquals(7, prog3_5.peek());
	}

	@Test
	public void test_3elements(){
		prog3_5.insert(7);
		prog3_5.insert(8);
		prog3_5.insert(9);
		prog3_5.displayQueue();
		assertEquals(7, prog3_5.peek());	
	}

	@Test	
	public void test_pop(){
		prog3_5.insert(7);
		prog3_5.insert(8);
		prog3_5.insert(9);
		
		prog3_5.remove();
		prog3_5.displayQueue();
		
		assertEquals(8, prog3_5.peek());
		
	}

}