package com.prog.lafore;

class DoubleLink{
	int data;
	DoubleLink next;
	DoubleLink previous;

	public DoubleLink(int data){
		this.data = data;
	}

}

//pg 223
public class Chp5_DoublyLinkedList{
	DoubleLink first;
	DoubleLink last;

	public void insertFirst(int data){

		DoubleLink link = new DoubleLink(data);

		//if the list is empty
		if(first == null){
			last = 	link;
		}else{
			first.previous = link;
		}
		link.previous = null;
		link.next = first;	
		first = link;

	}

	public void insertAfter(int after, int data){
		DoubleLink link = new DoubleLink(data);
		DoubleLink current = first;

		while(current != null){
			if(current.data == after){

				//handle conditions where currently the next node is null 
				if(current.next != null){		
					current.next.previous = link;										
				} else{
					last = link;
				}

				link.next = current.next;
				link.previous = current;

				current.next = link;
			}
			current = current.next;
		}

	}

	public void deleteLink(int data){

		DoubleLink current = first;

		while(current != null){

			if(current.data == data){

				//deleting the only remaining node in the list
				if(current == first && first.next == null){
					first = null;
					last = null;
				}else if(current == first){ //deleting the first node in the list when there are other nodes
					//remaining
					first.next.previous = null;
					first = first.next;
				}else if(current == last){
					last.previous.next = null;
					last = last.previous;
				}else{
					//deleting some node in between
					current.previous.next = current.next;
					current.next.previous = current.previous;
				}

			}

			current = current.next;
		}

	}
	
	public void deleteLinkByIndex(int index){
		DoubleLink current = first;
		int counter = 0;

		while(current != null){

			if(counter == index){

				//deleting the only remaining node in the list
				if(current == first && first.next == null){
					first = null;
					last = null;
				}else if(current == first){ //deleting the first node in the list when there are other nodes
					//remaining
					first.next.previous = null;
					first = first.next;
				}else if(current == last){
					last.previous.next = null;
					last = last.previous;
				}else{
					//deleting some node in between
					current.previous.next = current.next;
					current.next.previous = current.previous;
				}
				break;
			}
			counter++;
			current = current.next;
		}

	}

	public void displayForward(){
		System.out.println("\n---------	display forward 	-----------");
		DoubleLink current = first;
		while(current != null){
			displayLink(current);
			current = current.next;
		}

	}

	public void displayBackward(){
		System.out.println("\n---------	display backward 	-----------");
		DoubleLink current = last;
		while(current != null){
			displayLink(current);
			current = current.previous;
		}
	}

	public void displayLink(DoubleLink link){
		System.out.print(link.data + " ");
	}

}