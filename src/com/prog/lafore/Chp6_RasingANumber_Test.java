package com.prog.lafore;

import static org.junit.Assert.*;
import org.junit.Test;

public class Chp6_RasingANumber_Test{
	Chp6_RasingANumber chp6_RasingANumber = new Chp6_RasingANumber();
	
	@Test
	public void test_raiseWithLoop(){
		assertEquals(1, chp6_RasingANumber.raiseWithLoop(3, 0));
		assertEquals(3, chp6_RasingANumber.raiseWithLoop(3, 1));
		assertEquals(9, chp6_RasingANumber.raiseWithLoop(3, 2));
		assertEquals(27, chp6_RasingANumber.raiseWithLoop(3, 3));
		assertEquals(64, chp6_RasingANumber.raiseWithLoop(4, 3));
	}
	
	@Test
	public void test_raiseWithRecursion(){
		assertEquals(1, chp6_RasingANumber.raiseWithRecursion(3, 0));
		assertEquals(3, chp6_RasingANumber.raiseWithRecursion(3, 1));
		assertEquals(9, chp6_RasingANumber.raiseWithRecursion(3, 2));
		assertEquals(27, chp6_RasingANumber.raiseWithRecursion(3, 3));
		assertEquals(64, chp6_RasingANumber.raiseWithRecursion(4, 3));
	}
	
	
}