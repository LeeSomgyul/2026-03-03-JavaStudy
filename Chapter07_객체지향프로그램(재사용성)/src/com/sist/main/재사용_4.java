package com.sist.main;

class Human {
	String name;
	String sex;
	
	public Human() {
		name = "심청이";
		sex = "여자";
		System.out.println("Human() Call...");
	}
}

class Student extends Human{
	public Student(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
	
	public void display() {
		System.out.println("이름: " + name);
		System.out.println("성별: " + sex);
	}
}

class Sawon extends Human{
	
	String name, sex;
	
	public Sawon() {
		System.out.println("Sawon() Call...");
		this.name = "박문수";
		this.sex = "남자";
	}
	
	public void display() {
		System.out.println("이름: " + super.name);
		System.out.println("성별: " + super.sex);
		System.out.println("이름: " + this.name);
		System.out.println("성별: " + this.sex);
	}
}

public class 재사용_4 {

	public static void main(String[] args) {
		
		Student std = new Student("홍길동", "남자");
		std.display();
		
		Sawon s = new Sawon();
		s.display();
	}

}
