package com.prog.ctci;

import java.util.Stack;

/**
 * Write a program to sort a stack in ascending order. 
 * You should not make any assump- tions about how the stack is implemented. 
 * The following are the only functions that should be used to write this program: 
 * push | pop | peek | isEmpty.
 * 
 * @author ptemkar
 * @date 06/26/13
 */
public class Prog3_6{

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	/*
		Keep on emptying stack1 into stack2 as long as the new input value is less than the
		current top. Then insert the new value into stack1. Then add the values from stack2 
		back into stack1
	*/
	public void pushAscending(int value){
	
			while(!stack1.empty() && value < stack1.peek()){
				int stackElement = stack1.pop();
				stack2.push(stackElement);
			}
			stack1.push(value);
			while(!stack2.empty()){
				stack1.push(stack2.pop());
			}
		
	}
	
	private void emptyOneStackIntoAnotherReversed(Stack<Integer> sourceStack, Stack<Integer> destinationStack){
		while(!sourceStack.empty()){

			int element = sourceStack.pop();
			destinationStack.push(element);

		}

	}
	
	public void displayInOrderOfInsertion(){
		
		emptyOneStackIntoAnotherReversed(stack1, stack2);
		
		System.out.println("------- Stack contents in the ascending order -------");
		while(!stack2.empty()){
			int element = stack2.pop();
			System.out.println(element);
			stack1.push(element);
		}
		System.out.println("---------------------");
	}
	
}