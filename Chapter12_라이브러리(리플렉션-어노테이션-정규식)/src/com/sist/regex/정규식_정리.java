package com.sist.regex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규식_정리 {

	public static void main(String[] args) {
		
//		String msg = "내 전화번호는 010-1234-5678이고 " + "회사전화는 02-333-4566 입니다.";
//		String regex = "\\d{2,3}-\\d{3,4}-\\d{4}";
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(msg);
//		
//		while(m.find()) {
//			System.out.println("전화번호: " + m.group());
//			System.err.println(m.start() + " " + m.end());
//		}
//		
//		String email = "test@emple.com";
//		String regex = "^[A-Za-z]+@[A-Za-z]+\\.[A-Za-z]{2,}$";
//		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(date);
		System.out.println(today);
		
		String regex = "(\\d{4})-(\\d{1,2)-(\\d{1,2})";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(today);
		if(m.find()) {
			System.out.println("오늘 날짜: " + m.group());
			System.out.println("년도: " +  m.group(1));
			System.out.println("년도: " +  m.group(2));
			System.out.println("년도: " +  m.group(3));
		}

	}

}
