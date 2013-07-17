package com.prog.ctci;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * Imagine a (literal) stack of plates. If the stack gets too high, it might topple. 
 * Therefore, in real life, we would likely start a new stack when the previous stack exceeds some threshold. 
 * Implement a data structure SetOfStacks that mimics this. 
 * SetOfStacks should be composed of several stacks, and should create a new stack 
 * once the previous one exceeds capacity. 
 * SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack 
 * (that is, pop() should return the same values as it would if there were just a single stack).
 * 
 * @author ptemkar
 * @date 06/24/13
 */
public class Prog3_3 {
	
	List<Stack<Integer>> stackList = new ArrayList<Stack<Integer>>();

	//max-size of the stack
	int maxSize;
	//total number of elements across all stacks
	int totalCount = 0;
	
	public Prog3_3(int maxSize){
		this.maxSize = maxSize;
	}
	
	public void push(int value){
		
		//Check if new stack should be created. Create a new stack if the current stack 
		//'maxSize' number of elements.
		if(totalCount == 0 || (totalCount!=1   &&   maxSize % totalCount == 0)){
			Stack<Integer> stack = new Stack<Integer>();
			this.stackList.add(stack);
		}

		//get the last stack in the list and push the value into it
		Stack<Integer> stack = (Stack<Integer>)this.stackList.get(this.stackList.size()-1);
		stack.push(value);
		totalCount++;

		
	}
	
	public int pop(){
		
		Stack<Integer> stack = (Stack<Integer>)this.stackList.get(this.stackList.size() - 1);
		int popValue = stack.pop();
		totalCount--;
				
		//If after popping, the stack is empty, remove it from the list
		if(stack.isEmpty()){
			this.stackList.remove(stackList.size() - 1);
		}
		
		return popValue;
		
	}
	
	public int peek(){
		Stack<Integer> stack = (Stack<Integer>)this.stackList.get(this.stackList.size() - 1);
		return stack.peek();
	}
	
	
	boolean isStackFull(Stack<Integer> stack){
		if(stack.size() == this.maxSize){
			return true;
		}else{
			return false;
		}
	}
	
}
