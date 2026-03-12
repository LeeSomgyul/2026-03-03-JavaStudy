import java.util.*;

public class test_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		//1.10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
//		char[] c = new char[10];
		
		//2. 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
//		int[] n = {0 ,1 , 2, 3, 4, 5};
		
		//3. '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
//		char[] day = {'일', '월', '화', '수', '목', '금', '토'};
		
		//4. 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.
//		boolean[] bool = {true, false, false, true};

		//5. 배열 alpha를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하시오.
//		char[] alpha = {'a', 'b', 'c', 'd'};
//		for(char i=0; i<alpha.length; i++) {
//			System.out.print(alpha[i]);
//		}
		
		//6. 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
//		System.out.print("양의 정수 10개를 입력하세요: ");
//		int[] arr = new int[10];
//		
//		for(int i=0; i<10; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		for(int i=0; i<10; i++) {
//			if(arr[i] % 3 ==0) {
//				System.out.println(arr[i]);
//			}
//		}
		
		//7. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라. 
//		int[] arr = new int[10];
//		int sum = 0;
//		
//		for(int i=0; i<10; i++) {
//			arr[i] = (int)(Math.random()*10)+1;
//		}
//		
//		for(int i=0; i<10; i++) {
//			System.out.print(arr[i] + " ");
//			sum += arr[i];
//		}
//		System.out.println();
//		System.out.println(sum/10);
		
		//8. 5개 정수를 입력받은 후 차례로 출력하는 프로그램 
//		int[] arr = new int[5];
//		System.out.print("5개의 정수를 입력하세요: ");
//		
//		for(int i=0; i<5; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		for(int a:arr) {
//			System.out.print(a + " ");
//		}
		
		//9. 문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 
//		char[] c = new char[10];
//		System.out.print("10개의 문자를 입력하세요: ");
//		
//		for(int i=0; i<10; i++) {
//			c[i] = scan.next().charAt(0);
//		}
//		
//		for(char i:c) {
//			System.out.print(i);
//		}
		
		//10. 정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램 
//		System.out.print("10개의 정수를 입력하세요: ");
//		int[] num = new int[10];
//		
//		for(int i=0; i<10; i++) {
//			num[i] = scan.nextInt();
//		}
//		
//		for(int i=0; i<10; i++) {
//			if(i+1 == 3 || i+1 == 5 || i+1 == num.length) {
//				System.out.print(num[i] + " ");
//			}
//		}
		
		//11. 10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
//		System.out.print("10개의 정수를 입력하세요: ");
//		int[] num = new int[10];
//		int max = 0;
//		
//		for(int i=0; i<10; i++) {
//			num[i] = scan.nextInt();
//			if(max < num[i]) {
//				max = num[i];
//			}
//		}
//		
//		System.out.println("최대값: " + max);
//		
		//12. 10명의 컴퓨터 정수를 입력받아 배열에 저장하고 총점과 평균을 구하여 출력하는 프로그램을 작성 
//		System.out.print("10개의 정수를 입력하세요: ");
//		int[] num = new int[10];
//		int total = 0;
//		
//		for(int i=0; i<10; i++) {
//			num[i] = scan.nextInt();
//			total += num[i];
//		}
//		
//		System.out.println("총점: " + total);
//		System.out.println("평균: " + (total/10));
		
		//13. 5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하는 프로그램 
		int[] arr = {95, 75, 85, 100, 50};
		Arrays.sort(arr);
		
		for(int a:arr) {
			System.out.print(a + " ");
		}
		
		
		
		
		
		
		
	}

}
