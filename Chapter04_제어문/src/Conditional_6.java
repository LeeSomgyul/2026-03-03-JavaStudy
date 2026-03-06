import java.util.*;

public class Conditional_6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력: ");
		int num1 = scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/): ");
		String op = scan.next();
		
		System.out.print("두번째 정수 입력: ");
		int num2 = scan.nextInt();
		
		char c = op.charAt(0);
		
		if(c=='+') {
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
		}else if(c=='-') {
			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
		}else if(c=='*') {
			System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
		}else if(c=='/') {
			if(num2==0) {
				System.out.println("0으로는 나눌 수 없습니다!");
			}else {
				System.out.printf("%d/%d=%d\n", num1, num2, num1/num2);
			}
		}else {
			System.out.println("잘못된 연산자입니다.");
		}
	}
}
