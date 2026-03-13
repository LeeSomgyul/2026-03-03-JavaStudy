import java.util.*;

public class Calendar_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year = scan.nextInt();
		
		System.out.print("월 입력: ");
		int month = scan.nextInt();
		
		System.out.printf("%d년도 %d월\n", year, month);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);

		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("오늘은 " + strWeek[week-1] + "요일입니다.");
		System.out.println("이번달 말일은 " + lastday + " 입니다.");
	}

}
