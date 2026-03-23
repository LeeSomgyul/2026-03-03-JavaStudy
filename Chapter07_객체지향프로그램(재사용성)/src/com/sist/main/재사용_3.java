package com.sist.main;

class Animal{
	String name = "동물";
	
	public void run() {
		System.out.println("걷는다");
	}
	
	public void eat() {
		System.out.println("먹는다");
	}
}

class Dog extends Animal{
	int age = 3;
	
	@Override
	public void eat() {
		System.out.println("개는 냠냠 먹는다");
	}
}

class Pig extends Animal{
	int age = 3;
	
	@Override
	public void eat() {
		System.out.println("돼지는 꿀꿀 먹는다");
	}
}

public class 재사용_3 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		Pig pig = new Pig();
		pig.eat();

	}

}
