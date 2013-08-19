package com.prog.ctci;

import org.junit.Before;
import org.junit.Test;

public class Prog9_2_Test{

	Prog9_2 prog9_2;
	String[] strArr = {"cat", "tac", "army", "pam", "act", "map", "mary", "self", "amp"};
;
	
	@Before
	public void setup(){
		prog9_2 = new Prog9_2(strArr);
	}
	
	
	@Test
	public void testRegularSort(){
		prog9_2.sort();
		for(String str : prog9_2.strArr){
			System.out.print(str + "\t");
		}
		System.out.println();
	}
	
	
	@Test
	public void testAnagramSort(){
		prog9_2.anagramSort();
		for(String str : prog9_2.strArr){
			System.out.print(str + "\t");
		}
		System.out.println();
	}
	
	
}