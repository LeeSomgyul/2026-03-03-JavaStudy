package com.sist.main;

import java.util.*;

class Super{
	int a, b, c;
	public void display() {
		System.out.println("Super의 display() 불러왔다!");
	}
}

class Sub extends Super{
	
	int d;
	
}

public class 재사용_1 {

	public static void main(String[] args) {
		
		Sub sub = new Sub();
		System.out.println("sub.a = " + sub.a);
		System.out.println("sub.d = " + sub.d);
		sub.display();
		
		Super s = new Sub();
		s.display();
		
		Sub ss = (Sub)s;
		ss.display();
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("aaa");
		list.add('A');
		list.add(new Sub());
		
		Object o = list.get(3);
		Sub sss = (Sub)list.get(3); //new Sub()를 출력하기 위해 Sub 로 형변환 
	}

}
