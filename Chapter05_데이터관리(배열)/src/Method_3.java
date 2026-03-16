import java.util.*;

public class Method_3 {
	
	static void gugudan(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan , i, dan*i);
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력해 주세요: ");
		int dan = scan.nextInt();
		gugudan(dan);
		
		System.out.println("==========");
		System.out.print("단을 입력해 주세요: ");
		
		dan = scan.nextInt();
		gugudan(dan);

	}

}
