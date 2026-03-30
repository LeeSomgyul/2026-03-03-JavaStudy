package com.sist.lang;

class Member{
	String name = "홍길동";
	public void display() {
		System.out.println("이름: " + name);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return name;
		
	}
}

class CallByReference{
	public void change(Member m) {
		m.name = "박문수";
	}
}

public class Object_2 {

	public static void main(String[] args) throws Exception{
		
//		Member member1 = new Member();
//		member1.display();
//		
//		//객체 주소를 복사
//		Member member2 = member1;
//		member2.name = "심청이";
//		member1.display();
//		
		
		Member member1 = new Member();
		member1.name = "이순신";
		Member member2 = (Member)member1.clone();
		
		System.out.println("member1 = " + member1);
		System.out.println("member2 = " + member2);
		System.out.println("member1.name = " + member1.name);
		System.out.println("member2.name = " + member2.name);
		
	}

}
