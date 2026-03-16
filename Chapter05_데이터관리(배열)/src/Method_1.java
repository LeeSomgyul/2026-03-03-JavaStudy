
public class Method_1 {
	
	//<메소드 선언 위치>
	//유형1) 매개변수X, 리턴X
	static void sum1() {
		int hap = 0;
		for(int i=1; i<=10; i++) {
			hap+=i;
		}
		System.out.println("1~10까지의 합: " + hap);
		return;
	}
	
	//유형2) 매개변수O, 리턴O
	static int sum2(int n) {
		int hap = 0;
		for(int i=1; i<=n; i++) {
			hap += i;
		}
		return hap;
	}

	public static void main(String[] args) {
		
		sum1();
		int a = sum2(20);
		
		System.out.println("1~a까지의 합: " + a);
		
		return;

	}

}
