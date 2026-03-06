import java.util.*;

public class Statements_type {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println(num + "는(은) 짝수입니다.");
		}
		if(num%2==1) {
			System.out.println(num + "는(은) 홀수입니다.");
		}

	}

}
