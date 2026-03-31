package com.sist.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 중간정리 {

	public static void main(String[] args) {
		
		String s = 
				"""
				211.238.142.21,
				211.238.142.22,
				211.238.142.23,
				211.238.142.24,
				211.238.142.25,
				211.238.142.26,
				211.238.142.27,
				211.238.142.28,
				010.1111.1111,
				211.238.142.29""";
		
		System.out.println(s);
		
		Pattern p = Pattern.compile("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\.[0-9]{2}");
		Matcher m = p.matcher(s);
		
		while(m.find()) {
			System.out.println(m.group());
		}

	}

}
