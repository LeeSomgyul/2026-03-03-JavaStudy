package com.sist.stream;

import java.io.FileReader;

public class Reader_1 {

	public static void main(String[] args) {
		
		FileReader in = null;
		
		try {
			in = new FileReader("C:\\java_data\\sawon.txt");
			int i = 0;
			while((i = in.read()) != -1) {
				System.out.println((char)i);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				
			}catch(Exception ex) {}
		}

	}

}
