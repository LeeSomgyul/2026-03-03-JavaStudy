package com.sist.lang;

public class Math_1 {

	public static void main(String[] args) {
		
		String[] names = {
				"aaa", "bbb", "ccc", "ddd",
				"ddd", "fff", "iii", "jjj",
				"kkk", "mmm", "nnn", "ppp",
				"www", "xxx", "yyy"
		};
		
		System.out.println((int)Math.ceil(names.length/5.0));
		
		int rand = (int)(Math.random() * 100);
		System.out.println(rand);
		
		double d = Math.round(10.5);
		System.out.println(d);
	}

}
