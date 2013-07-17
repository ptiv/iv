package com.prog.ctci;

import java.util.Stack;

/**
 * 
 * How would you design a stack which, in addition to push and pop, 
 * also has a function min which returns the minimum element? 
 * Push, pop and min should all operate in O(1) time.
 * 
 * @author ptemkar
 * @date 06/23/13
 */
public class Prog3_2{

	Stack<StackNode> nodes = new Stack<StackNode>();

	public void push(int value){
		
		int nodeMinimum;
		if(this.nodes.isEmpty()){
			nodeMinimum = value;
		}else{
			int previousMinimum = getMinimum();
			if(this.nodes.isEmpty() || value < previousMinimum){
				nodeMinimum = value;
			}else{
				nodeMinimum = previousMinimum;
			}	
		}
			
		StackNode stackNode = new StackNode(value, nodeMinimum);
		nodes.push(stackNode);
	}

	public int getMinimum(){
		StackNode peekNode = nodes.peek();
		return peekNode.localMinimum;
	}

	public Stack<StackNode> getStack(){
		return this.nodes;
	}

}

class StackNode{
	int value;
	int localMinimum;

	public StackNode(int value, int localMinimum){
		this.value = value;
		this.localMinimum = localMinimum;
	}

}