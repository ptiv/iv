package com.prog.ctci;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog2_5_Test {

	Prog2_5 prog2_5 = new Prog2_5();
	
	@Test
	public void test_singlyLinkedList(){
		prog2_5.insertFirst(9);
		prog2_5.insertFirst(8);
		prog2_5.insertFirst(7);
		prog2_5.insertFirst(6);
		prog2_5.insertFirst(5);
		prog2_5.insertFirst(4);
		prog2_5.insertFirst(3);
		prog2_5.insertFirst(2);
		prog2_5.insertFirst(1);
		prog2_5.displayLinkedList();
		assertEquals(false, prog2_5.isThereALoop());
		
		//create circular link
		Link link9 = prog2_5.findLink(9);
		Link link5 = prog2_5.findLink(5);
		link9.next = link5;
		
		System.out.println("--- display circular linked list ---");
		prog2_5.displayCircularLinkedList();
		
		assertEquals(true, prog2_5.isThereALoop());
		Link loopStart = prog2_5.findLoopStart();
		assertEquals(5, loopStart.data);
	}
}
