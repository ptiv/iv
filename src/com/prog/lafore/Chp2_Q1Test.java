package com.prog.lafore;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Chp2_Q1Test {

	int maxSize = 10;
	Chp2_Q1 arr = new Chp2_Q1(maxSize);

	Chp2_Q1 emptyArray = new Chp2_Q1(maxSize);
	
	@Before
	public void populateArray(){
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
	public void testGetMax(){
		assertEquals(99, arr.getMax());
	}

	@Test
	public void testGetMax_emptyArray(){
		assertEquals(-1, emptyArray.getMax());
	}

}
