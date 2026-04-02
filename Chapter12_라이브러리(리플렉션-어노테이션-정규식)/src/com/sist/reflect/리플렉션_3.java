package com.sist.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Member{
	private int mno = 1;
	private String name = "홍길동";
	private String address = "서울";
	
	public Member() {}
	public Member(int mno, String name, String address) {
		this.mno = mno;
		this.name = name;
		this.address = address;
	}
	
	public void select() {
		
	}
	
	public void insert() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}

public class 리플렉션_3 {

	public static void main(String[] args) {
		
		try {
			Member mem = new Member();
			Class cls = mem.getClass();
			System.out.println("===메소드===");
			
			Method[] methods = cls.getDeclaredMethods();
			for(Method m:methods) {
				System.out.println(m.getName());
			}
			System.out.println("===멤버변수===");
;		}catch(Exception ex) {
	
}

	}

}
