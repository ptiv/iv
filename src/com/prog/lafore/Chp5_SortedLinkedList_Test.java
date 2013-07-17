package com.prog.lafore;

import org.junit.Test;

public class Chp5_SortedLinkedList_Test{

	@Test
	public void test_insertingIntoEmptyList(){
		Chp5_SortedLinkedList chp5_SortedLinkedList = new Chp5_SortedLinkedList();
		System.out.println("Test inserting into an empty list. 3 is the only element");
		
		chp5_SortedLinkedList.insertSorted(3);
		
		chp5_SortedLinkedList.displayLinkedList();
	}
	
	@Test
	public void test_insertingTheFirstElementInNonEmptyList(){
	
		Chp5_SortedLinkedList chp5_SortedLinkedList = new Chp5_SortedLinkedList();
		System.out.println("Test inserting into an empty list. 3 should be at the beginning");
		
		chp5_SortedLinkedList.insertSorted(42);
		chp5_SortedLinkedList.insertSorted(15);
		chp5_SortedLinkedList.insertSorted(3);
		
		chp5_SortedLinkedList.displayLinkedList();
		
	}
	
	@Test
	public void test_insertingTheLastElementInNonEmptyList(){
	
		Chp5_SortedLinkedList chp5_SortedLinkedList = new Chp5_SortedLinkedList();
		System.out.println("Test inserting into an empty list. 74 should be inserted at the end");
		
		chp5_SortedLinkedList.insertSorted(42);
		chp5_SortedLinkedList.insertSorted(15);
		chp5_SortedLinkedList.insertSorted(74);
		
		chp5_SortedLinkedList.displayLinkedList();
		
	}
	
	@Test
	public void test_insertingMiddleElementInNonEmptyList(){
	
		Chp5_SortedLinkedList chp5_SortedLinkedList = new Chp5_SortedLinkedList();
		System.out.println("Test inserting into an empty list. 36 should be inserted in between");
		
		chp5_SortedLinkedList.insertSorted(42);
		chp5_SortedLinkedList.insertSorted(15);
		chp5_SortedLinkedList.insertSorted(36);
		
		chp5_SortedLinkedList.displayLinkedList();
		
	}
	
	
}