import java.util.*;

public class Conditional_8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수: ");
		int kor = scan.nextInt();
		
		System.out.print("수학 점수: ");
		int math = scan.nextInt();

		System.out.print("영어 점수: ");
		int eng = scan.nextInt();
		
		int total = kor + math + eng;
		double avg = total/3.0;
		
		char score = 'A';
		if(avg >= 90) score = 'A';
		else if(avg >= 80) score = 'B';
		else if(avg >=70) score = 'C';
		else if(avg >=60) score = 'D';
		else score = 'E';
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.println("학점: " + score);

	}

}
