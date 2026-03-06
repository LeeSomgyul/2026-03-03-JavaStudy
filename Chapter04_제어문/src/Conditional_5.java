import java.util.*;

public class Conditional_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력: ");
		
		int num = scan.nextInt();
		
		if(num == 0) {
			System.out.println("잘못된 입력입니다!");
			return;
		}else {
			if(num < 0) {
				System.out.println(num*-1);
			}else {
				System.out.println(num);
			}
		}
		
		System.out.println("검증: " + Math.abs(num));

	}
}
