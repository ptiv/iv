package com.prog.herbert;

import java.io.*;

public class H_Chp10_ReadBytes{

	public static void main(String[] args) throws IOException{
		byte[] dataByteArr = new byte[10];
		
		System.out.println("Enter something (10 caracters)");
		System.in.read(dataByteArr);
		
		System.out.println("you entered: ");
		
		for(int dataByte : dataByteArr){
			System.out.print((char)dataByte);
		}
		
	}

}