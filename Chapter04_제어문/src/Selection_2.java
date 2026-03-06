import java.util.*;

public class Selection_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("번호를 선택하세요: ");
		int num = scan.nextInt();
		
		while(true) {
			System.out.println("1. 가요");
			System.out.println("2. 동요");
			System.out.println("3. POP");
			System.out.print("메뉴를 선택하세요: ");
			
			int choice = scan.nextInt();
			
			switch(choice) {
			case 2:
				System.out.println("아기 상어 뚜루뚜뚜~");
				break;
			}
		}
	}

}
