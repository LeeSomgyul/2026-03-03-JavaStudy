
public class loop_9 {

	public static void main(String[] args) {
		
		int even = 0;
		int odd = 0;
		int sum = 0;
		
		int i = 1;
		while(i<=100) {
			sum += i;
			if(i%2==0) {
				even += i;
			}else {
				odd += i;
			}
			i++;
		}
		
		System.out.println("총합: " + sum);
		System.out.println("짝수합: " + even);
		System.out.println("홀수합: " + odd);

	}

}
