package com.prog.ctci;


/**
 * Implement an algorithm to delete a node in the middle of a single linked list, 
 * given only access to that node.
	EXAMPLE
	Input: the node ‘c’ from the linked list a->b->c->d->e
	Result: nothing is returned, but the new linked list looks like a->b->d->e
 * 
 * check the function deleteByLink()
 * 
 * NOTE: This problem can not be solved if the node to be deleted is the 
 * last node in the linked list. That’s ok—your interviewer wants to see you
 *  point that out. You could consider marking it as dummy in that case. 
 *  This is an issue you should dis- cuss with your interviewer.
 * 
 * @author ptemkar
 * @date 07/06/13
 */
public class Prog2_3 {

	Link first;  //null
	
	public void insertFirst(int data){
		Link link = new Link(data);
		link.next = first;
		first = link;
	}
	
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
	
	public void displayLinkedList(){
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("\n-------------------------------------------------");
	}
	
	public void deleteByLink(Link link){
		
		if(link.next == null){
			link.data = 0;
		}else{
			link.data = link.next.data;
			link.next = link.next.next;
		}
		
		//link = link.next;
	}
	
	public boolean isListEmpty(){
		if(first == null){
			return true;
		}else{
			return false;
		}
	}
	

	
	
	
	
	

}
