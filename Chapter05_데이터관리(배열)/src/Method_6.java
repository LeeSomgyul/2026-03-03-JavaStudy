
public class Method_6 {

	static void display() {
		System.out.println("display() 시작");
		System.out.println("display() 진행중");
		System.out.println("display() 종료");
	}
	
	static void increment() {
		int a = 10;
		System.out.println("a= " + a);
		a++;
	}
	
	public static void main(String[] args) {
		display();
		display();
		display();
		display();
	}

}
