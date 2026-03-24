package com.sist.main;

import java.util.*;

class AA{
	public void display() {
		System.out.println("AA 호출 중...");
	}
}

class BB extends AA{
	public void display() {
		System.out.println("BB 호출 중...");
	}
}

class CC extends AA{
	public void display() {
		System.out.println("CC 호출 중...");
	}
}

class DD extends AA{
	public void display() {
		System.out.println("DD 호출 중...");
	}
}

class EE{
	public void display() {
		System.out.println("EE 호출 중...");
	}
}

class MM extends EE{
	public void display() {
		System.out.println("MM 호출 중...");
	}
}


class Container{
	
	Map<Integer, AA> map = new HashMap();
	
	public Container() {
		map.put(1, new AA());
		map.put(2, new BB());
		map.put(3, new CC());
		map.put(4, new DD());
	}
	
	public AA getBean(int key) {
		return (AA)map.get(key);
	}
}

public class 다형성_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1,2,3,4 메뉴 선택: ");
		int num = scan.nextInt();
		
		Container c = new Container();
		AA aa = c.getBean(num);
		aa.display();
		
		MM mm = new MM();
		mm.display();
		
		EE ee = new EE();
		ee.display();
		
		EE ee1 = new MM();
		ee1.display();
		
		MM mm1 = (MM)ee1;
		mm1.display();
		
	}

}
