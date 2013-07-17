package com.prog.lafore;

/**
 * LinkedList implementation based on Lafore
 * 
 * @author ptemkar
 * @date 06/27/13
 */
public class Chp5_LinkedList{
	Link first;  //null
	
	public void insertFirst(int data){
		Link link = new Link(data);
		link.next = first;
		first = link;
	}
	
	public Link deleteFirst(){
		
		if(isListEmpty()){
			System.out.println(" List empty");
			return null;
		}else{
			Link temp = first;
			first = first.next;
			return temp;
		}
		
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
	
	public Link deleteLink(int data) throws LinkNotFoundException{

		Link current = this.first;


		if(current.data == data){
			first = first.next;
			return current;
		}


		while(current.next != null){

			if((current.next).data == data){
				Link temp = current.next;
				current.next = (current.next).next;
				return temp;
			}

			current = current.next;

		}	

		throw new LinkNotFoundException();
	}
	
	public Link deleteLinkByIndex(int index) throws LinkNotFoundException{

		Link current = this.first;
		int counter = 0;

		if(index == 0){
			first = first.next;
			return current;
		}


		while(current.next != null){
			
			counter++;
			
			if(counter == index){
				Link temp = current.next;
				current.next = (current.next).next;
				return temp;
			}

			current = current.next;

		}	

		throw new LinkNotFoundException();
	}
	
	public int findListLength(){
		int length = 0;
		
		Link current = first;
		while(current != null){
			length++;
			current = current.next;
		}
		
		return length;
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