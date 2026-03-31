package com.sist.lang;

import java.io.FileReader;

public class StringBuffer_1 {

	public static void main(String[] args) {
		
		try {
			String foodData = "";
			FileReader fr = new FileReader("C:\\javaDev\\food.txt");
			
			StringBuilder sb = new StringBuilder();
			int i=0;
			long start = System.currentTimeMillis();
			while((i=fr.read())!= -1) {
				sb.append((char)i);
			}
			
			fr.close();
			long end = System.currentTimeMillis();
			System.out.println("걸린 시간: " + (end - start) + "MS");
			System.out.println(sb.toString());
		}catch(Exception ex) {
			
		}

	}

}
