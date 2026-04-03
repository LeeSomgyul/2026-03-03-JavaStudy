package com.sist.collection;

import java.util.*;

class A{
	public void display() {
		System.out.println("A: display()...");
	}
}

class B{
	public void display() {
		System.out.println("B: display()...");
	}
}


class C{
	public void display() {
		System.out.println("C: display()...");
	}
}


public class Collection_1 {

	public static void main(String[] args) {
		
		String[] n = {"홍길동", "심청이", "박문수"};
		
		List<String> names = new ArrayList<String>();
		names = Arrays.asList(n);
		
//		names.add(new A());
//		names.add(new B());
//		names.add(new C());
//		names.add(new A());
//		names.add(new B());
		
		
		for(String name:names) {
			System.out.println(name);
		}
		
		System.out.println("인원: " + names.size());
		System.out.println("인원 존재 여부 확인");
		names.isEmpty();
		
		if(names.isEmpty()) {
			System.out.println("인원이 없습니다.");
		}else {
			System.out.println("인원이 " + names.size() + "명 있습니다.");
		}
		
//		A a = null;
//		B b = null;
//		C c = null;
//		
//		for(Object name:names) {
//			if(name instanceof A) {
//				a = (A)name;
//				a.display();
//			}
//			
//			if(name instanceof B) {
//				b = (B)name;
//				b.display();
//			}
//			
//			if(name instanceof C) {
//				c = (C)name;
//				c.display();
//			}
//		}
	}

}
