package com.prog.lafore;

import org.junit.Test;

public class Chp6_Recursive_Knapsack_Test {
	
	
	@Test
	public void test_RecursiveKnapsack1(){
		int[] input = {11, 8, 7, 6, 5};
		int capacity = 20;
		Chp6_Recursive_Knapsack chp6_Recursive_Knapsack = new Chp6_Recursive_Knapsack(input, capacity);
		
		chp6_Recursive_Knapsack.RecursiveKnapsack(0, 20);
	}
	
	@Test
	public void test_RecursiveKnapsack2(){
		int[] input = {3, 5, 11, 4};
		int capacity = 15;
		Chp6_Recursive_Knapsack chp6_Recursive_Knapsack = new Chp6_Recursive_Knapsack(input, capacity);
		
		chp6_Recursive_Knapsack.RecursiveKnapsack(0, 15);
	}
	
	@Test
	public void test_RecursiveKnapsack3(){
		int[] input = {3, 5, 11, 4};
		int capacity = 14;
		Chp6_Recursive_Knapsack chp6_Recursive_Knapsack = new Chp6_Recursive_Knapsack(input, capacity);
		
		chp6_Recursive_Knapsack.RecursiveKnapsack(0, 14);
	}
	

}
