package com.sist.regex;

public class 정규식_5 {

	public static void main(String[] args) {
		
		System.out.println("abcabe".matches("(abc)+"));
		System.out.println("abc".matches("(abc)*"));
		System.out.println("hahahe".matches("(ha)+he"));
		System.out.println("aabb".matches("(a+b+)+"));
	}

}
