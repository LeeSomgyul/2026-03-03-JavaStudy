import java.util.*;

public class Variable_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 영어 수학 입력(90 90 90): " );
		
		int 국어 = scan.nextInt();
		int 영어 = scan.nextInt();
		int 수학 = scan.nextInt();
		
		int 총점 = 국어 + 영어 + 수학;
		
		System.out.println("총점: " + 총점);
		System.out.printf("평균: %.2f", (총점/3.0));
	}

}
