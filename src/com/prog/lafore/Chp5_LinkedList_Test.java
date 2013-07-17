package com.prog.lafore;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Chp5_LinkedList_Test{

	Chp5_LinkedList chp5_LinkedList = new Chp5_LinkedList();

	@Test
	public void test_singleElement(){
		chp5_LinkedList.insertFirst(7);
		chp5_LinkedList.displayLinkedList();
	}


	@Test
	public void test_3Elements(){
		chp5_LinkedList.insertFirst(7);			
		chp5_LinkedList.insertFirst(14);
		chp5_LinkedList.insertFirst(21);

		chp5_LinkedList.displayLinkedList();
	}

	@Test
	public void test_deleteFirst(){
		chp5_LinkedList.insertFirst(7);			
		chp5_LinkedList.insertFirst(14);
		chp5_LinkedList.insertFirst(21);
		Link link = chp5_LinkedList.deleteFirst();
		assertEquals(21, link.data);

		chp5_LinkedList.displayLinkedList();
	}

	@Test
	public void test_deleteFirst_WithOneElement(){
		chp5_LinkedList.insertFirst(7);			
		chp5_LinkedList.deleteFirst();

		chp5_LinkedList.displayLinkedList();
	}

	@Test
	public void test_find_withOnlyOneElement(){
		chp5_LinkedList.insertFirst(7);
		Link link = chp5_LinkedList.findLink(7);
		assertEquals(7, link.data);
	}

	@Test
	public void test_find_lastElement(){
		chp5_LinkedList.insertFirst(7);			
		chp5_LinkedList.insertFirst(14);
		chp5_LinkedList.insertFirst(21);

		Link link = chp5_LinkedList.findLink(7);
		assertEquals(7, link.data);

	}

	@Test
	public void test_find_firstElement(){
		chp5_LinkedList.insertFirst(7);			
		chp5_LinkedList.insertFirst(14);
		chp5_LinkedList.insertFirst(21);

		Link link = chp5_LinkedList.findLink(21);
		assertEquals(21, link.data);

	}

	@Test
	public void test_find_middleElement(){
		chp5_LinkedList.insertFirst(7);			
		chp5_LinkedList.insertFirst(14);
		chp5_LinkedList.insertFirst(21);

		Link link = chp5_LinkedList.findLink(14);
		assertEquals(14, link.data);

	}

	@Test
	public void test_find_nonExistentElement(){
		chp5_LinkedList.insertFirst(7);			
		chp5_LinkedList.insertFirst(14);
		chp5_LinkedList.insertFirst(21);

		Link link = chp5_LinkedList.findLink(28);
		assertEquals(null, link);

	}

	@Test
	public void test_delete_WithOnlyOneElement(){
		chp5_LinkedList.insertFirst(7);

		try {

			System.out.println(" Before deletion ");
			chp5_LinkedList.displayLinkedList();

			chp5_LinkedList.deleteLink(7);

			System.out.println(" After deletion ");
			chp5_LinkedList.displayLinkedList();

		} catch (LinkNotFoundException e) {
			fail("element was not found");
		}
	}

	@Test
	public void test_delete_firstElement_with2elements(){
		chp5_LinkedList.insertFirst(7);
		chp5_LinkedList.insertFirst(14);

		try {

			System.out.println(" Before deletion ");
			chp5_LinkedList.displayLinkedList();

			chp5_LinkedList.deleteLink(14);

			System.out.println(" After deletion ");
			chp5_LinkedList.displayLinkedList();

		} catch (LinkNotFoundException e) {
			fail("element was not found");

		}
	}
	
	@Test
	public void test_delete_secondElement_with2elements(){
		chp5_LinkedList.insertFirst(7);
		chp5_LinkedList.insertFirst(14);

		try {

			System.out.println(" Before deletion ");
			chp5_LinkedList.displayLinkedList();

			chp5_LinkedList.deleteLink(7);

			System.out.println(" After deletion ");
			chp5_LinkedList.displayLinkedList();

		} catch (LinkNotFoundException e) {
			fail("element was not found");

		}
	}
	
	@Test
	public void test_delete_last_with3elements(){
		chp5_LinkedList.insertFirst(7);
		chp5_LinkedList.insertFirst(14);
		chp5_LinkedList.insertFirst(28);

		try {

			System.out.println(" Before deletion ");
			chp5_LinkedList.displayLinkedList();

			chp5_LinkedList.deleteLink(7);

			System.out.println(" After deletion ");
			chp5_LinkedList.displayLinkedList();

		} catch (LinkNotFoundException e) {
			fail("element was not found");

		}
	}
	
	@Test
	public void test_delete_middle_with3elements(){
		chp5_LinkedList.insertFirst(7);
		chp5_LinkedList.insertFirst(14);
		chp5_LinkedList.insertFirst(28);

		try {

			System.out.println(" Before deletion ");
			chp5_LinkedList.displayLinkedList();

			chp5_LinkedList.deleteLink(14);

			System.out.println(" After deletion ");
			chp5_LinkedList.displayLinkedList();

		} catch (LinkNotFoundException e) {
			fail("element was not found");

		}
	}
	
	@Test
	public void test_delete_withNonExistentLink_withOneLink(){
		chp5_LinkedList.insertFirst(7);
		try {

			chp5_LinkedList.deleteLink(14);
			fail("expected an exception");

		} catch (LinkNotFoundException e) {

		}
	}
	
	@Test
	public void test_delete_withNonExistentLink_withMultipleLinks(){
		chp5_LinkedList.insertFirst(7);
		chp5_LinkedList.insertFirst(14);
		chp5_LinkedList.insertFirst(21);
		try {

			chp5_LinkedList.deleteLink(10);
			fail("expected an exception");

		} catch (LinkNotFoundException e) {

		}
	}
	
	@Test
	public void test_print(){
		System.out.println("\n--- delete by index tests ---");
	}
	
	@Test
	public void test_deleteLinkByIndex_singleElement(){
		chp5_LinkedList.insertFirst(7);
		try {
			chp5_LinkedList.deleteLinkByIndex(0);
		} catch (LinkNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chp5_LinkedList.displayLinkedList();
	}
	
	@Test
	public void test_deleteLinkByIndex_firstElement(){
		chp5_LinkedList.insertFirst(64);
		chp5_LinkedList.insertFirst(21);
		try {
			chp5_LinkedList.deleteLinkByIndex(0);
		} catch (LinkNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chp5_LinkedList.displayLinkedList();
	}
	
	@Test
	public void test_deleteLinkByIndex_lastElement(){
		chp5_LinkedList.insertFirst(64);
		chp5_LinkedList.insertFirst(21);
		try {
			chp5_LinkedList.deleteLinkByIndex(1);
		} catch (LinkNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chp5_LinkedList.displayLinkedList();
	}
	
	@Test
	public void test_deleteLinkByIndex_middleElement(){
		chp5_LinkedList.insertFirst(72);
		chp5_LinkedList.insertFirst(38);
		chp5_LinkedList.insertFirst(15);
		try {
			chp5_LinkedList.deleteLinkByIndex(1);
		} catch (LinkNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chp5_LinkedList.displayLinkedList();
	}
	
	@Test
	public void test_findListLength(){
		assertEquals(0, chp5_LinkedList.findListLength());
		chp5_LinkedList.insertFirst(72);
		assertEquals(1, chp5_LinkedList.findListLength());
		chp5_LinkedList.insertFirst(38);
		assertEquals(2, chp5_LinkedList.findListLength());
		chp5_LinkedList.insertFirst(15);
		assertEquals(3, chp5_LinkedList.findListLength());
	}
}