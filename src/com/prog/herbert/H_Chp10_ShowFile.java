package com.prog.herbert;

import java.io.*;

public class H_Chp10_ShowFile{
	
	public static void main(String[] args){
		
		FileInputStream fis = null;
		
		if(args.length != 1){
			System.out.println("provide a file name as a param");
			return;
		}
		
		String fileName = args[0];
		
		try{
			fis = new FileInputStream(fileName);
			
			int i;
			do{
				i = fis.read();
				
				if(i != -1){
					System.out.print((char) i);
				}else{
					//end of file
					System.out.print(i);
				}
				
			}while(i != -1);
			
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}finally{
			try{
				if(fis!=null){
					fis.close();
				}
			}catch(IOException e){
				System.out.println(e);
			}
		}
		
	}
	
}