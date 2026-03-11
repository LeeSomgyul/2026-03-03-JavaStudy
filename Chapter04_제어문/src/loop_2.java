import java.util.*;

public class loop_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random r = new Random();
		int com = r.nextInt(100) +1;
		
		for(;;) {
			System.out.print("1~100사이의 정수 입력: ");
			int user = scan.nextInt();
			
			if(com > user) {
				System.out.println("입력값보다 큰 수 입력!");
			}else if(com < user) {
				System.out.println("입력값보다 작은수 입력!");
			}else {
				System.out.println("게임 오바");
				System.exit(0);
			}
		}
		
	}

}
