package com.sist.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Writer_1 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:\\java_data\\sawon.txt", true);
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름 입력: ");
			String name = scan.next();
			
			System.out.print("성별 입력: ");
			String sex = scan.next();
			
			System.out.println("전화번호 입력: ");
			String phone = scan.next();
			
			String data = name + "," + sex + "," + phone + "\n";
			fw.write(data);
			System.out.println("회원 가입 완료!!");
			
			FileReader fr = new FileReader("C:\\java_data\\member.txt");
			int i=0;
			while((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception ex) {}
		}

	}

}
