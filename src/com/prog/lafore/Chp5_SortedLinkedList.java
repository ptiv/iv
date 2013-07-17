package com.prog.lafore;

/**
 * Sorted LinkedList implementation based on Lafore
 * 
 * @author ptemkar
 * @date 07/02/13
 */
public class Chp5_SortedLinkedList extends Chp5_LinkedList{

	public void insertSorted(int data){

		Link link = new Link(data);
		Link previous = null, current = null;

		//if the list is currently empty
		if(first == null){		
			first = link;
			first.next = null;

		}else{
			current = first;

			while(current != null){

				if(data < current.data){

					//If less than the first element
					if(current == first){
						link.next = first;
						first = link;
					}else{ //inserting anywhere between the list					
						previous.next = link;	
						link.next = current;					
					}

					break;

				}else{
					//reached the end of the list and still not inserted
					if(current.next == null){
						link.next = null;
						current.next = link;

						break;

					}
				}
				previous = current;
				current = current.next;
			}			
		}

	}

}
