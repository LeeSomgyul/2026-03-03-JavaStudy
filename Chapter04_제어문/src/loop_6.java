
public class loop_6 {

	public static void main(String[] args) {
		
		int result = 0;
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				result -= i;
			}else {
				result += i;
			}
		}
		
		System.out.println(result);
		
		for(int i=1; i<=10; i++) {
			if(i%3!=0) System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i%2==0 && i%5==0) {
				System.out.print(i + " ");
			}
		}

	}

}
