package com.sist.regex;

public class 정규식_1 {

	public static void main(String[] args) {
		System.out.println("hkkllo".matches("h.llo"));
		System.out.println("h#llo".matches("h.llo"));
		System.out.println("hello".matches("....."));
		System.out.println("홍길동".matches("홍.."));
		System.out.println("맛있고".matches("맛있."));
	}

}
