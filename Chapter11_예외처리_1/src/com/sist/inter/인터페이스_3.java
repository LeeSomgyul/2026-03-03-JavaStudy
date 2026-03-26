package com.sist.inter;

import java.util.*;

interface Game{
	public void start();
}

class MoleGame implements Game{

	@Override
	public void start() {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int score = 0;
		
		System.out.println("🎮 두더지 게임 스타트~!!");
		System.out.println("1~3사이의 두더지가 나오면 위치를 맞추세요.");
		
		//총 5라운드 실행
		for(int i=1; i<=5; i++) {
			int mole = rand.nextInt(3) + 1;
			System.out.println("\n[라운드 " + i + "]");
			System.out.println("두더지가 나타났다!(1~3): ");
			
			long startTime = System.currentTimeMillis();//게임 시작 시간
			
			int input = scan.nextInt();
			long endTime = System.currentTimeMillis();//게임 종료 시간 
			
			long time = endTime - startTime; //게임 걸린 시간
			
			//2000 = 2초
			if(time > 2000) {
				System.out.println("⏰ 입력이 너무 느려용! 실패!!!!!!💣");
				continue;
			}
			
			if(input == mole) {
				System.out.println("🥳 정답입니당~~");
				score++;
			}else {
				System.out.println("🤯💥 오 노우 틀려버렸엉");
			}
		}
		
		System.out.println("🏴 당신의 점수는 " + (score * 20) + "점 입니다.");
		
	}
	
}

class SpeedGame implements Game{

	@Override
	public void start() {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("🏃🏻‍♀️‍➡️ 순발력 게임 시작!!");
		System.out.println("👉🏻 [지금!!]이 뜨면 Enter를 누르세요!");
		System.out.println("💥 빨리 누르면 실패!!");
		
		try {
			System.out.println("\n🕹️ 준비...");
			Thread.sleep(rand.nextInt(3000) + 2000); //2~5사이의 랜덤 초 
		}catch(Exception ex) {
		
		}
		
		long startTime = System.currentTimeMillis();//게임 시작 시간
		System.out.println("[지금!!]");
		
		scan.nextLine(); //사용자가 엔터치기 
		long endTime = System.currentTimeMillis();//게임 종료 시간 
		
		long time = endTime - startTime; //게임 걸린 시간
		
		if(time < 100) {
			System.out.println("반칙!! 속도가 너무 빨라요!");
		}else if(time < 300) {
			System.out.println("허거더더덩!! 엄청 빠름: [ " + time + "ms ]");
		}else if(time < 700) {
			System.out.println("음.. 보통 속도: [ " + time + "ms ]");
		}else {
			System.out.println("혹시 거북이세요? 핵느림!: [ " + time + "ms ]");
		}
		
		
	}
	
}

public class 인터페이스_3 implements Game{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("게임 선택 [두더지 게임(1)], [순발력 게임(2)]: ");
		int menu = scan.nextInt();
		
		Game game = null;
		if(menu == 1) {
			game = new MoleGame();
		}else if(menu == 2) {
			game = new SpeedGame();
		}
		
		game.start();

	}

	@Override
	public void start() {
		
		
	}

}
