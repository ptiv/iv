package com.prog.ctci;

import org.junit.Test;
import static org.junit.Assert.*;

public class Prog2_4_Test {
	Prog2_4 prog2_4 = new Prog2_4();
	
	@Test
	public void test_convertListToNumber_with1digit(){
		prog2_4.insertFirst(3);
		assertEquals(3, prog2_4.convertListToNumber());
	}
	
	@Test
	public void test_convertListToNumber_with3digits(){
		prog2_4.insertFirst(3);
		prog2_4.insertFirst(5);
		prog2_4.insertFirst(2);
		assertEquals(253, prog2_4.convertListToNumber());
	}
	
	@Test
	public void test_addTwoLists(){
		Prog2_4 list1 = new Prog2_4();
		list1.insertFirst(3);
		list1.insertFirst(5);
		list1.insertFirst(2);
		
		Prog2_4 list2 = new Prog2_4();
		list2.insertFirst(4);
		list2.insertFirst(9);
		list2.insertFirst(8);
		
		assertEquals(253+894, prog2_4.addTwoLists(list1, list2));
	}
	
	@Test
	public void test_convertNumberToDigitsList(){
		Prog2_4 prog2_4 = new Prog2_4();
		Prog2_4 list = prog2_4.convertNumberToDigitsList(453);
		//System.out.println(" number : " + 453 + " as a list" );
		list.displayLinkedList();
	}
	
	@Test 
	public void test_getListAsSumOf2Lists(){
		Prog2_4 list1 = new Prog2_4();
		list1.insertFirst(3);
		list1.insertFirst(5);
		list1.insertFirst(2);
		
		Prog2_4 list2 = new Prog2_4();
		list2.insertFirst(4);
		list2.insertFirst(9);
		list2.insertFirst(8);
		
		Prog2_4 result = prog2_4.getListAsSumOf2Lists(list1, list2);
		//System.out.println(" 352 + 498 = ");
		result.displayLinkedList();
		
		
	}
	
}
