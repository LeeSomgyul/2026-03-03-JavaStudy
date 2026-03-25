
class A{
	

}

class B extends A{
	
}

public class 예외처리_1 {

	String msg;
	
	public static void main(String[] args) {
		
		//예외처리_1 a = new 예외처리_1();
		//예외처리_1 a = null;
		//a.msg.substring(2);
		
		
		try {
			A a = new A();
			B b = (B)a;
		}catch(ClassCastException e) {
			e.printStackTrace();
		}

	}

}
