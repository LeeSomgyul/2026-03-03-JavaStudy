package com.sist.io;

import java.io.*;

public class IO_2 {

	public static void main(String[] args) {
		
		try {
			File dir = new File("c:\\javaDev");
			File[] list = dir.listFiles();
			
			for(File f:list) {
				if(f.isFile()) { 
					System.out.println(f.getName() + " ");
				}else if(f.isDirectory()){
					System.out.println(f.getName() + " DIR");
				}
			}
		}catch(Exception ex) {}
		

	}

}
