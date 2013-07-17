package com.prog.lafore;

import static org.junit.Assert.*;

import org.junit.Test;

public class Chp6_Anagrams_Test {
	
//	@Test
//	public void test_at(){
//		String str = "at";
//		char[] arr = str.toCharArray();
//		Chp6_Anagrams chp6_Anagrams = new Chp6_Anagrams(arr);
//		chp6_Anagrams.printAnagrams(2);
//	}
	
//	@Test
//	public void test_cat(){
//		String str = "cat";
//		char[] arr = str.toCharArray();
//		Chp6_Anagrams chp6_Anagrams = new Chp6_Anagrams(arr);
//		chp6_Anagrams.printAnagrams(3);
//	}
//	
	@Test
	public void test_abcd(){
		String str = "abcd";
		char[] arr = str.toCharArray();
		Chp6_Anagrams chp6_Anagrams = new Chp6_Anagrams(arr);
		chp6_Anagrams.printAnagrams(4);
	}

	@Test
	public void test_rotate(){
		String str = "cat";
		char[] arr = str.toCharArray();
		Chp6_Anagrams chp6_Anagrams = new Chp6_Anagrams(arr);
		char[] result = chp6_Anagrams.rotate(arr, 0);
		assertEquals(true, "atc".equals(new String(result)));
	}
	
}
