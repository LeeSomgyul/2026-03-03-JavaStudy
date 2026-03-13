import java.util.*;

public class game_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] com = new int[3];
		int[] user = new int[3];
		
		for(int i=0; i<3; i++) {
			//컴퓨터의 랜덤 숫자 만들기
			com[i] = (int)(Math.random()*9)+1;
			//중복 제거
			for(int j=0; j<i; j++) {
				if(com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		
		while(true) {
			System.out.print("세자리 정수를 입력하세요: ");
			int input = scan.nextInt();
			
			if(input < 100 || input >999) {
				System.out.println("잘못된 입력입니다!!");
				continue;
			}
			
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			//같은수 입력하면 안됨
			if(user[0] == user[1] || user[0] == user[2] || user[1] == user[2]) {
				System.out.println("같은 수는 사용할 수 없습니다.");
				continue;
			}
			
			//0을 입력하면 안됨
			if(user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			
			//유효성 검사
			int s = 0; 
			int b = 0;
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					//같은 수가 있는지 확인
					if(com[i] == user[i]) {
						if(i==j) s++;
						else b++;
					}
				}
			}
			
			System.out.printf("Input Number: %d, Result: %dS - %dB\n", input, s, b);
			
			if(s == 3) {
				System.out.println("게임 오버!");
				break;
			}
		}

	}

}
