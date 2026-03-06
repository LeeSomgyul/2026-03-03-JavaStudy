import java.util.*;

public class Operator_13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력(0~100): ");
		
		int score = scan.nextInt();
		
		String result = score >= 0 && score <= 100 ? "정상입력" : "비정상입력";
		System.out.println("res: " + result);
	}

}
