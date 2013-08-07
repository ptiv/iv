package com.prog;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class GoogPhoneNum_Test {
	
	
	
	/**
	 * 'n' can be an input value. you can generate any digit numbers. doesn't have to be 10 only
	 * higher values of 'n' will generate OutOfMemoryError
	 * 
	 * Also, the input array can be anything. 
	 * 
	 */
	@Test
	public void test_generateNDigitNumbers_method1(){
		
		int[] arr = {2,3,4,5,6,7,8,9};
		GoogPhoneNum googPhoneNum = new GoogPhoneNum(arr);
		
		int n = 6;
		googPhoneNum.generateNumbers1(n);
		
		List<String> numbers = googPhoneNum.numbers;
		for(String number : numbers){
			System.out.println(number);
		}
		
		assertTrue(numbers.contains(new String("444444")));
		assertTrue(numbers.contains(new String("559276")));
	}
	
	@Test
	public void test_generateNDigitNumbers_method2(){
		int[] arr = {2,3,4,5,6,7,8,9};
		GoogPhoneNum googPhoneNum = new GoogPhoneNum(arr);
		
		int n = 6;
		
		List<String> numbers = googPhoneNum.generateNumbers2(n);
		for(String number : numbers){
			System.out.println(number);
		}
		
		assertTrue(numbers.contains(new String("444444")));
		assertTrue(numbers.contains(new String("559276")));
		
	}
	
	
}
