import java.util.*;

public class Conditional_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("아이디를 입력하세요: ");
		String id = scan.next();
		
		System.out.println("비밀번호를 입력하세요: ");
		String password = scan.next();
		
		if(id.equals("admin") && password.equals("1234")) {
			System.out.println("로그인되었습니다!");
		}else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다!");
		}
	}

}
