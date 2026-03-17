
public class String_3 {

	public static void main(String[] args) {
		String msg = "Hello Java";
		System.out.println("대문자로 변환: " + msg.toUpperCase());
		System.out.println("소문자로 변환: " + msg.toLowerCase());
		//msg = msg.toLowerCase(); 이렇게 안하면 실제 데이터는 불변하다
		System.out.println("실제 데이터는 불변: " + msg);
		
		String s = msg.replace('l', 'k');
		System.out.println("l를 k로 바꾸기: " + s);
		
		
	}

}
