package com.prog.lafore;

import org.junit.Test;

public class Chp5_DoublyLinkedList_Test{
	
	Chp5_DoublyLinkedList doublyLinkedList = new Chp5_DoublyLinkedList();
	
	@Test
	public void test_insertFirst_singleElement(){
		doublyLinkedList.insertFirst(7);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackward();
	}
	
	@Test
	public void test_insertFirst_multipleElements(){
		doublyLinkedList.insertFirst(8);
		doublyLinkedList.insertFirst(12);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackward();
	}
	
	@Test
	public void test_insertAfter_inBetween(){
		doublyLinkedList.insertFirst(98);
		doublyLinkedList.insertFirst(23);
		doublyLinkedList.insertAfter(23, 73);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackward();
	}
	
	@Test
	public void test_insertAfter_endOfList(){
		doublyLinkedList.insertFirst(66);
		doublyLinkedList.insertFirst(55);
		doublyLinkedList.insertAfter(66, 77);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackward();
	}
	
	@Test
	public void test_deleteLink_singleElement(){
		doublyLinkedList.insertFirst(7);
		doublyLinkedList.deleteLink(7);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackward();
	}
	
	@Test
	public void test_deleteLink_firstElement(){
		doublyLinkedList.insertFirst(64);
		doublyLinkedList.insertFirst(21);
		doublyLinkedList.deleteLink(21);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackward();
	}
	
	@Test
	public void test_deleteLink_lastElement(){
		doublyLinkedList.insertFirst(64);
		doublyLinkedList.insertFirst(21);
		doublyLinkedList.deleteLink(64);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackward();
	}
	
	@Test
	public void test_deleteLink_middleElement(){
		doublyLinkedList.insertFirst(72);
		doublyLinkedList.insertFirst(38);
		doublyLinkedList.insertFirst(15);
		doublyLinkedList.deleteLink(38);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackward();
	}
	
	@Test
	public void test_print(){
		System.out.println("\n--- delete by index tests ---");
	}
	
	@Test
	public void test_deleteLinkByIndex_singleElement(){
		doublyLinkedList.insertFirst(7);
		doublyLinkedList.deleteLinkByIndex(0);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackward();
	}
	
	@Test
	public void test_deleteLinkByIndex_firstElement(){
		doublyLinkedList.insertFirst(64);
		doublyLinkedList.insertFirst(21);
		doublyLinkedList.deleteLinkByIndex(0);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackward();
	}
	
	@Test
	public void test_deleteLinkByIndex_lastElement(){
		doublyLinkedList.insertFirst(64);
		doublyLinkedList.insertFirst(21);
		doublyLinkedList.deleteLinkByIndex(1);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackward();
	}
	
	@Test
	public void test_deleteLinkByIndex_middleElement(){
		doublyLinkedList.insertFirst(72);
		doublyLinkedList.insertFirst(38);
		doublyLinkedList.insertFirst(15);
		doublyLinkedList.deleteLinkByIndex(1);
		doublyLinkedList.displayForward();
		doublyLinkedList.displayBackward();
	}
	
}