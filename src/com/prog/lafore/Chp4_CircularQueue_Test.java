package com.prog.lafore;

import static org.junit.Assert.*;
import org.junit.Test;


public class Chp4_CircularQueue_Test{

	int[] arr = new int[5];
	Chp4_CircularQueue chp4_CircularQueue = new Chp4_CircularQueue(arr);

	@Test
	public void test_insert(){
		try {
			chp4_CircularQueue.insert(10);
			chp4_CircularQueue.insert(20);
			chp4_CircularQueue.insert(30);
			chp4_CircularQueue.insert(40);
		} catch (QueueFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(10, chp4_CircularQueue.peekFront());	
	}
	
	@Test
	public void test_remove(){
		
		try {
			chp4_CircularQueue.insert(10);
			chp4_CircularQueue.insert(20);
			chp4_CircularQueue.insert(30);
			chp4_CircularQueue.insert(40);
		} catch (QueueFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			chp4_CircularQueue.remove();
			chp4_CircularQueue.remove();
			chp4_CircularQueue.remove();
		} catch (QueueEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(40, chp4_CircularQueue.peekFront());
	}
	
	@Test
	public void test_wrapAround(){
		
		try {
			chp4_CircularQueue.insert(10);
			chp4_CircularQueue.insert(20);
			chp4_CircularQueue.insert(30);
			chp4_CircularQueue.insert(40);
		} catch (QueueFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			chp4_CircularQueue.remove();
			chp4_CircularQueue.remove();
			chp4_CircularQueue.remove();
		} catch (QueueEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			chp4_CircularQueue.insert(50);
			chp4_CircularQueue.insert(60);
			chp4_CircularQueue.insert(70);
			chp4_CircularQueue.insert(80);
			
		} catch (QueueFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(true, chp4_CircularQueue.isQueueFull());
		
	}
	
}