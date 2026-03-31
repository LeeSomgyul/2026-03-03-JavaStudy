package com.sist.lang;

import java.util.Calendar;
import java.util.Scanner;

public class 날짜_시간_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year = scan.nextInt();
		
		System.out.println("월 입력: ");
		int month = scan.nextInt();
		
		System.out.println("일 입력: ");
		int day = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		
		String[] strWeek = {"", "일", "월", "화", "수", "목", "금", "토"};
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(strWeek[week] + "요일");
	}

}
