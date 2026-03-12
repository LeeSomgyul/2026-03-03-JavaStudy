import java.util.*;

public class Array_1 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		
//		arr[0] = 100;
//		arr[1] = 200;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		//직접 메모리 주소로 찾아가는 버전(수정 가능)
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		//값 가져와서 보여주기만 하는 읽기전용(수정 불가)
		System.out.println("=============");
		
		for(int a:arr) {
			System.out.println(a);
		}
		
	}

}
