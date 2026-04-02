package com.sist.collection;

import java.util.*;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Sawon{
	private int sabun;
	private String name;
	private String sex;
	private String dept;
	private String job;
	private String loc;
	private long pay;
	
}

public class Collection_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Sawon(1, "홍길동", "남자", "개발부", "사원", "서울", 300));
		list.add(new Sawon(2, "홍길동", "남자", "개발부", "사원", "서울", 300));
		list.add(new Sawon(3, "홍길동", "남자", "개발부", "사원", "서울", 300));
		list.add(new Sawon(4, "홍길동", "남자", "개발부", "사원", "서울", 300));
		list.add(new Sawon(5, "홍길동", "남자", "개발부", "사원", "서울", 300));
		
		System.out.println("==== 사원 목록 출력 =====");
		
		for(Object obj:list) {
			Sawon s = (Sawon)obj;
			System.out.println(s.getSabun() + " " + s.getName() + " " + s.getSex() + " " + s.getDept());
		}
		
		System.out.println("==== 이름 검색 =====");
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = scan.nextLine();
		
		
		for(Object obj:list) {
			Sawon s = (Sawon)obj;
			System.out.println(s.getSabun() + " " + s.getName() + " " + s.getSex() + " " + s.getDept());
			if(s.getName().contains(name)) {
				System.out.println(s.getSabun() + " " + s.getName() + " " + s.getSex() + " " + s.getDept());
			}
		}
		
		
	}

}
