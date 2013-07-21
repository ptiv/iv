package com.prog.ctci;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class Prog8_4_Test{
	
	@Test
	public void test_insertAtEveryPosition_1CharString(){
		char[] arr = {'x', 'y', 'z'}; //we are not using this to test this function. This is there just for the constructor.
		Prog8_4 prog8_4 = new Prog8_4(arr);
		StringBuffer strBuf = new StringBuffer("b");
		List<String> charInsertedList = prog8_4.insertAtEveryPosition(strBuf, 'a');
		assertEquals(2, charInsertedList.size());
		assertTrue(charInsertedList.contains("ab"));
		assertTrue(charInsertedList.contains("ba"));
	}
	
	@Test
	public void test_insertAtEveryPosition_2CharString(){
		char[] arr = {'x', 'y', 'z'}; //we are not using this to test this function. This is there just for the constructor.
		Prog8_4 prog8_4 = new Prog8_4(arr);	
		StringBuffer strBuf = new StringBuffer("at");
		List<String> charInsertedList = prog8_4.insertAtEveryPosition(strBuf, 'c');
		assertEquals(3, charInsertedList.size());
		assertTrue(charInsertedList.contains("cat"));
		assertTrue(charInsertedList.contains("act"));
		assertTrue(charInsertedList.contains("atc"));
	}
	
	@Test
	public void test_insertCharInAllStrings_1StringAlreadyPresent(){
		char[] arr = {'x', 'y', 'z'}; //we are not using this to test this function. This is there just for the constructor.
		Prog8_4 prog8_4 = new Prog8_4(arr);
		prog8_4.anagrams.add("b");
		prog8_4.insertCharInAllStrings('a');
		assertEquals(2, prog8_4.anagrams.size());
		assertTrue(prog8_4.anagrams.contains("ab"));
		assertTrue(prog8_4.anagrams.contains("ba"));
	}
	
	@Test
	public void test_insertCharInAllStrings_2StringsAlreadyPresent(){
		char[] arr = {'x', 'y', 'z'}; //we are not using this to test this function. This is there just for the constructor.
		Prog8_4 prog8_4 = new Prog8_4(arr);
		prog8_4.anagrams.add("ab");
		prog8_4.anagrams.add("ba");
		prog8_4.insertCharInAllStrings('c');
		assertEquals(6, prog8_4.anagrams.size());
		assertTrue(prog8_4.anagrams.contains("cab"));
		assertTrue(prog8_4.anagrams.contains("acb"));
		assertTrue(prog8_4.anagrams.contains("abc"));
		assertTrue(prog8_4.anagrams.contains("cba"));
		assertTrue(prog8_4.anagrams.contains("bca"));
		assertTrue(prog8_4.anagrams.contains("bac"));
	}
	
	@Test
	public void test_anagrams(){
		char[] arr = {'c', 'a', 't'};
		Prog8_4 prog8_4 = new Prog8_4(arr);
		prog8_4.anagrams(arr, 0);
		assertEquals(6, prog8_4.anagrams.size());
		assertTrue(prog8_4.anagrams.contains("cat"));
		assertTrue(prog8_4.anagrams.contains("act"));
		assertTrue(prog8_4.anagrams.contains("atc"));
		assertTrue(prog8_4.anagrams.contains("cta"));
		assertTrue(prog8_4.anagrams.contains("tca"));
		assertTrue(prog8_4.anagrams.contains("tac"));
		System.out.println("All anagrams of cat : ");
		for(String anagram : prog8_4.anagrams){
			System.out.println(anagram);
		}
	}
	
}