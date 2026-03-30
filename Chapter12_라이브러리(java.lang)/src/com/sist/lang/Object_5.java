package com.sist.lang;

import java.util.Objects;

class Human{
	String id, name;
	public Human(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		Human h = (Human)obj;
		return name.equals(h.name) && id.equals(h.id);
	}
}

public class Object_5 {

	public static void main(String[] args) {
		
		Human h1 = new Human("hong", "홍길동");
		Human h2 = new Human("hong", "홍길동");
		
		if(h1.equals(h2)) {
			System.out.println("같은 사람입니다.");
		}else {
			System.out.println("다른 사람입니다.");
		}

	}

}
