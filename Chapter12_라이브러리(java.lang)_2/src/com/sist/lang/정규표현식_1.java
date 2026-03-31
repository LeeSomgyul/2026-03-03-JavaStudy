package com.sist.lang;

public class 정규표현식_1 {

	public static void main(String[] args) {
		
		String msg = "abc123";
		boolean result = msg.matches(".*\\d+.*");
		System.out.println(result);
		

	}

}
