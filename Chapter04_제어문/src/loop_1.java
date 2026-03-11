import java.util.*;

public class loop_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("단 입력: ");
		int dan = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
		System.out.println();
		
		for(int i=9; i>=1; i--) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
		System.out.println();
		
		String str = "Hello Java";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		
		int a = 0;
		int b = 0;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c>='A' && c<='Z') {
				a++;
			}else {
				b++;
			}
		}
		System.out.println("대문자: " + a);
		System.out.println("소문자: " + b);
	}
}
