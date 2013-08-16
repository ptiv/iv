package com.prog.herbert;

public class H_Chp3_KeyboardInput {
	public static void main(String args[])   
	throws java.io.IOException { 

		char ch; 

		System.out.print("Press a key followed by ENTER: "); 

		ch = (char) System.in.read(); // get a char 

		System.out.println("Your key is: " + ch); 
		
		//keep reading till the user enters a "." full-stop
		System.out.print("Now, keep typing. Type . and Hit ENTER to end."); 
		System.out.println("If you type other other things after . and before hitting enter, they will not be printed");
		int i;
		do{
			i = System.in.read();
			System.out.print((char)i);
		}while(i != 46);
	}  
}
