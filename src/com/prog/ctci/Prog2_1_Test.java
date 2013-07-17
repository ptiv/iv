package com.prog.ctci;

import org.junit.Test;

public class Prog2_1_Test {

	
	@Test
	public void test_removeDuplicates(){
		Prog2_1 prog2_1 = new Prog2_1();
		Prog2_1 linkedList = prog2_1.convertStringToList("FOLLOW UP");
		System.out.println("Before removing the duplicates (using extra buffer)");
		linkedList.displayLinkedList();
		linkedList.removeDuplicates();
		linkedList.displayLinkedList();
	}
	
	@Test
	public void test_removeDuplicatesWithoutExtraBuffer(){
		Prog2_1 prog2_1 = new Prog2_1();
		Prog2_1 linkedList = prog2_1.convertStringToList("FOLLOW UP");
		System.out.println("Before removing the duplicates (without extra buffer)");
		linkedList.displayLinkedList();
		linkedList.removeDuplicatesWithoutExtraBuffer();
		linkedList.displayLinkedList();
	}
	
	
}
