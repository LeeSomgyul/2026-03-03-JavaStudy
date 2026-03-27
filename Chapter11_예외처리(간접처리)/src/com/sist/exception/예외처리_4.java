package com.sist.exception;

public class 예외처리_4 {
	
	public static int test() {
		try {
			int a = 10/0;//에러 발생!
			return 1;
		}catch(Exception e) {
			return 2;
		}finally {
			return 3;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(test());

	}

}
