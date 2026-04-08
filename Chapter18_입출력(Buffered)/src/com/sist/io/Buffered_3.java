package com.sist.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Buffered_3 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("c:\\javaDev\\movie.txt");
			int i=0;
			StringBuilder sb = new StringBuilder();
			while((i=fis.read()) != -1) {
				sb.append((char)i);
			}
			
			System.out.println(sb.toString());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			
		}
	}

}
