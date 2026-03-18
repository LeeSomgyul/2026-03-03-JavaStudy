
class Member{
	int mno;
	String name;
	static String company = "kakao";//회원 관련 회사는 1개 동일(즉 Member 모두가 같은 회사에 다님)
}

public class 클래스변수_설정 {

	public static void main(String[] args) {
		
		//1.각자 회원을 모두 다른곳에 저장
		Member m1 = new Member();
		m1.mno = 100;
		m1.name = "홍길동";
		
		Member m2 = new Member();
		m2.mno = 200;
		m2.name = "심청이";
		
		Member m3 = new Member();
		m3.mno = 300;
		m3.name = "케케크롱";
		
		System.out.println("회원 1 회원번호: " + m1.mno);
		System.out.println("회원 1 이름: " + m1.name);
		
		System.out.println("회원 2 회원번호: " + m2.mno);
		System.out.println("회원 2 이름: " + m2.name);
		
		System.out.println("회원 3 회원번호: " + m3.mno);
		System.out.println("회원 3 이름: " + m3.name);
		
		m1.name = "홍길자";
		System.out.println("회원 1 회원번호: " + m1.mno);
		System.out.println("회원 1 이름: " + m1.name);
		
		Member.company = "삼성";
		System.out.println("회원 1 회사명: " + m1.company);
		System.out.println("회원 2 회사명: " + m2.company);
	}

}
