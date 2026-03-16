import java.util.*;

public class Method_2 {

	//2개의 정수를 받아서 -> 합을 리턴
	static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	static int minus(int a, int b) {
		int result = a - b;
		return result;
	}
	
	static int gop(int a, int b) {
		int result = a * b;
		return result;
	}
	
	static String div(int a, int b) {
		//0으로 나눌 수 없음 -> 문자로 되어있음
		String res = "";
		
		if(b == 0) {
			res = "0으로 나눌 수 없습니다.";
		}else {
			res = String.valueOf(a/(double)b);
		}
		return res;
	}
	
	//void 는 결과값을 출력하는것이기 때문에 return 따로 필요 없음.(자동으로 내부적으로 추가됨)
	static void process() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요: ");
		int a = scan.nextInt();
		
		System.out.print("연산자를 입력하세요(+, -, *, /): ");
		char op = scan.next().charAt(0);
		
		System.out.print("두 번째 정수를 입력하세요: ");
		int b = scan.nextInt();
		
		switch(op) {
		case '+' -> {
			int result = plus(a, b);
			System.out.println("결과: " + result);
		}
		case '-' -> {
			int result = minus(a, b);
			System.out.println("결과: " + result);
		}
		case '*' -> {
			int result = gop(a, b);
			System.out.println("결과: " + result);
		}
		case '/' -> {
			String result = div(a, b);
			System.out.println("결과: " + result);
		}
		default -> System.out.println("없는 연산자 입니다.");
		}

	}
	
	public static void main(String[] args) {
		
		process();
	}

}
