import java.util.*;

public class Selection_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		int score = scan.nextInt();
	
		char op = 'A';
		
		String grade = switch(score/10) {
		case 10,9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		default -> "F";
		};
		
		System.out.println("학점: " + grade);
		
//		switch(score/10) {
//		case 10:
//		case 9:
//			op = 'A';
//			break;
//		case 8:
//			op = 'B';
//			break;
//		case 7:
//			op = 'C';
//			break;
//		default:
//			op = 'F';
//		}
		
	}

}
