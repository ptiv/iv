package com.prog.ctci;

/**
 * 
 * Implement an algorithm to find the nth to last element of a singly linked list.
 * 
 * check the function findNthElementFromEnd()
 * 
 * @author ptemkar
 * @date 07/05/13
 */
public class Prog2_2{
	Link first;  //null
	
	public void insertFirst(int data){
		Link link = new Link(data);
		link.next = first;
		first = link;
	}
	
	public void displayLinkedList(){
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("\n-------------------------------------------------");
	}
	
	public boolean isListEmpty(){
		if(first == null){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * will return null if the link is not found
	 * @param data
	 * @return
	 */
	public Link findLink(int data){
		Link current = this.first;
		int counter = 0; //for printing the location of the link in the Linked List
		while(current != null){
			counter++;
			if(data == current.data){
				System.out.println("Element found at : " + counter);
				break;
			}
			current = current.next;
		}
		return current;
	}
	
	/**
	 * main function for this problem
	 * @param n
	 * @return
	 */
	public Link findNthElementFromEnd(int n){
		Link foreRunner = first;
		Link finder = first;
		int difference = 0;
		
		//move 'foreRunner' such that the difference between 'foreRunner' and 'finder'
		//is 'n - 1'.
		while(difference < n-1){
			foreRunner = foreRunner.next;
			difference++;
		}
		
		//now move the foreRunner all the way up to end and simultaneously move the 'finder'
		//When the 'foreRunner' reaches the end, the 'finder' will have reached the n'th 
		//element from right
		
		while(foreRunner.next != null){
			foreRunner = foreRunner.next;
			finder = finder.next;
		}
		
		return finder;
		
	}
	
}

class Link{
	int data;
	Link next;
	
	public Link(int data){
		this.data = data;
	}
	
	public void displayLink(){
		System.out.print(" " + data + " ");
	}
	
}

class LinkNotFoundException extends Exception{
}