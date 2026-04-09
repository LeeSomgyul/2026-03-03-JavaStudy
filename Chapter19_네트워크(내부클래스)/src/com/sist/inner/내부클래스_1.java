package com.sist.inner;

class Outer{
	private String name = "홍길동";
	
	class Inner{
		int a = 10;
		
		public void print() {
			System.out.println("Inner: Call...: name=" + name);
		}
		
		public void display() {
			Inner in = new Inner();
			in.print();
		}
	}
}

class Outer2{
	static class Inner{
		public void print() {
			System.out.println("Inner: Call...: name=");
		}
	}
}



public class 내부클래스_1 {

	public static void main(String[] args) {
		
		System.out.println("===== 멤버 클래스 =====");
		Outer p = new Outer();
		
	}

}
