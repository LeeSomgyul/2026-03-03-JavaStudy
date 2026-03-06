import java.util.*;

public class Conditional_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) 숫자를 입력하세요: ");
		
		int user = scan.nextInt();
		
		if(user == 0) System.out.println("사용자: 가위");
		if(user == 1) System.out.println("사용자: 바위");
		if(user == 2) System.out.println("사용자: 보");
		
		int com = (int)(Math.random()*3);
		System.out.print("컴퓨터: ");
		
		if(com == 0) {
			System.out.println("가위");
		}
		if(com == 1) {
			System.out.println("바위");
		}
		if(com == 2) {
			System.out.println("보");
		}
		
		int res = com - user;
		if(res == 0) System.out.println("비겼다!!");
		if(res == 1 || res == -1) {
			System.out.println("사용자 승리!!");
		}else {
			System.out.println("컴퓨터 승리!!");
		}
		
	}

}
