package com.prog.lafore;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Chp4_Stack_Test{
	
	int[] stack_5 = new int[5];
	Chp4_Stack fullStack = new Chp4_Stack(stack_5);
	
	int[] stack_0 = new int[0];
	Chp4_Stack emptyStack = new Chp4_Stack(stack_0);
	
	int[] stack_3 = new int[3];
	Chp4_Stack stackOp = new Chp4_Stack(stack_3);
	
	@Before
	public void setup(){
		
		try{
			fullStack.push(1);
			fullStack.push(2);
			fullStack.push(3);
			fullStack.push(4);
			fullStack.push(5);
		}catch(StackFullException e){
			fail("Error!! stack full " + e);
		}
		
	}
	
	@Test
	public void test_stackFull(){
		try{
			fullStack.push(6);
			fail("excepted StackFullException");
		}catch(StackFullException e){
			System.out.println("Success! stack full : " + e );
		}
		
	} 
	
	@Test
	public void test_StackEmpty(){
		try{
			emptyStack.pop();
			fail("Expecting StackEmptyException");
		}catch(StackEmptyException e){
			System.out.println("Success! stack empty : " + e );
		}
		
	}
	
	@Test
	public void test_StackOperations(){
		try {
			stackOp.push(1);
			stackOp.push(2);
			assertEquals(2, stackOp.peek());
			
			stackOp.pop();
			assertEquals(1, stackOp.peek());
			
			stackOp.pop();
			
			try{
				stackOp.pop();
				fail("Expecting StackEmptyException");
			}catch(StackEmptyException e){
				System.out.println(" Success! " + e);
			}
			
			
		} catch (StackFullException e) {
			fail("fail : " + e);
		} catch (StackEmptyException e) {
			fail("fail : " + e);
		}
	}
	
	
}