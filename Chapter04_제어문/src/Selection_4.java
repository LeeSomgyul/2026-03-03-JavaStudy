import java.util.*;

public class Selection_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연산자 입력: ");
		String op = scan.next();

		System.out.print("첫번째 정수 입력: ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		int num2 = scan.nextInt();
		
//		switch(op)
//		{
//		case "+":
//			System.out.printf("%d+%d=%d\n", num1, num2, num1 + num2);
//			break;
//		case "-":
//			System.out.printf("%d-%d=%d\n", num1, num2, num1 - num2);
//			break;
//		case "*":
//			System.out.printf("%d*%d=%d\n", num1, num2, num1 * num2);
//			break;
//		case "/":
//			System.out.printf("%d/%d=%d\n", num1, num2, num1 / num2);
//			break;
//		default: System.out.println("없는 연산자입니다.");
//		}
		
		switch(op)
		{
		case "+" -> {
			System.out.printf("%d+%d=%d\n", num1, num2, num1 + num2);
			System.out.println("프로그램 종료");
		}
		case "-" ->
			System.out.printf("%d-%d=%d\n", num1, num2, num1 - num2);
		case "*" ->
			System.out.printf("%d*%d=%d\n", num1, num2, num1 * num2);
		case "/" ->
			System.out.printf("%d/%d=%d\n", num1, num2, num1 / num2);
		default-> System.out.println("없는 연산자입니다.");
		}
	}
}
