package com.prog.herbert;

import org.junit.Test;

public class H_Chp11_MyThread_Test {
	
	@Test
	public void test1(){
		
		H_Chp11_MyThread h_Chp11_MyThread_1 = new H_Chp11_MyThread("th1");
		H_Chp11_MyThread h_Chp11_MyThread_2 = new H_Chp11_MyThread("th2");
		H_Chp11_MyThread h_Chp11_MyThread_3 = new H_Chp11_MyThread("th3");

		//-- one aproach to make the main thread wait until these child-threads finish 
//		do{
//			
//		}while(h_Chp11_MyThread_1.thrd.isAlive() || h_Chp11_MyThread_2.thrd.isAlive() || h_Chp11_MyThread_3.thrd.isAlive());
		
		try {
			h_Chp11_MyThread_1.thrd.join();
			h_Chp11_MyThread_2.thrd.join();
			h_Chp11_MyThread_3.thrd.join();
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
