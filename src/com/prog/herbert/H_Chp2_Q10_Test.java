package com.prog.herbert;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class H_Chp2_Q10_Test {

	H_Chp2_Q10 h_Chp2_Q10 = new H_Chp2_Q10();
	
	@Test
	public void test_isAPrimeNumber(){
		assertEquals(true, h_Chp2_Q10.isAPrimeNumber(17));
		assertEquals(false, h_Chp2_Q10.isAPrimeNumber(62));
		assertEquals(true, h_Chp2_Q10.isAPrimeNumber(67));
		
	}
	
	@Test
	public void test_getPrimeNumberList(){
		List<Integer> primeNumberList = h_Chp2_Q10.getPrimeNumberList(3, 100);
		assertEquals(23, primeNumberList.size());
		//h_Chp2_Q10.displayPrimeNumberList(primeNumberList);
	}

}
