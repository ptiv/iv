package com.prog.ctci;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog1_4Test {

	Prog1_4 prog1_4 = new Prog1_4();
	
	@Test
	public void testAreAnagrams(){
		
		String s1 = "abc";
		String s2 = "bac";
		assertTrue(prog1_4.areAnagrams(s1, s2));

		String s3 = "abcd";
		String s4 = "abc";
		assertFalse(prog1_4.areAnagrams(s3, s4));
		
		String s5 = "abc";
		String s6 = "abcd";
		assertFalse(prog1_4.areAnagrams(s5, s6));

		String s7 = "aaa";
		String s8 = "aaa";
		assertTrue(prog1_4.areAnagrams(s7, s8));

		String s9 = "aa";
		String s10 = "aab";
		assertFalse(prog1_4.areAnagrams(s9, s10));
		
	}

}
