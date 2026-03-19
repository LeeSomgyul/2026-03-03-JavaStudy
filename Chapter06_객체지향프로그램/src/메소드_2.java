
class CallByValue{
	void swap(int a, int b) {
		System.out.println("변경전: a=" + a + ", b=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("변경후: a=" + a + ", b=" + b);
	}
	
	void swap2(String s1, String s2) {
		System.out.println("변경전: s1=" + s1 + ", s2=" + s2);
		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("변경후: s1=" + s1 + ", s2=" + s2);
	}
}

class Value{
	int a = 100;
	int b = 200;
}

class CallByReference{
	void swap(int[] arr) {
		System.out.println("수행전 arr[0] = " + arr[0] + "수행후 arr[0] = " + arr[0]);
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println("수행전 arr[0] = " + arr[0] + "수행후 arr[0] = " + arr[0]);
	}
	
	void swap2(Value v) {
		System.out.println("수행전 v.a = " + v.a + "수행전 v.b = " + v.b);
		int temp = v.a;
		v.a = v.b;
		v.b= temp;
		System.out.println("수행후 v.a = " + v.a + "수행후 v.b = " + v.b);
	}
}



public class 메소드_2 {

	public static void main(String[] args) {
		
		CallByValue cv = new CallByValue();
		int a = 10;
		int b = 20;
		cv.swap(a, b);
		
		System.out.println("원본이 바뀌나?: a=" + a + ", b=" + b);
		
		String s1 = "홍길동";
		String s2 = "심청이";
		cv.swap2(s1, s2);
		
		System.out.println("원본이 바뀌나?: s1=" + s1 + ", s2=" + s2);
		
		CallByReference cr = new CallByReference();
		int[] arr = {10, 50};
		cr.swap(arr);
		
		System.out.println("원본이 바뀌나?: arr[0]=" + arr[0] + ", arr[1]=" + arr[1]);
		
		int[] data = {10,20};
		int[] copy = data;
		System.out.println("copy의 주소: " + copy);
		System.out.println("data의 주소: " + data);
		
		copy[0] = 100;
		System.out.println("data[0] = " + data[0]);
		
		//clone 은 위치가 다른곳에 복사본을 만든다.(다른 힙 공간 마련) 즉, 주소가 달라짐. 
		int[] copy2 = data.clone();
		System.out.println("copy2 = " + copy2);
		
		Value v = new Value();

	}

}
