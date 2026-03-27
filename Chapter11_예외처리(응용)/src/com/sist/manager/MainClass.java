package com.sist.manager;

import java.util.Scanner;

import com.sist.vo.FoodVO;

public class MainClass {

	public static void main(String[] args) {
		
//		int data = 29;
//		int total = (int)(Math.ceil(data/12.0));
//		System.out.println(total);
		
		FoodManager fm = new FoodManager();
		Scanner scan = new Scanner(System.in);
		int total = fm.food_total();
		System.out.print("페이지를 입력하세요(1~" +total + "): ");
		int page = scan.nextInt();
		FoodVO[] food = fm.food_list(page);
		
		for(FoodVO vo:food) {
			System.out.println(vo.getNo() + "." + vo.getName());
		}
		
		System.out.println("상세보기 할 맛집 번호 입력: ");
		
		int no = scan.nextInt();
		
		FoodVO vo = fm.food_detail(no);
		System.out.println("맛집 번호: " + vo.getNo());
		System.out.println("맛집명: " + vo.getName());
		System.out.println("주소: " + vo.getAddress());

	}

}
