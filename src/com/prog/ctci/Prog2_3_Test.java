package com.prog.ctci;

import org.junit.Test;

public class Prog2_3_Test{

	@Test
	public void test_deleteMiddleElement(){
		Prog2_3 prog2_3 = new Prog2_3();
		prog2_3.insertFirst(8);
		prog2_3.insertFirst(14);
		prog2_3.insertFirst(2);
		Link link = prog2_3.findLink(14);
		System.out.println("\n---------    Before deletion");
		prog2_3.displayLinkedList();
		prog2_3.deleteByLink(link);
		System.out.println("\n---------    After deletion");
		prog2_3.displayLinkedList();
	}
	
	@Test
	public void test_deleteFirstElement(){
		Prog2_3 prog2_3 = new Prog2_3();
		prog2_3.insertFirst(8);
		prog2_3.insertFirst(14);
		prog2_3.insertFirst(2);
		Link link = prog2_3.findLink(2);
		System.out.println("\n---------    Before deletion");
		prog2_3.displayLinkedList();
		prog2_3.deleteByLink(link);
		System.out.println("\n---------    After deletion");
		prog2_3.displayLinkedList();
	}
	
	@Test
	public void test_deleteLastElement(){
		Prog2_3 prog2_3 = new Prog2_3();
		prog2_3.insertFirst(8);
		prog2_3.insertFirst(14);
		prog2_3.insertFirst(2);
		Link link = prog2_3.findLink(8);
		System.out.println("\n---------    Before deletion");
		prog2_3.displayLinkedList();
		prog2_3.deleteByLink(link);
		System.out.println("\n---------    After deletion");
		prog2_3.displayLinkedList();
	}
	
}