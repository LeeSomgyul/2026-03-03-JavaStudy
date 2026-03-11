import java.util.*;

public class test_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//1. 1부터 100까지 숫자 중 짝수의 합을 구하는 프로그램을 작성하시오.
//		int result = 0;
//		for(int i=1; i<=100; i++) {
//			if(i%2==0) {
//				result += i;
//			}
//		}
//		
//		System.out.println("1번 답: " + result);
		
		//2. 사용자에게 숫자 n을 입력받아 1부터 n까지 합을 구하시오.
//		System.out.print("정수를 입력하세요: ");
//		int user = scan.nextInt();
//		int result = 0;
//		
//		for(int i=1; i<=user; i++) {
//			result += i;
//		}
//		
//		System.out.println("2번 답: " + result);
		
		//3. 1부터 50까지 숫자 중 3의 배수만 출력하시오.
//		for(int i=1; i<=50; i++) {
//			if(i%3==0) {
//				System.out.print(i + " ");
//			}
//		}
		
		//4. 1~100 사이에서 7의 배수 개수를 구하시오
//		int count = 0;
//		
//		for(int i=1; i<=100; i++) {
//			if(i%7==0) {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
		
		//5. 문자열 "JavaProgramming" 의 각 문자 하나씩 출력하시오
//		String s = "JavaProgramming";
//		for(int i=0; i<s.length(); i++) {
//			char c = s.charAt(i);
//			System.out.println(c);
//		}
		
		//6. 1부터 10까지 숫자를 while문으로 출력하시오.
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		//7. 사용자에게 숫자를 입력받아 1부터 그 숫자까지 출력하시오.
//		System.out.print("정수를 입력하세요: ");
//		int user = scan.nextInt();
//		for(int i=1; i<=user; i++) {
//			System.out.println(i);
//		}
		
		//8. 1~100 사이 홀수만 출력하시오.
//		for(int i=1; i<=100; i++) {
//			if(i%2!=0) {
//				System.out.print(i + " ");
//			}
//		}
		
		//9. 1~100 사이 숫자 중 5의 배수 합을 구하시오.
//		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			if(i%5==0) {
//				sum += i;
//			}
//		}
//		
//		System.out.println(sum);
		
		//10. 숫자 10부터 1까지 역순 출력하시오.
		for(int i=10; i>=1; i--) {
			System.out.print(i + " ");
		}
		
	}

}
