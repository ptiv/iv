package com.prog.lafore;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class Chp6_Recursive_TowersOfHanoi_Test {
	
//	@Test
//	public void testDisplay(){
//		Stack<Integer> diskStack = new Stack<Integer>();
//		diskStack.push(400);
//		diskStack.push(300);
//		diskStack.push(200);
//		diskStack.push(100);
//		Chp6_Recursive_TowersOfHanoi chp6_Recursive_TowersOfHanoi = new Chp6_Recursive_TowersOfHanoi(diskStack);
//		chp6_Recursive_TowersOfHanoi.displayAllTowers();
//	}
	
//	@Test
//	public void test_moveOneDiskStack(){
//		Stack<Integer> diskStack = new Stack<Integer>();
//		diskStack.push(400);
//		Chp6_Recursive_TowersOfHanoi chp6_Recursive_TowersOfHanoi = new Chp6_Recursive_TowersOfHanoi(diskStack);
//		
//		System.out.println("---- test_moveOneDiskStack");
//		System.out.println("before moving ----");
//		chp6_Recursive_TowersOfHanoi.displayAllTowers();
//		chp6_Recursive_TowersOfHanoi.MoveDiskStack(diskStack.size(), chp6_Recursive_TowersOfHanoi.source, chp6_Recursive_TowersOfHanoi.destination, chp6_Recursive_TowersOfHanoi.spare);
//		
//		System.out.println("after moving ----");
//		chp6_Recursive_TowersOfHanoi.displayAllTowers();
//		
//		assertEquals(0, chp6_Recursive_TowersOfHanoi.source.diskStack.size());
//		assertEquals(0, chp6_Recursive_TowersOfHanoi.spare.diskStack.size());
//		assertEquals(1, chp6_Recursive_TowersOfHanoi.destination.diskStack.size());
//		assertEquals(new Integer(100), chp6_Recursive_TowersOfHanoi.destination.diskStack.peek());
//	}
	
//	@Test
//	public void test_moveTwoDiskStack(){
//		Stack<Integer> diskStack = new Stack<Integer>();
//		diskStack.push(200);
//		diskStack.push(100);
//		Chp6_Recursive_TowersOfHanoi chp6_Recursive_TowersOfHanoi = new Chp6_Recursive_TowersOfHanoi(diskStack);
//		
//		System.out.println("---- test_moveTwoDiskStack");
//		System.out.println("before moving ----");
//		chp6_Recursive_TowersOfHanoi.displayAllTowers();
//		chp6_Recursive_TowersOfHanoi.MoveDiskStack(diskStack.size(), chp6_Recursive_TowersOfHanoi.source, chp6_Recursive_TowersOfHanoi.destination, chp6_Recursive_TowersOfHanoi.spare);
//		
//		System.out.println("after moving ----");
//		chp6_Recursive_TowersOfHanoi.displayAllTowers();
//		
//		assertEquals(0, chp6_Recursive_TowersOfHanoi.source.diskStack.size());
//		assertEquals(0, chp6_Recursive_TowersOfHanoi.spare.diskStack.size());
//		assertEquals(2, chp6_Recursive_TowersOfHanoi.destination.diskStack.size());
//		assertEquals(new Integer(300), chp6_Recursive_TowersOfHanoi.destination.diskStack.peek());
//	}

	@Test
	public void test_moveThreeDiskStack(){
		Stack<Integer> diskStack = new Stack<Integer>();
		diskStack.push(300);
		diskStack.push(200);
		diskStack.push(100);
		Chp6_Recursive_TowersOfHanoi chp6_Recursive_TowersOfHanoi = new Chp6_Recursive_TowersOfHanoi(diskStack);
		
		System.out.println("---- test_moveThreeDiskStack");
		System.out.println("before moving ----");
		chp6_Recursive_TowersOfHanoi.displayAllTowers();
		chp6_Recursive_TowersOfHanoi.MoveDiskStack(diskStack.size(), chp6_Recursive_TowersOfHanoi.source, chp6_Recursive_TowersOfHanoi.destination, chp6_Recursive_TowersOfHanoi.spare);
		
		System.out.println("after moving ----");
		chp6_Recursive_TowersOfHanoi.displayAllTowers();
		
		assertEquals(0, chp6_Recursive_TowersOfHanoi.source.diskStack.size());
		assertEquals(0, chp6_Recursive_TowersOfHanoi.spare.diskStack.size());
		assertEquals(3, chp6_Recursive_TowersOfHanoi.destination.diskStack.size());
		assertEquals(new Integer(300), chp6_Recursive_TowersOfHanoi.destination.diskStack.get(0));
		assertEquals(new Integer(200), chp6_Recursive_TowersOfHanoi.destination.diskStack.get(1));
		assertEquals(new Integer(100), chp6_Recursive_TowersOfHanoi.destination.diskStack.get(2));
	}
	
	
}
