package com.sist.stream;

import java.io.*;

public class Stream_1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
//			File file = new File("");
//			fis = new FileInputStream(file);
			fis = new FileInputStream("C:\\Users\\sist-12\\git\\2026-03-03-JavaStudy\\Chapter18_입출력(IO)_2\\src\\com\\sist\\io\\IO_1.java");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
//			int i = 0;
//			while((i=fis.read())!=-1) {
//				System.out.println(i);
//			}
			
			while(true) {
				String s = br.readLine();
				if(s==null) {
					break;
				}
				System.out.println(s);
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				fis.close();
			}catch(Exception ex) {}
		}

	}

}
