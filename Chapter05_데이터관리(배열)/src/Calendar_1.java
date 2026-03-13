import java.util.*;

public class Calendar_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int year = 0; 
		int month = 0; 
		int day = 0;
		
		System.out.print("년도 입력: ");
		year = scan.nextInt();
		
		System.out.print("월 입력: ");
		month = scan.nextInt();
		
		System.out.print("일 입력: ");
		day = scan.nextInt();
		
		System.out.println(year + "년도 " + month + "월");
		
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		
		for(String w:strWeek) {
			System.out.print(w + "\t");
		}
		
		//요일 구하기(총 일수 %7)
		int total = (year-1)*365
				+(year-1) / 4
				-(year-1)/100
				+(year-1)/400;
		
		int[] lastday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//윤년이면
		if((year%4 == 0 && year%100!=0) || (year%400==0)) {
			lastday[1] = 29;
		}else {
			//윤년이 아니면
			lastday[1] = 28;
		}
		
		for(int i=0; i<month-1; i++) {
			total += lastday[i];
		}
		
		//1일자 확인
		total++;
		
		//요일 구하기
		int week = total%7;
		
		System.out.println();
		for(int i=1; i<lastday[month-1]; i++) {
			if(i==1) {
				for(int j=1; j<=week; j++) {
					System.out.println("\t");
				}
			}
			System.out.printf("%2d\t", i);
			
			week++;
			
			if(week > 6) {
				week = 0; 
				System.out.println();
			}
		}
	}

}
