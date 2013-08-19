package com.prog.herbert;

import org.junit.Test;

public class H_Chp11_MyThread_Test {
	
	@Test
	public void test1(){
		H_Chp11_MyThread h_Chp11_MyThread = new H_Chp11_MyThread("th1");
		try {
			for(int i=0; i<50; i++){
				System.out.print(".");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@Test
//	public void test2(){
//		//without using the the constructor which initializes the internal Thread object
//		//and instead using a separate external Thread object
//		
//		H_Chp11_MyThread h_Chp11_MyThread = new H_Chp11_MyThread();
//		Thread th = new Thread(h_Chp11_MyThread);
//		th.setName("th");
//		
//		th.start();
//		try {
//			for(int i=0; i<50; i++){
//				System.out.print(".");
//				Thread.sleep(100);
//			}
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	
}
