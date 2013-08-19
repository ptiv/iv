package com.prog.herbert;

public class H_Chp11_MyThread implements Runnable{
	
	Thread thrd;
	
	public H_Chp11_MyThread(String threadName){
		thrd = new Thread(this, threadName);
		thrd.start();
	}
	
	public H_Chp11_MyThread() {
		// TODO Auto-generated constructor stub
	}

	public void run(){
		System.out.println("Thread " + thrd.getName() + " has started");
		int count = 0;
		for(int i=0 ; i<10 ; i++){
			System.out.println(thrd.getName() + " - count : " + count);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			count++;
		}
	}
	
}