import java.util.*;

public class Array_7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int win = 0;
		int lose = 0;
		int same = 0;
		
		String[] res = {"가위", "바위", "보"};
		
		for(int i=1; i<10; i++) {
			int com = (int)(Math.random()*3);
			
			System.out.print("가위(0), 바위(1), 보(2): ");
			int user = scan.nextInt();
			
			if(user < 0 || user >2) {
				System.out.println("잘못된 입력입니다.");
				i--;
				continue;//i++ 증가식으로 이동하니까 위에서 i--로 함. (게임 10번 해야하는데 9번만 하게되니까)
			}
			
			System.out.println("컴퓨터: " + res[com]);
			System.out.println("사용자: " + res[user]);
			
			int r = com - user;
			if(r == -1 || r == 2) {
				System.out.println("승");
				win++;
			}else if(r == 1 || r == -2) {
				System.out.println("패");
				lose++;
			}else {
				System.out.println("무");
				same++;
			}
			
			System.out.printf("결과: %d승 - %d무 - %d패\n", win, same, lose);
			
		}
		
//		int com = (int)(Math.random()*3);
//		int user = scan.nextInt();
//		
//		
//		System.out.println("사용자: " + res[user]);
//		System.out.println("컴퓨터: " + res[com]);
//		
//		System.out.println("===== 결과값 =====");
//		int r = com - user;
//		if(r == -1 || r == 2) {
//			System.out.println("유저 승리!");
//		}else if(r == 1 || r == -2) {
//			System.out.println("컴퓨터 승리!");
//		}else {
//			System.out.println("비겼당~!");
//		}
	}

}
