import java.util.Arrays;

public class Method_4 {

	//대문자 <=> 소문자 변경
	static char change(char c) {
		return c>='A' && c <='Z' ? (char)(c+32):(char)(c-32);
	}
	
	//최대값
	static int max(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	//최소값
	static int min(int[] arr) {
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	//오름차순 정렬
	static void asc(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("오름차순 정렬 후: ");
		System.out.println(Arrays.toString(arr));
	}
	
	//내림차순 정렬
	static void desc(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("내림차순 정렬 후: ");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		char c = 'B';
		char res = change(c);
		System.out.println(res);
		
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		int max = max(arr);
		int min = min(arr);
		
		System.out.print("정렬 전: ");
		System.out.println(Arrays.toString(arr));
		asc(arr);
		desc(arr);
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
