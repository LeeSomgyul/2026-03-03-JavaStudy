
public class Method_1 {

	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println("s1이 가지고 있는 문자 개수: " + s1.length());
		
		String msg = "Hello Java";
		System.out.println("msg가 가지고 있는 3번째 문자: " + msg.charAt(3));
		System.out.println("msg가 가지고 있는 7번째 문자: " + msg.charAt(7));
		
		String hong = "admin";
		String shim = "admin";
		String park = new String("admin");
		
		//==는 주소값을 비교하는 연산자
		if(hong == shim) {
			System.out.println("hong과 shim은 같다.");
		}else {
			System.out.println("hong과 shim은 같지 않다.");
		}
		
		//equals 는 주소값이 아닌 문자 자체를 비교한다
		if(hong.equals(park)) {
			System.out.println("hong과 park은 같다.");
		}

	}

}
