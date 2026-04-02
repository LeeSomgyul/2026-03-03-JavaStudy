package com.sist.collection;

import java.util.*;

public class Collection_1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		list.add("춘향이");
		list.add("이순신");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "." + list.get(i));
		}
		
		System.out.println("===== 지정된 위치에 저장 =====");
		list.add(2, "김두한");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "." + list.get(i));
		}
		
		System.out.println("===== 제거 =====");
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "." + list.get(i));
		}
		
		System.out.println("===== 수정 =====");
		list.set(2, "강감찬");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "." + list.get(i));
		}
		
		System.out.println("현재 인원: " + list.size());
		
		list.clear();
		System.out.println("현재 인원: " + list.size());
	}

}
