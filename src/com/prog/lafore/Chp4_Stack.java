package com.prog.lafore;

/**
 * Implementation of a stack 
 * 
 *
 * @date 06/21/13
 * @author ptemkar
 *
 */
public class Chp4_Stack {

	int[] stack;
	int top=-1;
	
	public Chp4_Stack(int[] stack){
		this.stack = stack;
	}
	
	public void push(int entry) throws StackFullException{
		if(top == stack.length-1){
			System.out.println("Stack full!");
			throw new StackFullException();
		}else{
			stack[++top] = entry;
		}		
	}
	
	public int peek(){
		return stack[top];
	}
	
	public int pop() throws StackEmptyException{
		if(top == -1){
			System.out.println("Stack is empty");
			throw new StackEmptyException();
		}else{
			return stack[top--];
		}
	}
	
}

class StackEmptyException extends Exception{

}

class StackFullException extends Exception{

}
