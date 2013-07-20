package com.prog.ctci;

import org.junit.Test;
import static org.junit.Assert.*;

public class Prog8_1_Test {
	@Test
	public void test_fibonacci(){
		Prog8_1 prog8_1 = new Prog8_1();
		assertEquals(1, prog8_1.fibonacci(2));
		assertEquals(8, prog8_1.fibonacci(6));
		assertEquals(34, prog8_1.fibonacci(9));
	}
}
