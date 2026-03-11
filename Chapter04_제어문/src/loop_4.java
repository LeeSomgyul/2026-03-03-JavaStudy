
public class loop_4 {

	public static void main(String[] args) {
		
		int a3 = 0, a5 = 0, a7 = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				a3++;
			}else if(i%5==0) {
				a5++;
			}else if(i%7==0) {
				a7++;
			}
		}
		
		System.out.println("3의 배수 개수: " + a3);
		System.out.println("5의 배수 개수: " + a5);
		System.out.println("7의 배수 개수: " + a7);
	}

}
