package com.sist.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class Buffered_1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("c:\\javaDev\\고객.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("c:\\java_data\\고객.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int i = 0;
			byte[] buffer = new byte[1024];
			while((i = bis.read(buffer,0,1024))!= -1) {
				bos.write(buffer, 0, i);
			}
			
			fis.close();
			bis.close();
			fos.close();
			bos.close();
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
