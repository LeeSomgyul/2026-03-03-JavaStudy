import java.util.*;

public class Array_4 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		Random r = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
		}
		
		for(int i:arr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n===== 결과값 =====");
		int max = arr[0];
		int min = arr[0];
		
		for(int i:arr) {
			if(max<i) {
				max = i;
			}
			if(min>i) {
				min = i;
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == max) {
				System.out.println("최대값은 " + (i+1) + "번째에 있다.");
			}else if(arr[i] == min) {
				System.out.println("최소값은 " + (i+1) + "번째에 있다.");
			}
		}
	}

}
