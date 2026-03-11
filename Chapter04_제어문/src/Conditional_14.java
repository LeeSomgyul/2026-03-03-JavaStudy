import java.util.*;

public class Conditional_14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("월 입력: ");
		int month = scan.nextInt();
		
		if(month==3 || month==4 || month==5) {
			System.out.println(month + "월은 봄 입니다.");
		}else if(month==6 || month==7 || month==8) {
			System.out.println(month + "월은 여름 입니다.");
		}else if(month==9 || month==10 || month==11) {
			System.out.println(month + "월은 가을 입니다.");
		}else if(month==12 || month==1 || month==2) {
			System.out.println(month + "월은 겨울 입니다.");
		}else {
			System.out.println("없는 달입니다!");
		}
	}

}
