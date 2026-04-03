package com.sist.collection;

import java.util.*;

public class Collection_4 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("사과");
		set.add("배");
		set.add("딸기");
		
		System.out.println("===== 과일 종류 =====");
		
		for(String f:set) {
			System.out.println(f);
		}
		
	}

}
