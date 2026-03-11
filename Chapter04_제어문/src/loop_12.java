import java.util.*;

public class loop_12 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int com = r.nextInt(100) + 1;
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("1~100사이의 정수 입력: ");
			int user = scan.nextInt();
			
			if(user<1 || user>100) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			if(com > user) {
				System.out.println("입력값보다 큰 값 입력");
			}else if(com<user) {
				System.out.println("입력값보다 작은 값 입력");
			}else {
				System.out.println("Game Over!!");
				break;
			}
		}while(true);
		
	}

}
