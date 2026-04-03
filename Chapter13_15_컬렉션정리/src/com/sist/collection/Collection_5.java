package com.sist.collection;

import java.util.*;

public class Collection_5 {

	public static void main(String[] args) {
		
		String[] names = {
				"홍길동", "심청이" ,"춘향이"
		};
		
		List<String> list = Arrays.asList(names);
		
		System.out.println("===== 전체 사원 목록 =====");
		
		for(String name:list) {
			System.out.println(name);
		}
	}
}
