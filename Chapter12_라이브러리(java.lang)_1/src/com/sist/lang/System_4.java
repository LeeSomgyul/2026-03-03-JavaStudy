package com.sist.lang;

import java.util.StringTokenizer;

public class System_4 {

	public static void main(String[] args) {
		String info = "32,000원 | 2026년 4월 2일 발행 | 404쪽";
		String[] data = info.split("\\|");
		
		for(String s:data) {
			System.out.println(s);
		}
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		
		System.out.println("===== StringTokener =====");
		start = System.currentTimeMillis();
		StringTokenizer st = new StringTokenizer(info, "|");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		end = System.currentTimeMillis();
		System.out.println("걸린 시간: " + (end - start));
	}

}
