package com.sist.lang;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class 시간 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime dateTime = LocalDateTime.of(2026, 3, 30, 14, 30, 30);
		System.out.println(dateTime);
		
		LocalDateTime f = now.plusDays(4).plusHours(3);
		System.out.println(f);
		
		LocalDateTime p = now.minusMonths(1);
		System.out.println(p);
		
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		int hour = now.getHour();
		
		System.out.println(year + "-" + month + "-" + day + "-" + hour);
		
		String str = "2026-03-31 15:47:40";
		DateTimeFormatter ff = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	}

}
