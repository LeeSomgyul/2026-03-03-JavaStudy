package com.sist.exception;

import java.io.*;

public class 예외처리_1 {

	public static void main(String[] args) {
		
//		FileReader in = null;
//		
//		try {
//			in = new FileReader("C:\\Users\\sist-12\\git\\2026-03-03-JavaStudy\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java");
//			int i = 0;
//			while((i = in.read()) != -1) {
//				System.out.print((char)i);
//			}
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}finally {
//			try {
//				in.close();
//			}catch(Exception ex) {}
//		}
		
		try (FileReader in = new FileReader("C:\\Users\\sist-12\\git\\2026-03-03-JavaStudy\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java")){
			int i = 0;
			while((i = in.read()) != -1) {
			System.out.print((char)i);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
