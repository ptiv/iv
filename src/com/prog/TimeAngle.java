package com.prog;

public class TimeAngle{

	int hour;
	int mins;

	public TimeAngle(int hour, int mins){
		this.hour = hour;
		this.mins = mins;
	}

	public void printAngle(){
		int minsAbsAngle = 360/60 * mins;
		int hourAbsAngle = 360/12 * hour + (360/12 * mins)/60;
		
		float angle = Math.abs(minsAbsAngle - hourAbsAngle);
	
		System.out.println("angle : " + angle);
	}
	
	
	public static void main(String[] args){
		TimeAngle timeAngle = new TimeAngle(0, 0);
		timeAngle.printAngle();
	}	
	
}