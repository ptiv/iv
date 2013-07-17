package com.prog.ctci;

import java.util.Stack;

/**
 * Implement a MyQueue class which implements a queue using two stacks.
 * 
 * @author ptemkar
 * @date 06/25/13
 */
public class Prog3_5{

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void displayQueue(){
		
		emptyOneStackIntoAnotherReversed(stack1, stack2);
		
		System.out.println("------- Queue -------");
		while(!stack2.empty()){
			int element = stack2.pop();
			System.out.println(element);
			stack1.push(element);
		}
		System.out.println("---------------------");
	}


	/*
		For insert, just push on the top of the stack
	 */
	public void insert(int element){
		stack1.push(element);
	}

	/*
		Empty stack1 into stack2 and "remove" from stack2.
		Then transfer the contents fo stack2 back to stack1
	 */
	public int remove(){
		
		emptyOneStackIntoAnotherReversed(stack1, stack2);
		
		int removeElement = stack2.pop();
		
		emptyOneStackIntoAnotherReversed(stack2, stack1);
		
		return removeElement;
	}

	/*
	 *  Peek should return the "front" of the stack
		Empty stack1 into stack2 and "peek" from stack2.
		Then transfer the contents from stack2 back to stack1
	 */
	public int peek(){

		emptyOneStackIntoAnotherReversed(stack1, stack2);
		
		int peekValue = stack2.peek();
		
		emptyOneStackIntoAnotherReversed(stack2, stack1);

		return peekValue;
	}

	private void emptyOneStackIntoAnotherReversed(Stack<Integer> sourceStack, Stack<Integer> destinationStack){
		while(!sourceStack.empty()){

			int element = sourceStack.pop();
			destinationStack.push(element);

		}

	}

}