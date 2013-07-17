package com.prog.ctci;

/**
 * Write code to remove duplicates from an unsorted linked list. FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 * 
 * @author ptemkar
 * @date 07/04/13
 */
public class Prog2_1{
	Char_Link first;  //null
	boolean[] boolArr = new boolean[256];
	
	public void insertFirst(char data){
		Char_Link link = new Char_Link(data);
		link.next = first;
		first = link;
	}
	
	public Char_Link deleteFirst(){
		
		if(isListEmpty()){
			System.out.println(" List empty");
			return null;
		}else{
			Char_Link temp = first;
			first = first.next;
			return temp;
		}
		
	}
	
	public void displayLinkedList(){
		Char_Link current = first;
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
	public Char_Link findLink(int data){
		Char_Link current = this.first;
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
	
	
	public Char_Link deleteLink(int data) throws LinkNotFoundException{

		Char_Link current = this.first;


		if(current.data == data){
			first = first.next;
			return current;
		}


		while(current.next != null){

			if((current.next).data == data){
				Char_Link temp = current.next;
				current.next = (current.next).next;
				return temp;
			}

			current = current.next;

		}	

		throw new LinkNotFoundException();
	}
	
	public Prog2_1 convertStringToList(String input){
		char[] inputArr = input.toCharArray();
		Prog2_1 linkedList = new Prog2_1();
		
		//insert the char array in the reverse order into the list so 
		//the displayLinkedList() function can correctly display it.
		for(int i = inputArr.length-1 ; i>=0 ; i--){
			linkedList.insertFirst(inputArr[i]);
		}
		
		return linkedList;
	}
	
	/**
	 * using an extra buffer 'boolArr'
	 */
	public void removeDuplicates(){
		
		Char_Link current = first;
		boolArr[current.data] = true;
		
		while(current.next != null){
			if(boolArr[current.next.data] == true){
				System.out.println("'" + current.next.data + "' is a duplicate character");
				current.next = current.next.next;
			}else{
				boolArr[current.next.data] = true;
				current = current.next;
			}
			
		}
	}
	
	/**
	 * without using an extra buffer
	 */
	public void removeDuplicatesWithoutExtraBuffer(){
		Char_Link current = first;
		
		while(current.next != null){
			//check if current.next.data is similar to the data of any of the 
			//previous links.
			Char_Link runner = first;
			boolean duplicateFound = false;
			
			while(runner != current.next){
				//duplicate found. current.next is a duplicate
				if(runner.data == current.next.data){
					System.out.println("'" + current.next.data + "' is a duplicate character");
					current.next = current.next.next;
					duplicateFound = true;
					break;
				}
				runner = runner.next;
			}
			if(!duplicateFound){
				current = current.next;
			}
			
		}
	}
	
}

class Char_Link{
	char data;
	Char_Link next;
	
	public Char_Link(char data){
		this.data = data;
	}
	
	public void displayLink(){
		System.out.print(" " + data + " ");
	}
	
}

class LinkNotFoundException extends Exception{
}