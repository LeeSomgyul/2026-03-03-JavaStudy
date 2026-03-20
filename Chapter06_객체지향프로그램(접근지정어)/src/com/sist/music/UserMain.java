package com.sist.music;

import java.util.*;

public class UserMain {

	public static void main(String[] args) {
		GenieMusicSystem gm = new GenieMusicSystem();
		
		while(true) {
			int m = gm.menu();
			
			if(m == 5) {
				System.out.println("시스템 종료");
				break;
			}else if(m == 1) {
				gm.musicList();
			}else if(m == 2) {
				Scanner scan = new Scanner(System.in);
				System.out.print("번호입력: ");
				int no = scan.nextInt();
				gm.musicDetail(no);
				
			}else if(m==3) {
				Scanner scan = new Scanner(System.in);
				System.out.print("검색어 입력: ");
				String findData = scan.next();
				gm.titleFind(findData);
			}else if(m==4) {
				Scanner scan = new Scanner(System.in);
				System.out.print("검색어 입력: ");
				String findData = scan.next();
				gm.singerFind(findData);
			}
		}

	}

}
