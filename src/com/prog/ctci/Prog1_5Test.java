package com.prog.ctci;

import org.junit.Assert.*;

import org.junit.Test;

public class Prog1_5Test {

	Prog1_5 prog1_5 = new Prog1_5();
	
	/**
	 * test my solution
	 */
	@Test
	public void testReplaceSpace(){
		String str = "abc d e f";
		char[] arr = new char[str.length() + 3 * 2 + 1];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		String output = prog1_5.replaceSpace(arr, str.length());
		System.out.println(" testReplaceSpace : " + output);
		
	}
	
	/**
	 * test book's solution
	 */
	@Test
	public void testReplaceFun(){
		String str = "abc d e f";
		char[] arr = new char[str.length() + 3 * 2 + 1];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		String output = prog1_5.ReplaceFun(arr, str.length());
		System.out.println(" testReplaceFun : " + output);
	}
	
}
