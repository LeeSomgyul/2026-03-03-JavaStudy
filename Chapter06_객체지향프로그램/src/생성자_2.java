class People{
	int a;
	People(){
		a=100;
		System.out.println("Member 생성자 호출 = a: ");
	}
	
	void display() {
		System.out.println("객체 활용");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("객체 소멸...");
	}
	
}

public class 생성자_2 {

	public static void main(String[] args) {
		
		People m = new People();
		m.display();
		m = null;
		System.gc();
	}

}
