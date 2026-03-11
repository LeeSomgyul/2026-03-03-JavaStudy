import java.util.*;

public class loop_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단 입력?: ");
		int dan = scan.nextInt();
		
		int i = 1;
		
		while(i<=9) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			i++;
		}
	}

}
