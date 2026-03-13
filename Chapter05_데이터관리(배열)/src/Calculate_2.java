//빈도수 구하기
//숫자를 100번 랜덤으로 돌렸을 떄 0~9가 몇번 나오는가?
import java.util.Arrays;

public class Calculate_2 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i=1; i<=100; i++) {
			int rand = (int)(Math.random()*10);
			arr[rand]++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "가 몇 번 발생했나?: " + arr[i]);
		}
	}

}
