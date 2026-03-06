import java.util.*;

public class Conditional_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수 입력: ");
		int kor = scan.nextInt();
		
		System.out.print("영어 점수 입력: ");
		int eng = scan.nextInt();
		
		System.out.print("수학 점수 입력: ");
		int math = scan.nextInt();
		
		int avg = (kor + eng + math) / 3;
		
		if(avg >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
}
