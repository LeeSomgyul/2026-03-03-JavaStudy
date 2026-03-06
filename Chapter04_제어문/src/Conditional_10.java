import java.util.*;

public class Conditional_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("월 입력: ");
		
		int no = scan.nextInt();
		
		if(no >= 1 && no <= 12) {
			if(no>=3 && no <=5) {
				System.out.println("계절은 봄입니다!!");
			}else if(no >=6 && no<=8) {
				System.out.println("계절은 여름입니다!!");
			}else if(no>=9 && no<=11) {
				System.out.println("계절은 가을입니다!!");
			}else {
				System.out.println("계절은 겨울입니다!!");
			}
		}else {
			System.out.println("없는 달입니다!!");
		}
	}
}
