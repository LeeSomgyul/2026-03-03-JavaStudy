import java.util.*;

public class BinaryChange {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] binary = new int[16];
		int index = 15;
		
		System.out.print("0~32767까지 사이의 정수 입력: ");
		int num = scan.nextInt();
		
		System.out.println("라이브러리: " + Integer.toBinaryString(num));//2진법으로 바꿔주는 라이브러리
		System.out.println("라이브러리: " + Integer.toOctalString(num));//8진법으로
		System.out.println("라이브러리: " + Integer.toHexString(num));//16진법으로
		
		//======= 직접 2진법 구현하기 =======
		//1.2로 나누고 나머지를 저장
		//2.또 2로 나누고 나머지를 저장... -> 나머지가 1 또는 0이 나올때까지 반복
		while(true) {
			binary[index] = num%2;//진법 바꿀때는 오른쪽 끝 숫자부터 바꿔야 함
			num = num/2;//몫 갱신
			
			if(num == 0) break;
			
			index--;
		}
		
		for(int i=0; i<binary.length; i++) {
			//4칸씩 끊어서 출력
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}

	}

}
