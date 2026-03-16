import java.util.*;

public class test_2 {
	
	//1.사용자로부터 아이디를 받아서 중복체크하는 메소드 원형을 작성하시오
	//매개변수: 사용자의 아이디
	//리턴: 중복인가? 아닌가? 의 참 거짓
	static boolean inCheck(String inputId) {
		String[] list = {"일번아이디", "이번아이디"};
		for(int i=0; i<list.length; i++) {
			if(inputId.equals(list[i])) {
				return false;
			}
		}
		return true;
	}
	
	//2. 우편번호를 검색하는 메소드 원형을 작성하시오
	//매개변수: 주소
	//리턴: 우편번호
	static String[] postFind(String dog) {
		String[] list = {"12345", "67891"};
		for(int i=0; i<list.length; i++) {
			if(dog.equals(list[i])){
				return list;
			}
		}
		return null;
	}
	
	//3. 2단에서 9단까지 구구단을 출력하는 메소드 원형을 작성하시오
	static void gogodan() {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = d", i, j, i*j);
			}
		}
	}
	
	//4. 1~10까지 출력하는 메소드 구현
	static void out() {
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
	}
	
	//5.1~10까지 합을 구하는 메소드 구현
	static void sum1() {
		int result = 0;
		for(int i=1; i<=10; i++) {
			result += i;
		}
		System.out.println(result);
	}
	
	//6. 1~n 까지 합을 구하는 메소드 구현
	//n: 사용자에게 입력받은 값
	static int sum2(int n) {
		int result = 0;
		for(int i=1; i<=n; i++) {
			result += i;
		}
		return result;
	}
	
	//7. 두 정수의 나눗셈 결과를 구해주는 메소드 구현
	//a, b: 사용자에게 입력받은 두 정수
	static double div(int a, int b) {
		double result = a/(double)b;
		return result;
	}
	
	//8. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
	static char change(char c) {
		return c>='A' && c <='Z' ? (char)(c+32):(char)(c-32);
	}
	
	//9. 문자열을 거꾸로 출력하는 메소드 구현
	static String reverse(String str) {
		String reversed = new StringBuilder(str).reverse().toString();
		return reversed;
	}
	
	//10. 정수를 입력 받아서 이진법을 출력하는 메소드 작성
	static String input(int n) {
		return Integer.toBinaryString(n);	
	}
	
	//11. 임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성 
	//1) 오름차순
	static void asc(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = arr[i];
				}
			}
		}
		
		System.out.println("오름차순 정렬: " + Arrays.toString(arr));
	}
	
	//2) 내림차순
	static void desc(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = arr[i];
				}
			}
		}
		
		System.out.println("내림차순 정렬: " + Arrays.toString(arr));
	}
	
	//12. 년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
	static void cal(int year) {
		if((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
			System.out.println(year + "년도는 윤년입니다.");
		}else {
			System.out.println(year + "년도는 윤년이 아닙니다.");
		}
	}

	public static void main(String[] args) {
		inCheck("일번아이디");
		postFind("12345");

	}

}
