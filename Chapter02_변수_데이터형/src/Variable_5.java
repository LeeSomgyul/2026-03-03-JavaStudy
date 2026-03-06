import java.util.*;

public class Variable_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.next();
		
		System.out.print("성별: ");
		String gender = scan.next();
		
		System.out.print("나이: ");
		int age = scan.nextInt();
		
		System.out.print("키: ");
		double height = scan.nextDouble();
		
		System.out.print("카드 여부: ");
		boolean card = scan.nextBoolean();
		
		System.out.println("장바구니");
		int milk = 1200;
		int bread = 1500;
		int egg = 200;
		
		System.out.println("우유, 빵, 계란 각자 몇개씩 구매하였나요?(1 2 3): ");
		int m = scan.nextInt();
		int b = scan.nextInt();
		int e = scan.nextInt();
		
		int result = milk * m + bread * b + egg * e;
		System.out.println(name + "("+gender+") 님의 총 가격: " + result );
		
	}

}
