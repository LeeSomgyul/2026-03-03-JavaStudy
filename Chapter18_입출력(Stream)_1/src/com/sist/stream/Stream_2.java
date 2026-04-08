package com.sist.stream;

import java.io.*;

public class Stream_2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			File dir = new File("c:\\java.data");
			if(dir.exists()) {
				dir.mkdir();
			}
			
			File file = new File("C:\\javaDev\\sawon.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file, true);
			
//			fos.write('H');
//			fos.write('e');
//			fos.write('l');
//			fos.write('l');
//			fos.write('o');
			
			String info = "홍길동|남자|개발부|서울|대리|4000\n";
			fos.write(info.getBytes());
			
			System.out.println("파일 저장 완료!");
			
			//한글 깨짐 
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
			}
			
		}catch(Exception ex) {
			
			ex.printStackTrace();
			
		}finally {
			
			try {
				
				fis.close();
				fos.close();
				
			}catch(Exception ex) {
				
			}
			
		}

	}

}
