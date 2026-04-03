package com.sist.collection;

import java.util.*;

public class Collection_6 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		
		for(int i=0; i<10; i++) {
			int k = r.nextInt(100)+1;
			set.add(k);
			System.out.println(k + " ");
		}
		
		System.out.println("실제 저장된 갯수: " + set.size());
		
		for(Integer i:set) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.addAll(set);
		for(Integer i:set2) {
			System.out.println(i + " ");
		}
		
		System.out.println();
		System.out.println("===== 50 이상 =====");
		
//		for(Integer i:set2) {
//			if(i>=50) {
//				System.out.println(i + " ");
//			}
//		}
		
		System.out.println(set2.tailSet(50));
		
		
		System.out.println("===== 50 이하 =====");
		System.out.println(set2.headSet(50));
		
		System.out.println("===== 바로 위에 값 =====");
		System.out.println(set2.higher(30));
	}

}
