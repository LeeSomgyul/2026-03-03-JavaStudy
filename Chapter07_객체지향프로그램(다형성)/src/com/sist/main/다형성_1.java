package com.sist.main;

class Super{
	int a;
	int b;
	
	public Super() {
		a = 100;
		b = 100;
	}
	
	public void disp() {
		System.out.println("Super의 disp() 호출...");
	}
	
}

class Sub extends Super{
	int a = 50;
	int b = 50;
	
	public Sub() {
		System.out.println("Sub.this.a = " + this.a);
		System.out.println("Sub.this.b = " + this.b);
		System.out.println("Sub.super.a = " + super.a);
		System.out.println("Sub.super.b = " + super.b);
	}
}

public class 다형성_1 {

	public static void main(String[] args) {
		
		Sub sub = new Sub();
		sub.disp();

	}

}
