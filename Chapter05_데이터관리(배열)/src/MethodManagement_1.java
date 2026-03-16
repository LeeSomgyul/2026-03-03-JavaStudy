import java.util.*;

public class MethodManagement_1 {
	
	static int random() {
		int com = (int)(Math.random()*100)+1;
		return com;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random()*100)+1;
		
		while(true) {
			System.out.print("1~100 사이의 정수 입력: ");
			int user = scan.nextInt();
			
			if(user<1 || user>100) {
				System.out.println("잘못된 입력입니다!!");
				continue;
			}
			
			if(com > user) {
				System.out.println("입력값보다 높은 수를 입력하세요");
			}else if(com<user) {
				System.out.println("입력값보다 작은 수를 입력하세요");
			}else {
				System.out.println("정답!");
				break;
			}
		}

	}

}
