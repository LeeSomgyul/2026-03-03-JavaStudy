package com.sist.io;

import java.io.*;

public class IO_3 {

	public static void main(String[] args) {
		
		try {
			File dir = new File("c:\\upload");
			
//			if(!dir.exists()) {
//				dir.mkdir();
//			}else {
//				System.out.println("이미 존재하는 폴더입니다.");
//			}
			
			if(!dir.exists()) {
				dir.createNewFile();
				System.out.println("파일 생성 완료!!");
			}else {
				System.out.println("이미 존재하는 파일입니다.");
			}
		}catch(Exception ex) {
			
		}

	}

}
