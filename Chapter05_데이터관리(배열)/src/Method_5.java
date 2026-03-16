import java.util.*;

public class Method_5 {
	
	static int input(String subject) {
		Scanner scan = new Scanner(System.in);
		System.out.print(subject + " 입력: ");
		return scan.nextInt();
	}
	
	static int total(int kor, int eng, int math) {
		return kor + eng + math;
	}
	
	static double avg(int total) {
		return total/3.0;
	}
	
	static String score(int avg) {
		String score = switch((int)(avg/10)) {
		case 10,9 -> "A";
		case 8 -> "B";
		case 6 -> "C";
		case 7 -> "D";
		default -> "F";
		};
		return score;
	}

	public static void main(String[] args) {
		
		int kor = input("국어");
		int eng = input("영어");
		int math = input("수학");
		
		int total = total(kor, eng, math);
		double avg = avg(total);
		String score = score((int)(avg));
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.println("학점: " + score);

	}

}
