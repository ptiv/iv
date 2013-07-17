package com.prog.ctci;

/**
 * 
 * Given a circular linked list, implement an algorithm which returns node at the begin- ning of the loop.
	DEFINITION
	Circular linked list: A (corrupt) linked list in which a nodeÕs next pointer points to an earlier node, so as to make a loop in the linked list.
	EXAMPLE
	input: A -> B -> C -> D -> E -> C [the same C as earlier]
	output: C
 * 
 * Circular link created in the test class
 * 
 * @author ptemkar
 * @date 07/07/13
 */
public class Prog2_5 {

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
	
	public void displayCircularLinkedList(){
		Link current = first;
		int counter = 0;
		while(current != null && counter < 10){
			current.displayLink();
			current = current.next;
			counter++;
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
				break;
			}
			current = current.next;
		}
		return current;
	}
	
	public boolean isThereALoop(){
		boolean loopPresent = false;
		
		Link fastRunner = first;
		Link slowRunner = first;
		
		while(fastRunner.next != null){
			fastRunner = fastRunner.next.next;
			slowRunner = slowRunner.next;
			if(fastRunner == slowRunner){
				//System.out.println("they first met at : " + fastRunner.data);
				loopPresent = true;
				break;
			}
		}
		
		return loopPresent;
	}
		
	public Link findLoopStart(){
		Link fastRunner = first;
		Link slowRunner = first;
		
		while(fastRunner.next != null){
			fastRunner = fastRunner.next.next;
			slowRunner = slowRunner.next;
			if(fastRunner == slowRunner){
				break;
			}
		}
		//now that they have met, move slowRunner to the beginning of the list
		slowRunner = first;
		
		//now increment both by one each time. where they meet is the starting point 
		//of the loop
		while(slowRunner != null){
			slowRunner = slowRunner.next;
			fastRunner = fastRunner.next;
			if(slowRunner == fastRunner){
				break;
			}
		}
		return slowRunner; 
	}

}
