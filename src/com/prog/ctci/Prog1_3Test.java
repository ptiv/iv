package com.prog.ctci;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Prog1_3Test {
	
	Prog1_3 prog1_3 = new Prog1_3();

	@Test
	public void testRemoveDuplicates(){
		
		//--test my first solution
		
		String singleCharString = "a";
		char[] dupsRemovedSingleCharArray = prog1_3.removeDuplicates(singleCharString);
		assertEquals('a', dupsRemovedSingleCharArray[0]);
		
		String s1 = "helloiloveyou";
		char[] dupsRemovedInputArray1 = prog1_3.removeDuplicates(s1);
		assertEquals("heloivyu     ",new String(dupsRemovedInputArray1));
		System.out.println(new String(dupsRemovedInputArray1));
		
		s1 = "abcd";
		dupsRemovedInputArray1 = prog1_3.removeDuplicates(s1);
		System.out.println(new String(dupsRemovedInputArray1));
		
		s1 = "aaaa";
		dupsRemovedInputArray1 = prog1_3.removeDuplicates(s1);
		System.out.println(new String(dupsRemovedInputArray1));
		
		s1 = "aaabbb";
		dupsRemovedInputArray1 = prog1_3.removeDuplicates(s1);
		System.out.println(new String(dupsRemovedInputArray1));	
		
		s1 = "abababa";
		dupsRemovedInputArray1 = prog1_3.removeDuplicates(s1);
		System.out.println(new String(dupsRemovedInputArray1));
		
		//---------------------
		// solution from the book doesn't seem to work!
		s1 = "helloiloveyou";
		dupsRemovedInputArray1 = prog1_3.removeDuplicatesEff(s1);
		System.out.println(new String(dupsRemovedInputArray1));
		
		// ---- test my second solution
		s1 = "helloiloveyou";
		dupsRemovedInputArray1 = prog1_3.removeDuplicatesWithAdditionalArray(s1);
		assertTrue((new String(dupsRemovedInputArray1)).startsWith("heloivyu"));
		System.out.println(new String(dupsRemovedInputArray1));
		
	}
	
}
