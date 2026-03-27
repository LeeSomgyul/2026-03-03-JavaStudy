package com.sist.exception;

public class 예외처리_3 {

	public static void main(String[] args) {
		
		try {
			int a = 10/0;//0으로 나눌 수 없으니까 에러 발생!
			int b = 0;
			
			if(b == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}else {
				System.out.println(a/b);
			}
			
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
			System.out.println("타입: " + ex.getClass());
			ex.printStackTrace();
		}

	}

}
