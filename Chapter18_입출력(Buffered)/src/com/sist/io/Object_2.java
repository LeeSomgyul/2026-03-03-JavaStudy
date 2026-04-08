package com.sist.io;

import java.io.*;

public class Object_2 {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("c:\\java_data\\student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s = (Student)ois.readObject();
		
		System.out.println("학번: " + s.getHakbun());
		System.out.println("이름: " + s.getName());
		System.out.println("국어: " + s.getKor());
		System.out.println("영어: " + s.getEng());
		System.out.println("수학: " + s.getMath());
	}

}
