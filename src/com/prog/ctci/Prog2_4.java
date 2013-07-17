package com.prog.ctci;



/**
 * 
 * You have two numbers represented by a linked list, where each node contains a sin- gle digit. The digits are stored in reverse order, such that the 1Õs digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.
	EXAMPLE
	Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
	Output: 8 -> 0 -> 8
 * 
 * main function - getListAsSumOf2Lists()
 * 
 * @author ptemkar
 * @date 07/07/13
 */
public class Prog2_4 {

	Link first;  //null
	
	public void insertFirst(int data){
		Link link = new Link(data);
		link.next = first;
		first = link;
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
	
	public int convertListToNumber(){
		int result = 0;
		int length = findListLength();
		
		Link current = first;
		while(current != null){
			int exponent = length - 1;
			int multiplyFactor = (int)Math.pow(10, exponent);
			result = result + current.data * multiplyFactor;
			current = current.next;
			length--;
		}
		
		return result;
	}
	
	public int addTwoLists(Prog2_4 list1, Prog2_4 list2){
		int sum = 0;
		
		int num1 = list1.convertListToNumber();
		int num2 = list2.convertListToNumber();
		
		sum = num1 + num2;
		
		return sum;
	}
	
	public Prog2_4 convertNumberToDigitsList(int num){
		Prog2_4 result = new Prog2_4();
		int counter = 0;
		
		
		//convert the number into array
		
		while(num/Math.pow(10, counter) > 9){
			counter++;
		}
		
		int[] arr = new int[counter+1];
		
		for(int i = 0, max = counter; i<=counter;i++){
			arr[i] = (num % (int)Math.pow(10, max+1)) / (int)Math.pow(10, max);
			max--;
		}
		
		//put the contents of the array into the list in the reverse order
		for(int i = arr.length-1 ; i>=0 ; i--){
			result.insertFirst(arr[i]);
		}
		
		return result;
	}
	
	public Prog2_4 getListAsSumOf2Lists(Prog2_4 list1, Prog2_4 list2){
		Prog2_4 result = new Prog2_4();
		
		int sum = addTwoLists(list1, list2);
		result = convertNumberToDigitsList(sum);
			
		return result;
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
	

}
