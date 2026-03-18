import java.util.*;

class Diary{
	int year, month, week, lastday;
	
	void init() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력: ");
		year = scan.nextInt();
		
		System.out.print("월 입력: ");
		month = scan.nextInt();
	}
	
	void weekLastday() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year); //사용자가 지정한 year 로 지정
		cal.set(Calendar.MONDAY, month-1);//사용자가 지정한 month 로 지정
		cal.set(Calendar.DATE, 1); //달력의 시작일자를 1로 지정 
		
		week = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일정보를 가져옴(자바에서는 요일을 숫자로 한다. 일요일=1, 월요일=2 ...)
		lastday = cal.getActualMaximum(Calendar.DATE); //해당 월의 마지막 날짜를 구함
		week = week -1;
	}
	
	void print() {
		System.out.println(year + "년도 " + month + "월\n");
		
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		
		for(String s:strWeek) {
			System.out.print(s + "\t");
		}
		
		System.out.println("\n");
		
		for(int i=1; i<=lastday; i++) {
			if(i==1) {
				for(int j=0; j<week; j++) {
					System.out.println("\t");
				}
			}
			System.out.printf("%02d\t", i);
			week++;
			
			if(week>6) {
				week = 0;
				System.out.println();
			}
		}
	}
}

public class 클래스_멤버변수_정리 {

	public static void main(String[] args) {
		
		Diary d = new Diary();
		d.init();
		d.weekLastday();
		d.print();
	}

}
