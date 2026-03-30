package com.sist.lang;

record Person(String name, int age) {
	
}

public class Object_6 {

	public static void main(String[] args) {
		
		Person p = new Person("홍길동", 20);
		System.out.println("이름: " + p.name());
		System.out.println("나이: " + p.age());

	}

}
