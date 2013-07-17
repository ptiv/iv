package com.prog.lafore;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class Chp2_Q2Test {

	static int maxSize = 10;
	static Chp2_Q2 arr = new Chp2_Q2(maxSize);

	Chp2_Q2 emptyArray = new Chp2_Q2(maxSize);
	
	@BeforeClass
	public static void populateArray(){
		arr.insert(77);               // insert 10 items		
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(99);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
	}
	
	@Test
	public void testRemoveMax(){
		assertEquals(99, arr.removeMax());
		arr.display();
	}
	
	@Test
	public void testRemoveMaxAgain(){
		assertEquals(88, arr.removeMax());
		arr.display();
	}

	@Test
	public void testRemoveMax_emptyArray(){
		assertEquals(-1, emptyArray.removeMax());
	}

}
