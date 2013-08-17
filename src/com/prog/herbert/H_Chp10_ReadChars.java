package com.prog.herbert;

import java.io.*;

public class H_Chp10_ReadChars{
	
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try{
			char c;
			do{
				c = (char)br.read();
				System.out.println(c);
			}while(c != '.');
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
	
}
