package com.prog.ctci;

import static org.junit.Assert.*;
import org.junit.Test;

public class Prog3_3_Test{

	Prog3_3 prog3_3 = new Prog3_3(3);
	
	@Test
	public void test_Stack1(){
		prog3_3.push(11);
		prog3_3.push(12);
		prog3_3.push(13);
		
		assertEquals(1, prog3_3.stackList.size());
		assertEquals(13, prog3_3.peek());
		assertEquals(3, prog3_3.totalCount);
	}
	
	@Test
	public void test_Stack2(){
		
		prog3_3.push(11);
		prog3_3.push(12);
		prog3_3.push(13);
		prog3_3.push(14);
		
		assertEquals(2, prog3_3.stackList.size());
		assertEquals(14, prog3_3.peek());
		assertEquals(4, prog3_3.totalCount);
		
	}
	
	@Test
	public void test_Stack_pop(){
		
		prog3_3.push(11);
		prog3_3.push(12);
		prog3_3.push(13);
		prog3_3.push(14);
		prog3_3.push(15);
		
		assertEquals(2, prog3_3.stackList.size());
		assertEquals(15, prog3_3.peek());
		assertEquals(5, prog3_3.totalCount);
		
		prog3_3.pop();
		prog3_3.pop();
		
		assertEquals(1, prog3_3.stackList.size());
		assertEquals(13, prog3_3.peek());
		assertEquals(3, prog3_3.totalCount);
		
	}
	
	

}