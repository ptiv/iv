package com.prog.ctci;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog8_3_Test {

	@Test
	public void test_print_all_subsets_recursive_baseCase(){
		Prog8_3 prog8_3 = new Prog8_3();
		
		char[] arr = {'b'};
		prog8_3.print_all_subsets_recursive(arr, 0);
		System.out.println("Superset : {b} --------------");
		prog8_3.displaySubsets();
		int expectedSubsetSize = (int) Math.pow(2, arr.length);
		assertEquals(expectedSubsetSize, prog8_3.allSubsets.size());
	}
	
	@Test
	public void test_print_all_subsets_recursive_2Elements(){
		Prog8_3 prog8_3 = new Prog8_3();
		
		char[] arr = {'a', 'b'};
		prog8_3.print_all_subsets_recursive(arr, 0);
		System.out.println("Superset : {a,b} --------------");
		prog8_3.displaySubsets();
		int expectedSubsetSize = (int) Math.pow(2, arr.length);
		assertEquals(expectedSubsetSize, prog8_3.allSubsets.size());
		assertTrue(prog8_3.allSubsets.contains(""));
		assertTrue(prog8_3.allSubsets.contains("b"));
		assertTrue(prog8_3.allSubsets.contains("ba"));
		assertTrue(prog8_3.allSubsets.contains("a"));
	}
	
	@Test
	public void test_print_all_subsets_recursive_3Elements(){
		Prog8_3 prog8_3 = new Prog8_3();
		
		char[] arr = {'a', 'b', 'c'};
		prog8_3.print_all_subsets_recursive(arr, 0);
		System.out.println("Superset : {a,b,c} --------------");
		prog8_3.displaySubsets();
		int expectedSubsetSize = (int) Math.pow(2, arr.length);
		assertEquals(expectedSubsetSize, prog8_3.allSubsets.size());
		assertTrue(prog8_3.allSubsets.contains(""));
		assertTrue(prog8_3.allSubsets.contains("b"));
		assertTrue(prog8_3.allSubsets.contains("ba"));
		assertTrue(prog8_3.allSubsets.contains("a"));
	}
	
}
