import java.util.*;

public class Conditional_15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력(0~100):");
		int score = scan.nextInt();
		char c = 'A';
		
//		switch(score/10) {
//		case 10:
//		case 9:
//			c='A';
//			break;
//		case 8:
//			c='B';
//			break;
//		case 7:
//			c='C';
//			break;
//		case 6:
//			c='D';
//			break;
//		default:
//			c='F';
//		}
		
		String s = switch(score/10) {
		case 10,9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		
		System.out.println("학점: " + c);

	}

}
