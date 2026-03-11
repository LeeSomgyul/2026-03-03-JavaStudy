
public class loop_5 {

	public static void main(String[] args) {
		
		int a = 0;//짝수
		int b = 0;//홀수
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				a += i;
			}else if(i%2!=0) {
				b += i;
			}
		}
		
		System.out.println("짝수 합: " + a);
		System.out.println("홀수 합: " + b);

	}

}
