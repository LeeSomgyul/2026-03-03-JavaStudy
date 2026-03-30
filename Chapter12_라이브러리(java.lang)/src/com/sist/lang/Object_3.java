package com.sist.lang;

class Student{
	private String name = "홍길동";
	private String sex = "남자";
	public int age = 20;
	
	@Override
	public String toString() {
		String info = "이름: " + name + "\n성별: " + sex + "\n나이: " + age;
		return info;
	}
}

public class Object_3 {

	public static void main(String[] args) {
		
		Student std = new Student();
		
		System.out.println("std의 주소: " + std);
		System.out.println("std의 주소: " + std.toString());
		

	}

}
