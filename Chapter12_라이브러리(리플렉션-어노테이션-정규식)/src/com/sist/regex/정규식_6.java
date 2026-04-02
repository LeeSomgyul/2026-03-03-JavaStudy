package com.sist.regex;

public class 정규식_6 {

	public static void main(String[] args) {
		System.out.println("12345".matches("\\d+"));
		System.out.println("abc123".matches("\\w+"));
		System.out.println("1+2".matches("1\\+2"));
		System.out.println("a\\b".matches("a\\\b"));
	}

}
