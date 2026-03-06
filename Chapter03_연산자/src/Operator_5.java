import java.util.*;

public class Operator_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 입력: ");
		int kor = scan.nextInt();
		
		System.out.print("수학 입력: ");
		int math = scan.nextInt();
		
		System.out.print("영어 입력: ");
		int eng = scan.nextInt();
		
		
		int total = kor + math + eng;
		double avg = (double)total / 0.0;
		
		System.out.println("국어 점수: " + kor);
		System.out.println("수학 점수: " + math);
		System.out.println("영어 점수: " + eng);
		
		System.out.println("======== 최종 결과 ========");
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n", avg);
	}
}
