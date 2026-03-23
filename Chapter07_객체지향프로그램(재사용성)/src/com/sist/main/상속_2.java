package com.sist.main;

class Animal1{
	
	public void run() {
		System.out.println("두 발로 뛴다");
	}
	
	public void eat() {
		System.out.println("냠냠 먹는다");
	}
	
}

class Dog1 extends Animal1{

	@Override
	public void run() {
		System.out.println("네 발로 뛴다");
	}

	@Override
	public void eat() {
		System.out.println("허겁지겁 먹는다");
	}
	
}

class Pig1 extends Animal1{

	@Override
	public void run() {
		System.out.println("느리게 걷는다");
	}

	@Override
	public void eat() {
		System.out.println("꿀꿀 먹는다");
	}

}

class Super1{
	int a, b;
	
	public void display() {
		System.out.println("a: " + this.a);
		System.out.println("b: " + this.b);
	}
}

class Sub1 extends Super1{
	int c;
	public Sub1() {
		super.a = 100;
		super.b = 200;
	}
	
	public void print() {
		System.out.println("a의 값은?: " + a);
		System.out.println("b의 값은?: " + b);
	}
}

public class 상속_2 {

	public static void main(String[] args) {
		
		Dog1 dog = new Dog1();
		dog.run();
		dog.eat();
		
		Pig1 pig = new Pig1();
		pig.run();
		pig.eat();
		
		Sub1 sub = new Sub1();
		sub.print();
	}

}
