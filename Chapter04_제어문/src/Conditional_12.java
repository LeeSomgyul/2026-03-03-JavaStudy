import java.util.*;

public class Conditional_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력: ");
		int year = scan.nextInt();
		
		System.out.println("입력된 년도: " + year);
		
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println(year + "년도는 윤년입니다.");
		}else {
			System.out.println(year + "년도는 윤년이 아닙니다.");
		}
	}

}
