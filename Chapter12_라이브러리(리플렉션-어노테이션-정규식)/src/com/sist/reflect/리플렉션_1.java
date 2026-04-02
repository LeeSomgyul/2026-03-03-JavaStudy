package com.sist.reflect;

import java.lang.reflect.Field;

class Student{
	private String name = "홍길동";
}

public class 리플렉션_1 {

	public static void main(String[] args) {
		
		try {
			Student std = new Student();
			Class cls = std.getClass();
		}catch(Exception ex) {
			
		}

	}

}
