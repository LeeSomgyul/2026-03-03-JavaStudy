package com.sist.collection;

import java.util.*;

public class Collection_8 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("포도", 300);
		
		System.out.println("사과 개수:" + map.get("사과"));
		System.out.println("전체 데이터: " + map);
		
		if(map.containsKey("바나나")) {
			System.out.println("바나나가 있음");
		}
		
		map.put("사과", 1000);
		System.out.println("전체 데이터: " + map);
		
		map.remove("포도");
		System.out.println("전체 데이터: " + map);
		
		for(int i:map.values()) {
			System.out.println(i);
		}
		
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

}
