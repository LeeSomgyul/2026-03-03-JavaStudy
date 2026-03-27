package com.sist.exception;

public class 예외처리_6 {

	public static void main(String[] args) {
		
		String image = null;
		
		try {
			System.out.println(image.length());
			System.out.println("Image를 브라우저에 출력");
		}catch(NullPointerException e) {
			System.out.println("이미지 없음을 보내라");
		}

	}

}
