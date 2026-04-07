package com.sist.io;

import java.io.*;
import java.text.SimpleDateFormat;

public class IO_1 {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\javaDev\\javaStudy\\Chapter18_입출력(IO)_2\\src\\com\\sist\\io\\IO_1.java");
			System.out.println("파일명: " + file.getName());
			System.out.println("경로 + 파일명: " + file.getPath());
			System.out.println("경로명: " + file.getParent());
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			System.out.println("수정일: " + sdf.format(file.lastModified()));
			System.out.println("숨긴 파일: " + file.isHidden());
			System.out.println("파일여부: " + file.isFile());
		}catch(Exception ex) {
			
		}
		

	}

}
