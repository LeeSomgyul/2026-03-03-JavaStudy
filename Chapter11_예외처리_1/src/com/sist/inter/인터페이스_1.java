package com.sist.inter;

interface 도형{
	String COLOR = "black";
	
	//도형을 그린다
	public void draw();
}

class 선 implements 도형{

	@Override
	public void draw() {
		System.out.println(COLOR + "를 이용해서 선을 그린다.");
		
	}
	
}

class 사각형 implements 도형{

	@Override
	public void draw() {
		System.out.println(COLOR + "를 이용해서 사각형을 그린다.");
		
	}
	
}

class 삼각형 implements 도형{

	@Override
	public void draw() {
		System.out.println(COLOR + "를 이용해서 삼각형을 그린다.");
		
	}
	
}

public class 인터페이스_1 {

	public static void main(String[] args) {
		
		도형 a = new 선();
		a.draw();
		
		a = new 사각형();
		a.draw();
		
	}

}
